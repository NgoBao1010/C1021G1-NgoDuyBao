import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {TodoService} from "../../service/todo.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-create-todo',
  templateUrl: './create-todo.component.html',
  styleUrls: ['./create-todo.component.css']
})
export class CreateTodoComponent implements OnInit {

  form: FormGroup;

  constructor(private todoService: TodoService, private router: Router) {
  }

  ngOnInit(): void {
    this.form = new FormGroup({
      id: new FormControl(),
      content: new FormControl(),
      complete: new FormControl(),
    });
    this.form.patchValue({
        complete: false
      }
    );
  }

  createTodo() {
    console.log(this.form.value);
    this.todoService.create(this.form.value).subscribe(() => {
      this.router.navigateByUrl('');
    });
  }

}
