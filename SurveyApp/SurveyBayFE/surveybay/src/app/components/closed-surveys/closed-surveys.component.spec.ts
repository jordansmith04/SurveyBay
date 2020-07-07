import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ClosedSurveysComponent } from './closed-surveys.component';

describe('ClosedSurveysComponent', () => {
  let component: ClosedSurveysComponent;
  let fixture: ComponentFixture<ClosedSurveysComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ClosedSurveysComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ClosedSurveysComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
