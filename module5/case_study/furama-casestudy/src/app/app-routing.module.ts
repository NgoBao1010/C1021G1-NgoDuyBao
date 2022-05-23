import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {BodyComponent} from "./homepage/body/body.component";
import {ListEmployeeComponent} from "./employee/list-employee/list-employee.component";
import {ListServiceComponent} from "./service/list-service/list-service.component";
import {ListCustomerComponent} from "./customer/list-customer/list-customer.component";
import {CreateCustomerComponent} from "./customer/create-customer/create-customer.component";


const routes: Routes = [
  {path:'',component:BodyComponent},
  {path:'customer',component:ListCustomerComponent},
  {path:'employee',component:ListEmployeeComponent},
  {path:'service',component:ListServiceComponent},
  {path: 'customer/create', component:CreateCustomerComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
