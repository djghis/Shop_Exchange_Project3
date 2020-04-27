import React from 'react'

const UserList = (props) => {
    const users = props.users.map((user, index) => {
        return <option value = {user.id} key={user.id}>{user.name}</option>
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
