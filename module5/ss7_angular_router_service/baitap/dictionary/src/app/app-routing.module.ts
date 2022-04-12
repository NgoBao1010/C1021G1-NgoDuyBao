import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListDictionaryComponent} from './dictionary/list-dictionary/list-dictionary.component';
import {DetailDictionaryComponent} from './dictionary/detail-dictionary/detail-dictionary.component';


const routes: Routes = [
  {path:'',component:ListDictionaryComponent},
  {path: 'dictionary/search/:keyword' ,component:DetailDictionaryComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
