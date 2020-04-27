import React from 'react'
import User from './User' 

const UserList = (props) => {
    const users = props.users.map(user => {
        return <User name = {user.name} />
    })  
  return (
    <>
      { users }
    </>
  )
}

export default UserList;
