import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SurveyCardsComponent } from './survey-cards.component';

describe('SurveyCardsComponent', () => {
  let component: SurveyCardsComponent;
  let fixture: ComponentFixture<SurveyCardsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SurveyCardsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SurveyCardsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
