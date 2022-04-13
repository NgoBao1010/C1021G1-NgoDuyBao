import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {ProductService} from "../../service/product.service";
import {CategoryService} from "../../service/category.service";
import {Category} from "../../model/category";
import {Route, Router} from "@angular/router";

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {
  productForm: FormGroup = new FormGroup({
    id:new FormControl(),
    productName: new FormControl(),
    price: new FormControl(),
    description: new FormControl(),
    category: new FormControl()
  })
  categories: Category[] = [];
  constructor(private route:Router,
    private productService: ProductService,
              private categoryService: CategoryService) { }

  ngOnInit(): void {
    this.getAllCategory();
  }
  getAllCategory() {
    this.categoryService.getAll().subscribe(categories => {
      this.categories = categories;
    });
  }
  submit() {
    const product = this.productForm.value;
    product.categories = {
      id:product.categories
    };
    this.productService.saveProduct(product).subscribe(()=>{
      alert('Create Success');
      this.productForm.reset();
      this.route.navigateByUrl('');
    },e => console.log(e));

  }

}
