import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators, FormControl } from '@angular/forms';
import { MatTabsModule } from '@angular/material';

@Component({
  selector: 'app-tgemini',
  templateUrl: './tgemini.component.html',
  styleUrls: ['./tgemini.component.css']
})
export class TgeminiComponent implements OnInit {

  tgeminidetials: FormGroup;

  constructor() { }

  ngOnInit() {
  }
  onSubmit(value){
    console.log(value);
  }

}
