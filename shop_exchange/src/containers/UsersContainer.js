import React, { Component } from 'react'
import Request from '../helpers/request';


export class UsersContainer extends Component {

    constructor(props) {
        super(props)
        this.state = {
             users:[]
        }
    }

    componentDidMount() {
        const request = new Request()
        request.get('/api/users')
        .then((data)=>{
            
            
            this.setState({
                users:data
            })
        })
    }
    

    render() {
        return (
            <div>
                
            </div>
        )
    }
}

export default UsersContainer
