import React, { Component } from 'react'
import UsersContainer from './UsersContainer'

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
            </div>
        )
    }
}

export default Homepage
