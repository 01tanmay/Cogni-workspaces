import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomerMaintainanceComponent } from './customer-maintainance.component';

describe('CustomerMaintainanceComponent', () => {
  let component: CustomerMaintainanceComponent;
  let fixture: ComponentFixture<CustomerMaintainanceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CustomerMaintainanceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomerMaintainanceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
