import React ,{Component} from 'react';

class Menu extends React.Component{

    constructor(){
        super();
        this.state = {
            users:[]
        }
    }

    render(){
        return(
            <div>
                <input type = 'button' name = 'btnSubmit' value='Submit'   />
            </div>
        )
    }
}
export default Menu;