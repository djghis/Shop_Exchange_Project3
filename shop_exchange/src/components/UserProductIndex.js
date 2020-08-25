import React from 'react'
import ProductDetails from './ProductDetails';

const UserProductIndex = (props) => {

    if (!props) {
        return <p>Loading....</p>
    }


    const productNodes = props.products.map((prod, index) => {
        return <ProductDetails key={index} product={prod} />
    })
    
  return (
    <div className="my-products-index">
    <h3>My Products</h3>
      {productNodes}
    </div>
  )

}

export default UserProductIndex

