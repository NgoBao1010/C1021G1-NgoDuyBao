import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Todo} from "../module/todo";

@Injectable({
  providedIn: 'root'
})
export class TodoService {
  private API_URL = "http://localhost:3000/todo"
  constructor(private httpClient : HttpClient) {}
  getAll(): Observable<Todo[]> {
    return this.httpClient.get<Todo[]>(this.API_URL);
  }
  create(todo: Todo): Observable<Todo> {
    return this.httpClient.post<Todo>(this.API_URL, todo);
  }
  delete(id:number): Observable<Todo> {
    return this.httpClient.delete<Todo>(this.API_URL + '/' + id);
  }
  findById(id: number): Observable<Todo> {
    return this.httpClient.get<Todo>(this.API_URL + '/' + id);
  }
}
