import { Component, OnInit } from '@angular/core';
import {CustomerService} from "../../../service/customer/customer.service";
import {Customer} from "../../model/customer/customer";

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {

  customerId: number;
  customerList: Customer[];



  constructor(
    private customerService: CustomerService,
  ) {
  }

  ngOnInit(): void {
    this.customerService.getAll().subscribe(value => {
      this.customerList = value;
    })
  }

  getId(id: number) {
    this.customerId = id;
  }


  // delete() {
  //   this.customerService.delete(this.customerId).subscribe(data => {
  //     this.ngOnInit();
  //   });
  // }


}
