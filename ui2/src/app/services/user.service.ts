import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

import {Observable} from 'rxjs/Rx';
import { User } from '../dto/user';
import {UserResponse} from '../dto/user-response'


@Injectable()
export class UserService {

  constructor(private http:HttpClient) { }

  saveUser(user:User):Observable<UserResponse>{
    debugger
    return this.http.post<UserResponse>('/saveOrUpdate',user);
  }

  findByMail(email:string):Observable<UserResponse>{
    debugger
    const url='/findByMail?email='+email;
    return this.http.get<UserResponse>(url);
  }

}
