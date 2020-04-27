import React from 'react'
import User from './User' 

const UserList = (props) => {
    const users = props.users.map(user => {
        return <option value = {user.id}>{user.name}</option>
    })  
  return (
    <div>
        <span>Select user: </span>
        <select>
        { users }    
        </select>
    </div>
  )
}

export default UserList;
