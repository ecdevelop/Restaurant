import React, { useReducer } from 'react';
import UserService  from '../services/UserService';

class UserComponent extends React.Component{
    constructor(){
        super();
        this.state = {
            users:[]
        }
    }
    componentDidMount(){
        UserService.getUsers().then((response) =>{
            this.setState({users: response.data})
        })
    }
    render(){
        return(
            <div> 
                <h1 className = "text-center" > Restaurant List</h1>
                <table className = "table table-striped">
                    <thead>
                         <tr>
                                <td> Restaurant Id</td>
                                <td> Restaurant Name</td>
                                <td> Restaurant Type</td>
                                
                        </tr>
                    </thead>
                <tbody>
                    {
                        this.state.users.map(
                        user => 
                        <tr key ={user.id}>
                            <td>{user.restId}</td>
                            <td>{user.restName}</td>
                            <td>{user.restDesc}</td>
                            
                        </tr>
                        )
                    }
                </tbody>

                </table>
            </div>
        )
    }
}
export default UserComponent;