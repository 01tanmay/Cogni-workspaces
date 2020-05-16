import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TgeminiComponent } from './tgemini.component';

describe('TgeminiComponent', () => {
  let component: TgeminiComponent;
  let fixture: ComponentFixture<TgeminiComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TgeminiComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TgeminiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
