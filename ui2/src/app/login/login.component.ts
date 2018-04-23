import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  email:string;
  password:string;

  constructor(private router:Router,private userService:UserService) { }

  ngOnInit() {
  }

  signin(){
    console.log("in");
    this.userService.findByMail(this.email);
  }
  signup(){
    console.log("up");
    this.router.navigate(['/signup']);
  }
}
