import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map, catchError } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private http: HttpClient) { }
  
  getCustomerDetails(accountNumber:String) {
    return this.http.get('http://localhost:8080/customer?Accno='+ accountNumber).pipe(
        map((data: any)=> {
            if (data['status'] != '201') {
            }
            return data;
        })
    );
}
}
