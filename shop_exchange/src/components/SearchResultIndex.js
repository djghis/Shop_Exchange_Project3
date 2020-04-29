import React from 'react';
import BorrowProductsDetails from './BorrowProductsDetails';


const SearchResultIndex = (props) => {
    if (!props) {
        return <p>Search for products</p>
    }

    const countProducts = (products) => {
        const formatted = {}
        for (let product of products){
            if (Object.keys(formatted).includes(product.productDescription.id.toString())){
                formatted[product.productDescription.id] += 1
            } else {
                formatted[product.productDescription.id] = 1
            }
        }
        return formatted
    }


    const formatProducts = (products) => {
        const result = [];
        const map = new Map();
        const productCount = countProducts(products)
        console.log(productCount);
        for (const product of products) {
            if(!map.has(product.productDescription.id)){
                 map.set(product.productDescription.id, true);
                result.push({
                     name: product.productDescription.name,
                     description: product.productDescription.description,
                     category: product.productDescription.category,
                     status: product.productDescription.status,
                     rentCondition: product.productDescription.rentCondition,
                     replaceStatus: product.productDescription.replaceStatus,
                     qty: productCount[product.productDescription.id]
                    });
                 }
            }
      return result  
    }

    const productNodes = formatProducts(props.products).map((prod, index) => {
        return <BorrowProductsDetails key={index} product={prod} />
    })
    
  return (
    <div className="my-products-index">
      {productNodes}
    </div>
  )

}
 
export default SearchResultIndex;