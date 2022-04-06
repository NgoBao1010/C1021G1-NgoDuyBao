import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  number1: number;
  number2: number;
  operator;
  result: number;

  addition() {
    this.operator = '+';
  }

  subtraction() {
    this.operator = '-';
  }

  multiplication() {
    this.operator = '*';
  }

  division() {
    this.operator = '/';
  }

  calculator(){
    switch (this.operator) {
      case '+':
        this.result = parseFloat(String(this.number1)) + parseFloat(String(this.number2))
        break;
      case '-':
        this.result = parseFloat(String(this.number1)) - parseFloat(String(this.number2))
        break;
      case '*':
        this.result = parseFloat(String(this.number1)) * parseFloat(String(this.number2))
        break;
      case '/':
        this.result = parseFloat(String(this.number1)) / parseFloat(String(this.number2))
        break;
    }
  }
  constructor() { }

  ngOnInit(): void {
  }

}
