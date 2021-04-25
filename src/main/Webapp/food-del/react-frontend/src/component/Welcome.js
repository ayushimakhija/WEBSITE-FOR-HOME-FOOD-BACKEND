import React, {Component} from "react";
import {Link} from 'react-router-dom';
import Search from './Search'
class Welcome extends Component {
    constructor(props) {
        super(props);

    }
    render() {
        return (
            <div className="Welcome">
                <div className="content">
                    <label className="logo"> Home delivery </label>
                    <h4>"This is website for Students who lives away from their home and are always craving for home food "</h4>
                    <h5>“Food for us comes from our relatives, whether they have wings or fins or roots. That is how we consider food. Food has a culture. It has a history. It has a story. It has relationships.”

                        – Winona LaDuke</h5>
                </div>
                <div className="Search">
                    <Search/>
                </div>

            </div>
        );
    }
}

export default Welcome
