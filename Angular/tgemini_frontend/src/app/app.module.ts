import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { MatSliderModule , MatFormFieldModule, MatInputModule, MatTab } from '@angular/material';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { HeaderComponent } from './components/header/header.component';
import { CustomerMaintainanceComponent } from './components/customer-maintainance/customer-maintainance.component';
import { TgeminiComponent } from './components/tgemini/tgemini.component';
import { CustomerDetailsComponent } from './components/customer-details/customer-details.component';
import { MatTabsModule } from '@angular/material';

@NgModule({
  declarations: [
    AppComponent,
    CustomerMaintainanceComponent,
    HeaderComponent,
    TgeminiComponent,
    CustomerDetailsComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    NgbModule,
    BrowserAnimationsModule,
    MatSliderModule,
    MatFormFieldModule,
    MatInputModule,
    ReactiveFormsModule,
    FormsModule,
    MatTabsModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
