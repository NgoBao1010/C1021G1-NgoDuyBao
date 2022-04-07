import {Component, EventEmitter, Input, OnInit, Output, SimpleChanges} from '@angular/core';

@Component({
  selector: 'app-countdown-time',
  templateUrl: './countdown-time.component.html',
  styleUrls: ['./countdown-time.component.css']
})
export class CountdownTimeComponent implements OnInit {
  message: string;
  remainingTime: number;
  @Input()
  seconds = 10;
  @Output()
  finish = new EventEmitter<any>();
  private intervalId = 0;

  ngOnChanges(changes: SimpleChanges) {
    if ('seconds' in changes) {
      let v = changes.seconds.currentValue;
      v = typeof v === 'undefined' ? 11 : v;
      const vFixed = Number(v);
      this.seconds = Number.isNaN(vFixed) ? 11 : vFixed;
    }
  }

  clearTimer() {
    clearInterval(this.intervalId);
  }

  ngOnInit() {
    this.reset();
  }

  ngOnDestroy() {
    this.clearTimer();
  }

  start() {
    this.countDown();
    if (this.remainingTime <= 0) {
      this.remainingTime = this.seconds;
    }
  }

  stop() {
    this.clearTimer();
    this.message = `Dừng ở ${this.remainingTime} giây`;
  }

  reset() {
    this.clearTimer();
    this.remainingTime = this.seconds;
    this.message = `Ấn nút Start để bắt đầu đếm ngược`;
  }

  private countDown() {
    this.clearTimer();
    this.intervalId = window.setInterval(() => {
      this.remainingTime -= 1;
      if (this.remainingTime === 0) {
        this.message = 'Hết giờ!';
        this.clearTimer();
        this.finish.emit(true);
      } else {
        this.message = `${this.remainingTime} giây đếm ngược`;
      }
    }, 1000);
  }
  constructor() { }



}
