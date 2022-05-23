import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {CustomerService} from "../../../service/customer/customer.service";
import {CustomerType} from "../../model/customer/customer-type";
import {CustomerTypeService} from "../../../service/customer/customer-type.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {

  constructor(private customerService: CustomerService,
              private customerTypeService: CustomerTypeService,
              private route:Router) {
  }

  form: FormGroup = new FormGroup({
    id: new FormControl(''),
    name: new FormControl(''),
    customerCode: new FormControl(''),
    dateOfBirth: new FormControl(''),
    gender: new FormControl(''),
    idCard: new FormControl(''),
    phoneNumber: new FormControl(''),
    email: new FormControl(''),
    address: new FormControl(''),
    customerType: new FormControl('')
  })
  customerType: CustomerType[] = [];

  ngOnInit(): void {
    this.customerTypeService.getAllCustomerType().subscribe(data => {
      this.customerType = data;
    })
  }

  submit() {
    if(this.form.valid){
      this.customerService.create(this.form.value).subscribe(() =>{
        this.form.reset()
        this.route.navigateByUrl('/customer')
      })
    }
  }
}
