import { Injectable } from '@angular/core';
import {Dictionary} from '../model/dictionary';

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {
  dictionaryList: Dictionary[] = [
    {
    keyword: "hello",
    translate: "Xin chào"
  },
    {
      keyword: "goodbye",
      translate: "Chào tạm biệt"
    },
    {
      keyword: "car",
      translate: "ô tô"
    },
    {
      keyword: "book",
      translate: "Quyển sách"
    },
    {
      keyword: "notebook",
      translate: "Vở"
    }
  ]

  constructor() { }
  getAll(){
    return this.dictionaryList;
  }

  searchMean(keyword: string){
    for (let index in this.dictionaryList){
      if (this.dictionaryList[index].keyword === keyword){
        return this.dictionaryList[index];
      }
    }
  }

}
