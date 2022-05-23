import {CustomerType} from "./customer-type";

export interface Customer {
  id: number;
  customerCode: string;
  name: string;
  gender:string;
  dateOfBirth: string;
  idCard: string;
  phoneNumber: string;
  email: string;
  address: string;
  customerType: CustomerType;

}
