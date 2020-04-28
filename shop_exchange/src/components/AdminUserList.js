import React from 'react';

const AdminUserList = (props) => {
        const users = props.users.map((user, index) => {
            return <li key={user.id}>{user.name}</li>
        })  
      return (
        <div>
            <ul>
            { users }    
            </ul>
        </div>
      )
    }
    

export default AdminUserList;