import React, { Component } from 'react';
import Productdisplay from './Productdisplay';
import { BrowserRouter as Router, Route, Link } from "react-router-dom";
import ProductDetails from './ProductDetails';
class stockUpdate extends Component {
    constructor(props) {
        super(props)
        this.state = {
            quantityOnHand:'',
            errors:{
                quantityOnHand:''},
            productList: [
                {
                    productId: 1001,
                    productName: 'Watch',
                    quantityOnHand: 2000,
                    price: 10000
                },
                {
                    productId: 1002,
                    productName: 'Mouse',
                    quantityOnHand: 29,
                    price: 180000
                },
                {
                    productId: 1003,
                    productName: 'Laptop',
                    quantityOnHand: 29,
                    price: 122
                },
                {
                    productId: 10113,
                    productName: 'Presenter',
                    quantityOnHand: 29,
                    price: 122
                },

                {
                    productId: 111003,
                    productName: 'Marker',
                    quantityOnHand: 29,
                    price: 122
                },
            ]
        }
    }
    doValidation=(e)=>{
        e.preventDefault()
        const {name,value}=e.target
        let errors=this.state.errors
        switch(name)
        {
            case 'quantityOnHand':
             errors.quantityOnHand=value.length<0?'Quantity should not be negative':''
             break
        default:break
        }
        this.setState({
            errors,[name]:value
        })
    }
    updateStock = (e) => {
        e.preventDefault()
        let productList = this.state.productList
        let toUpdateProductId = this.refs.productId.value
        let toUpdateQuantityOnHand = this.refs.quantityOnHand.value
        console.log(toUpdateQuantityOnHand)
        let updateProduct
        productList.map((product, index) => {
            if (product.productId == toUpdateProductId) {
                 updateProduct = this.state.productList[index]
 //               console.log(updateProduct.quantityOnHand)
                updateProduct.quantityOnHand = toUpdateQuantityOnHand
            }
        }
        )
        this.updateProductMethod(toUpdateProductId, toUpdateQuantityOnHand)

    }

    updateProductMethod(toUpdateProductId, toUpdateQuantityOnHand) 
    {
        var arr = this.state.productList
        arr[toUpdateProductId].productList.quantityOnHand = toUpdateQuantityOnHand
        this.setState({
            productList: arr
        })
    }


    render() {
        let productList = this.state.productList
        return (
            <div>
                  <form onSubmit={this.doValidation}>
                Enter ProductId:
                        <input type="text" name="productId" ref="productId"/>

                Enter QuantityOnHand:
                        <input type="text" name="quantityOnHand" ref="quantityOnHand"
                        onChange={this.doValidation}/>
                        {this.state.errors.quantityOnHand}
                        <button onClick={(e) => this.updateStock(e)}>Update Stock</button>
                </form>
                {this.state.productList.map((product, index) =>
                    <Link to={`${this.props.match.url}/` + product.productName}>
                        <Productdisplay render={({ match }) => match = { match }}
                            nn={index}
                            key={index}
                            product={product}
                        ></Productdisplay>
                    </Link>

                )}
                <Route path={`${this.props.match.path}/:productName`}
                    render={({ match }) => match = { match }}
                    component={ProductDetails} />
            </div>

        );
    }
}
export default stockUpdate;
