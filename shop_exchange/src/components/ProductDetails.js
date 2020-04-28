import React from 'react'

const ProductDetails = (props) => {
    console.log(props);
    
  return (
    <div>
      <span>{props.product.name} </span>
      <span>qty:{props.product.qty}</span>
    </div>
  )
}

export default ProductDetails
