import React, { Component } from 'react'
import Request from '../helpers/request'
import UserDetails from '../components/UserDetails'

class UserPageContainer extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         user: null
      }
    }
    
    componentDidMount() {
        const request = new Request()
        request.get(`/api/users/${this.props.match.params.id}`)
        .then((data)=>{
            this.setState({
                user:data
            })
        })
    }
    

  render() {
    return (
      <>
        <UserDetails user={this.state.user}/>
      </>
    )
  }
}

export default UserPageContainer

