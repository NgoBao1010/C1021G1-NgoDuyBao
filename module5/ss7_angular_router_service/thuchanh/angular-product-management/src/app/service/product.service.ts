import { Injectable } from '@angular/core';
import {Product} from "../model/product";

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  products: Product[] = [{
    id: 1,
    productName: 'IPhone 12',
    price: 2400000,
    description: 'New'
  }, {
    id: 2,
    productName: 'IPhone 11',
    price: 1560000,
    description: 'Like new'
  }, {
    id: 3,
    productName: 'IPhone X',
    price: 968000,
    description: '97%'
  }, {
    id: 4,
    productName: 'IPhone 8',
    price: 7540000,
    description: '98%'
  }, {
    id: 5,
    productName: 'IPhone 11 Pro',
    price: 1895000,
    description: 'Like new'
  }];
  constructor() { }
  getAll() {
    return this.products;
  }
  save(product){
    this.products.push(product);
  }
  update(id:number,product:Product){
    for (let index in this.products){
      if (this.products[index].id === id){
        this.products[index] = product;
      }
    }
  }
  findById(id:number){
    return this.products.find(product => product.id === id);
  }
  delete(id:number){
    this.products.splice(id,1);
  }
}
