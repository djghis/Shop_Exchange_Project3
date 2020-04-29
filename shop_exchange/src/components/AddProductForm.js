import React, {Component} from 'react';
import Request from '../helpers/request';


class AddProductForm extends Component {
  constructor(props){
    super(props);
    this.state = {
      product: {
        name: "",
        description: "",
        price: 0,
        category: null,
        status: "",
        rentCondition: "",
        replaceStatus: ""
      },
      categories:[]
    }
    this.handleChange = this.handleChange.bind(this);
    this.handleCategory = this.handleCategory.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }
  handleChange(event){
    let propertyName = event.target.name;
    let product = this.state.product
    product[propertyName] = event.target.value;
    this.setState({product: product})
  }
  handleCategory(event){
    const index = parseInt(event.target.value)
    const selectedCategory = this.state.categories[index]
    let product = this.state.product;
    product['category'] = selectedCategory
    this.setState({product: product})
  }
  handleSubmit(event){
    event.preventDefault();
    this.handlePost(this.state.product);
  }

  //create a description
//assign description to product
//create as many product as needed using loop
handlePost(productDescription){
  const request = new Request();
  console.log(productDescription);
  
  request.post("/api/product_description", productDescription)
  };


  componentDidMount(){
    const request = new Request()
    request.get('/api/categories')
    .then((data) => {
        
        this.setState({
            categories:data
        })
        
    })
}


  render(){
    if(this.state.categories.length === 0 ){
       return <p>Loading...</p>
    }
    const categoryOptions = this.state.categories.map((category, index) => {
      return <option key={category.id} value={index}>{category.name}</option>
    });
    return (
      <div>
      <form onSubmit={this.handleSubmit}>
      <input type="text" placeholder="name" name="name" onChange={this.handleChange} value={this.state.product.name} />
      <input type="text" placeholder="description" name="description" onChange={this.handleChange} value={this.state.product.description} />
      <input type="number" placeholder="price" name="price" onChange={this.handleChange} value={this.state.product.price}/>
      <select name="category" onChange={this.handleCategory} defaultValue="select-category">
        <option disabled value="select-category">Select a category</option>
        {categoryOptions}
      </select>
      <select name ="status" onChange={this.handleChange} defaultValue="select-status">
        <option value="PRIVATE">Private</option>
        <option value="RENT">Rent</option>
        <option value="LEND">Lend</option>
      </select>
      <select name ="rentCondition" onChange={this.handleChange} defaultValue="select-rentCondition">
        <option value="CLEAN">Clean/Clean</option>
        <option value="DIRTY">Dirty/Dirty</option>
      </select>
      <select name ="replaceStatus" onChange={this.handleChange} defaultValue="select-replaceStatus">
        <option value="NEW">New for old</option>
        <option value="FEE">Pay fee</option>
      </select>
      <button type="submit">Save</button>
      </form>
      </div>
    )
  }
}
export default AddProductForm;