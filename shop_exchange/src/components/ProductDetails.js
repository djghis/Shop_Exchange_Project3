import React from 'react'

const ProductDetails = (props) => {
    console.log(props);
    
  return (
    <div className="product-details">
      <p>name: {props.product.name} </p>
      <p>desc: {props.product.description} </p>
      <p>category: {props.product.category.name} </p>
      <p>status: {props.product.status} </p>
      <p>rent noditions: {props.product.rentCodnitions} </p>
      <p>replace status: {props.product.replaceStatus} </p>
      <p>qty:{props.product.qty}</p>
    </div>
  )
}

export default ProductDetails
