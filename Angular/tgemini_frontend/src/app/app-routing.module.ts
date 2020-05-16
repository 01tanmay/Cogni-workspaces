import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CustomerMaintainanceComponent } from './components/customer-maintainance/customer-maintainance.component';
import { TgeminiComponent } from './components/tgemini/tgemini.component';
import { CustomerDetailsComponent } from './components/customer-details/customer-details.component';


const routes: Routes = [
   {path: '', redirectTo: 'customer', pathMatch: 'full'},
   {path: 'customer', component: CustomerMaintainanceComponent},
   {path: 'tgemini', component: TgeminiComponent},
   {path: 'customer-details', component: CustomerDetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
