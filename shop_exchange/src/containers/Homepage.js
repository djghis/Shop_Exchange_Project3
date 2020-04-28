import React, { Component } from 'react'
import UsersContainer from './UsersContainer'
import UserPageContainer from './UserPageContainer'

export class Homepage extends Component {
    
    constructor(props) {
        super(props)
    
        this.state = {
             
        }
    }
    
    render() {
        return (
            <div>
                {/* <button className="admin-button">Admin</button> */}
                {/* <UsersContainer /> */}
                <UserPageContainer />
            </div>
        )
    }
}

export default Homepage
