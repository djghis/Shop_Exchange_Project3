import React from 'react'
import ProductDetails from './ProductDetails';

const BorrowedProductList = (props) => {

    if (props.products.length === 0) {
        return <p>You do not have borrowed products!</p>
    }

    
    const productNodes = props.products.map((prod, index) => {
        return <ProductDetails key={index} product={prod.product} />
    })
    
  return (
    <div className="borrowed-products-index">
    <h3>Borrowed Products</h3>
      {productNodes}
    </div>
  )

}

export default BorrowedProductList