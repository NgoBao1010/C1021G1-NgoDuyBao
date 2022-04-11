import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  form:FormGroup;
  constructor() { }

  ngOnInit(): void {
    this.form = new FormGroup({
      email:new FormControl('',[Validators.email,Validators.required]),
      password: new FormControl('',[Validators.minLength(6),Validators.required])
    })
  }

  submit() {
    console.log(this.form.value);
  }
}
