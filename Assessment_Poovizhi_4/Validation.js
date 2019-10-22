import React, { Component } from 'react';
import './LoginForm.css'

class Validation extends Component {
    constructor(props) {
        super(props);
        this.state=({
            quantityOnHand:'',
            errors:{
                quantityOnHand:''}
        })
        this.doValidation=this.doValidation.bind(this)
    }
    doValidation=(e)=>{
        e.preventDefault()
        const {name,value}=e.target
        let errors=this.state.errors
        switch(name)
        {
            case 'quantityOnHand':
             errors.quantityOnHand=value.length<0?'Quantity should not be empty':''
             break
        default:break
        }
    }
    
    render() {
        return (
                    <form onSubmit={this.doValidation}>
                Enter ProductId:
                        <input type="text" name="productId"/>

                Enter QuantityOnHand:
                        <input type="text" name="quantityOnHand" onChange={this.doValidation}/>
                        {this.state.errors.quantityOnHand}
                        <input type="submit" />
                    
                    </form>
            )
        };

}

export default Validation;
