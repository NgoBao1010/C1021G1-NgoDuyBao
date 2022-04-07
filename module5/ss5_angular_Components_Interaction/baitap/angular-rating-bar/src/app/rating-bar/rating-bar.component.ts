import {Component, EventEmitter, Input, OnInit, Output, SimpleChanges} from '@angular/core';
import {IRatingUnit} from './i-rating-unit';

@Component({
  selector: 'app-rating-bar',
  templateUrl: './rating-bar.component.html',
  styleUrls: ['./rating-bar.component.css']
})
export class RatingBarComponent implements OnInit {
  @Input()
  max = 10;
  @Input()
  rating = 5;
  @Input()
  showRating = true;

  @Output()
  rateChange = new EventEmitter<any>();
  ratingUnits: Array<IRatingUnit> = [];

  ngOnChanges(changes: SimpleChanges) {
    if ('max' in changes) {
      let max = changes.max.currentValue;
      max = typeof max === 'undefined' ? 5 : max;
      this.max = max;
      this.calculate(max, this.rating);
    }
  }

  calculate(max, ratingValue) {
    this.ratingUnits = Array.from({length: max},
      (_, index) => ({
        value: index + 1,
        active: index < ratingValue
      }));
  }

  ngOnInit() {
    this.calculate(this.max, this.rating);
  }

  select(index) {
    this.rating = index + 1;
    this.ratingUnits.forEach((item, idx) => item.active = idx < this.rating);
    this.rateChange.emit(this.rating);
  }
  enter(index) {
    this.ratingUnits.forEach((item, idx) => item.active = idx <= index);
  }
  reset() {
    this.ratingUnits.forEach((item, idx) => item.active = idx < this.rating);
  }
  constructor() { }


}
