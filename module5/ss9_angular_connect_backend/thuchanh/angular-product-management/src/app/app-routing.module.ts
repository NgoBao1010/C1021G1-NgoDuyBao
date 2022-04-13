import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ProductListComponent} from "./product/product-list/product-list.component";
import {ProductCreateComponent} from "./product/product-create/product-create.component";
import {ProductUpdateComponent} from "./product/product-update/product-update.component";
import {ProductDeleteComponent} from "./product/product-delete/product-delete.component";
import {ListCategoryComponent} from "./category/list-category/list-category.component";
import {CreateCategoryComponent} from "./category/create-category/create-category.component";
import {EditCategoryComponent} from "./category/edit-category/edit-category.component";
import {DeleteCategoryComponent} from "./category/delete-category/delete-category.component";


const routes: Routes = [{
  path: '',
  component: ProductListComponent
},
  {
    path:'product/create',
    component: ProductCreateComponent
  },
  {
    path:'product/edit/:id',
    component: ProductUpdateComponent
  },
  {
    path:'product/delete/:id',
    component: ProductDeleteComponent
  },
  {
    path: 'category/list',
    component: ListCategoryComponent
  },
  {
    path: 'category/create',
    component: CreateCategoryComponent
  },
  {
    path: 'category/edit/:id',
    component: EditCategoryComponent
  },
  {
    path: 'category/delete/:id',
    component: DeleteCategoryComponent
  },
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
