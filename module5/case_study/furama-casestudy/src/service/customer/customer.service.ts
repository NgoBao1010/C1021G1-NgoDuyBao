import {Inject, Injectable} from '@angular/core';
import {Observable} from 'rxjs';
import {HttpClient} from '@angular/common/http';
import {Customer} from "../../app/model/customer/customer";

@Injectable({providedIn: 'root'})
export class CustomerService {
  private baseURL = 'http://localhost:3000/customer';

  constructor(
    private http: HttpClient
  ) {
  }


  getAll(): Observable<Customer[]> {
    return this.http.get<Customer[]>(this.baseURL);
  }

  create(customer): Observable<Customer> {
    return this.http.post<Customer>(this.baseURL, customer);
  }

  findById(id: number): Observable<Customer> {
    return this.http.get<Customer>(this.baseURL + '/' + id);
  }

  updateCustomer(id: number, customers: Customer): Observable<Customer> {
    return this.http.put<Customer>(this.baseURL + '/' + id, customers);
  }
}
