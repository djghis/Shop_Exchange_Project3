import React from 'react';

const AdminUserList = (props) => {
        const users = props.users.map((user, index) => {
            return <li key={index}>{user.name}</li>
        })  
      return (
        <div>
            <ul>
           {/* <a href={}> { users }  </a>   */}
           {users}
            </ul>
        </div>
      )
    }
    

export default AdminUserList;