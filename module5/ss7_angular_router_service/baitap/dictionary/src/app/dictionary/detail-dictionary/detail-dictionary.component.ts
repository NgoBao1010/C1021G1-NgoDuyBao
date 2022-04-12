import { Component, OnInit } from '@angular/core';
import {Dictionary} from '../../model/dictionary';
import {DictionaryService} from '../../service/dictionary.service';
import {ActivatedRoute, ParamMap} from '@angular/router';

@Component({
  selector: 'app-detail-dictionary',
  templateUrl: './detail-dictionary.component.html',
  styleUrls: ['./detail-dictionary.component.css']
})
export class DetailDictionaryComponent implements OnInit {
  keyword: string;
  translate: Dictionary;
  constructor(private dictionaryService:DictionaryService,
              private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap)=>{
      this.keyword = paramMap.get('keyword')
      this.translate = this.dictionaryService.searchMean(this.keyword);
    })
  }

}
