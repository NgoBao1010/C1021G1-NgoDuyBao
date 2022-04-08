import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';


@Component({
  selector: 'app-register-form',
  templateUrl: './register-form.component.html',
  styleUrls: ['./register-form.component.css']
})
export class RegisterFormComponent implements OnInit {
  register: FormGroup;
  constructor(private fb: FormBuilder) {

    this.register = fb.group({
      email:['',[Validators.email,Validators.required]],
      password: ['', [Validators.required],[Validators.minLength(16)]],
      confirmPassword: ['', [Validators.required],[Validators.minLength(16)]],
      country:['',[Validators.required]],
      age:['',[Validators.required,Validators.min(18)]],
      gender:['',Validators.required],
      phone:['',[Validators.required,Validators.pattern("/^\\+84\\d{9,10}$/")]]
    }, {
      validator: this.ConfirmedValidator('password', 'confirmPassword')
    })
  }
  ngOnInit(): void {
  }

  // ngOnInit(): void {
  //   // @ts-ignore
  //   this.register = new FormGroup({
  //     email: new FormControl("",[Validators.email,Validators.required]),
  //     password: new FormControl("",[Validators.required,Validators.minLength(6)]),
  //     confirmPassword: new FormControl("",[Validators.required,Validators.minLength(6),this.ConfirmedValidator('password', 'confirmPassword')]),
  //     country: new FormControl("",Validators.required),
  //     age: new FormControl("",[Validators.required,Validators.min(18)]),
  //     gender:new FormControl("",Validators.required),
  //     phone:new FormControl("",[Validators.required,Validators.pattern("/^\\+84\\d{9,10}$/")])
  //   })
  // }
  ConfirmedValidator(controlName: string, matchingControlName: string) {
    return (formGroup: FormGroup) => {
      const control = formGroup.controls[controlName];
      const matchingControl = formGroup.controls[matchingControlName];
      if (matchingControl.errors && !matchingControl.errors.confirmedValidator) {
        return;
      }
      if (control.value !== matchingControl.value) {
        matchingControl.setErrors({ confirmedValidator: true });
      } else {
        matchingControl.setErrors(null);
      }
    }

  }
  submit() {
    console.log(this.register.value);
  }
}
