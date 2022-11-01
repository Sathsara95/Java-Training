import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { LoginComponent } from './Login/login.component';
import {RouterModule} from "@angular/router";
import { RegisterComponent } from './Register/register.component';
import { ProductsComponent } from './Products/products.component';
import {FormsModule} from "@angular/forms";


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    ProductsComponent,

  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot([
      {path:'login', component:LoginComponent},
      {path:'register',component:RegisterComponent},
      {path:'product', component:ProductsComponent},
      {path:'', redirectTo:'login', pathMatch:'full'}

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
