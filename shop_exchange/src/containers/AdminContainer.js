import React, {Component} from 'react';
import Request from '../helpers/request';
import AdminUserList from '../components/AdminUserList';


class AdminContainer extends Component {

    constructor(props) {
        super(props);
        this.state = {
            users:[]
        }
    }

    componentDidMount(){
        const request = new Request()
        request.get('api/users')
        .then((data) => {
            this.setState({
                users:data
            })
            
        })
    }

    render(){
        return (
            <>
                <AdminUserList users = {this.state.users}/>
            </>
        )
    }
}

export default AdminContainer;