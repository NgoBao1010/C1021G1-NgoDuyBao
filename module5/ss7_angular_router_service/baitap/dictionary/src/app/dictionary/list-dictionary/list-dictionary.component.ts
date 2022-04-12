import { Component, OnInit } from '@angular/core';
import {Dictionary} from '../../model/dictionary';
import {DictionaryService} from '../../service/dictionary.service';

@Component({
  selector: 'app-list-dictionary',
  templateUrl: './list-dictionary.component.html',
  styleUrls: ['./list-dictionary.component.css']
})
export class ListDictionaryComponent implements OnInit {
  dictionaryList: Dictionary[];
  constructor(private dictionaryService: DictionaryService) { }

  ngOnInit(): void {
    this.dictionaryList = this.dictionaryService.getAll();
  }

}
