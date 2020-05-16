import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CustomerService } from 'src/app/services/customer.service';



@Component({
  selector: 'app-customer-maintainance',
  templateUrl: './customer-maintainance.component.html',
  styleUrls: ['./customer-maintainance.component.css']
})
export class CustomerMaintainanceComponent implements OnInit {

  CustomerDetails: any = [];

  constructor(private formBuilder: FormBuilder,
              private customer: CustomerService) {
   }

  message:string;
  errorMessage:boolean = false;
  accountNumber:string;
  firstName:string;
  show:boolean;
  request:boolean;
  form: FormGroup;
  primaryAddress:string;


  ngOnInit() {
      this.form = this.formBuilder.group({
        accountNumber: ['', Validators.required],
        creditedOffice:  ['', Validators.required],
        firstName: ['', Validators.required],
        primaryAddress: ['', Validators.required],
        city:  ['', Validators.required],
        state:  ['', Validators.required],
        cntry:  ['', Validators.required],
        zipcode:  ['', Validators.required]
      });
  }

  getServices(){
    if(typeof this.accountNumber == "undefined"){
      this.errorMessage = true;
      this.message = "Please enter valid Account Number";
    }
      this.customer.getCustomerDetails(this.accountNumber).subscribe(
            data => {
              if(data.length > 0){
      this.CustomerDetails = data[0];
      console.log(this.CustomerDetails);
      this.firstName =  this.CustomerDetails.customerName;
      this.primaryAddress = this.CustomerDetails.primaryAddress;
    } else{
      this.errorMessage =  true;
    }
      });
    
    this.request = true;
    this.show = true;
    console.log("Button Clicked");
    console.log(this.accountNumber);
            
    }
  
    goback(){
      this.show = false;
      this.request = false;
    }

}
