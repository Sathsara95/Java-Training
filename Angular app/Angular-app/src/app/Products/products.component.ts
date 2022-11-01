import { Component, OnInit } from '@angular/core';
import products from '../../assets/products/products.json';
import {Router} from "@angular/router";

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.scss']
})
export class ProductsComponent implements OnInit {
  product:any[]=products;
  constructor(private router:Router) { }

  ngOnInit(): void {
  }



  loadCart(){
    if(true){
      this.router.navigate(['login']);
    }else{
      console.log("Customer Cart Page loaded!")
    }

  }

}
