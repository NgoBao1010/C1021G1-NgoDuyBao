import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './homepage/header/header.component';
import { FooterComponent } from './homepage/footer/footer.component';
import { BodyComponent } from './homepage/body/body.component';
import { ListEmployeeComponent } from './employee/list-employee/list-employee.component';
import { ListServiceComponent } from './service/list-service/list-service.component';
import { ListCustomerComponent } from './customer/list-customer/list-customer.component';
import {HttpClientModule} from "@angular/common/http";
import { CreateCustomerComponent } from './customer/create-customer/create-customer.component';
import {ReactiveFormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    BodyComponent,
    ListEmployeeComponent,
    ListServiceComponent,
    ListCustomerComponent,
    CreateCustomerComponent,

  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        HttpClientModule,
        ReactiveFormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
