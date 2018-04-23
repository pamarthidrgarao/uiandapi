import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';
import { FormControl, FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  userForm: FormGroup;

  constructor(private userService:UserService,private fb: FormBuilder, private router:Router) { 
    this.createForm();
  }

  ngOnInit() {
  }

  createForm() {
    this.userForm = this.fb.group({
      firstName: ['', Validators.required ],
      lastName: ['', Validators.required ],
      email: ['', Validators.required ],
      password: ['', Validators.required ],
    });
  }

  addUser(){
    debugger
    let user=this.userForm.value;
    this.userService.saveUser(user).subscribe(data=>{
      if(data.success){
        this.router.navigate(['/login']);
      }
    });
  }
}
