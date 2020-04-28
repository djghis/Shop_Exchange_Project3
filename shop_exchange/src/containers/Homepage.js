import React, { Component } from 'react'
import UsersContainer from './UsersContainer'
import AdminContainer  from './AdminContainer'

export class Homepage extends Component {
    
    constructor(props) {
        super(props)
    
        this.state = {
             
        }
    }
    
    render() {
        return (
            <div>
                <button className="admin-button">Admin</button>
                <UsersContainer />
                <AdminContainer/>
            </div>
        )
    }
}

export default Homepage
