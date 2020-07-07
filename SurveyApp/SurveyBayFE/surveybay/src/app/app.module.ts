import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { NewSurveyFormComponent } from './components/new-survey-form/new-survey-form.component';
import { ViewResponsesComponent } from './components/view-responses/view-responses.component';
import { ModifyFormComponent } from './components/modify-form/modify-form.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { ClosedSurveysComponent } from './components/closed-surveys/closed-surveys.component';
import { OpenSurveysComponent } from './components/open-surveys/open-surveys.component';
import { LoginComponent } from './components/login/login.component';
import { SurveyCardsComponent } from './components/survey-cards/survey-cards.component';
import { RegisterComponent } from './components/register/register.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NewSurveyFormComponent,
    ViewResponsesComponent,
    ModifyFormComponent,
    NavbarComponent,
    ClosedSurveysComponent,
    OpenSurveysComponent,
    LoginComponent,
    SurveyCardsComponent,
    RegisterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
