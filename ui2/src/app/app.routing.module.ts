import { NgModule }              from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ChatboardComponent } from './chatboard/chatboard.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';

const appRoutes: Routes = [
    { path: 'chat', component: ChatboardComponent },
    { path: 'login',      component: LoginComponent },
    { path: 'signup',      component: SignupComponent },
    { path: '',
      redirectTo: '/login',
      pathMatch: 'full'
    }
  ];

  @NgModule({
    imports: [
      RouterModule.forRoot(
        appRoutes,
        { enableTracing: true } // <-- debugging purposes only
      )
    ],
    exports: [
      RouterModule
    ]
  })

  export class AppRoutingModule {

  }