import React, { Component } from 'react';
import ProductList from './Productlist'
class Product extends Component {
    render() {
        return (
            <div>
                <h1>Product Details Here</h1>
                <ProductList></ProductList>
            </div>
        );
    }
}

export default Product;