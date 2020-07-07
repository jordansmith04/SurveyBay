import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OpenSurveysComponent } from './open-surveys.component';

describe('OpenSurveysComponent', () => {
  let component: OpenSurveysComponent;
  let fixture: ComponentFixture<OpenSurveysComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OpenSurveysComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OpenSurveysComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
