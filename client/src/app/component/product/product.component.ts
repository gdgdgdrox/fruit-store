import { Component, OnInit } from '@angular/core';
import { ProductService } from '../../service/product.service';
import { Product } from '../../model/product';

@Component({
  selector: 'app-product',
  imports: [],
  templateUrl: './product.component.html',
  styleUrl: './product.component.css'
})
export class ProductComponent implements OnInit{
  constructor(private productService: ProductService){}
  products: Product[] = [];

  ngOnInit(): void {
    this.productService.getAllProducts().subscribe(
      {
        next: (value) => {
          console.log('response received');
          console.log(value);
          this.products = value;
        }
      }
    );
  }

}
