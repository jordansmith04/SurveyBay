import { Component, OnInit } from '@angular/core';
import { RegisterService } from '../../services/register.service';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { NewSurveyService } from '../../services/newsurvey.service';
import { User } from '../../models/Users';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Role } from 'src/app/models/Role';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  username : string;
  password : string;
  email : string;
  rolenum : number;

  registerFG = new FormGroup({
    username: new FormControl('', Validators.required),
    password: new FormControl('', Validators.required),
    email: new FormControl('', Validators.required)
  });

  constructor(
    private registerService : RegisterService,
  ) { }

  ngOnInit(): void {
  }
  
  public isHidden = true;

  //submit survey method
  submitRegistration(){

    if(this.registerFG.get('role').value == "coordinator"){
      this.rolenum = 1;
    } else this.rolenum = 2;

    this.user = new User(     0,
                                  this.registerFG.get('username').value,
                                  this.registerFG.get('password').value, 
                                  this.registerFG.get('email').value,
                                  new Role(this.rolenum, this.registerFG.get('role').value)
          );

    this.registerService.register(this.user).subscribe(result => {
        this.message = true;
        setTimeout(() =>
        {
          this.router.navigate(['home']);
        },
        3000);
    },
    error => {
      this.errorMessage = true;
    });
  }
}

}
