import React, { Component } from 'react'
import Request from '../helpers/request'

class UserPageContainer extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         user: null
      }
    }
    
    componentDidMount() {
        console.log(this.props.match.params.id)
        const request = new Request()
        request.get(`/api/users/${this.props.match.params.id}`)
        .then((data)=>{
            console.log(data)
            this.setState({
                user:data
            })
        })
    }
    

  render() {
    return (
      <>
        <h1>User Page</h1>
      </>
    )
  }
}

export default UserPageContainer

