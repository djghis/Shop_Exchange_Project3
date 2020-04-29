import React from 'react'
import { Link } from "react-router-dom";


const UserList = (props) => {
    const users = props.users.map((user, index) => {
        return <li>
          <Link to={`/user/${user.id}`}>{user.name}</Link>
          </li>
    })  
  return (
    <div>
        <span>Select user: </span>
        <ul className="user-select" >
        { users }    
        </ul>
    </div>
  )
}

export default UserList;
