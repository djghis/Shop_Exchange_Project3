import React from 'react';
import './App.css';
import Homepage from './containers/Homepage';
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import NavBar from './components/navbar'
import UserPageContainer from './containers/UserPageContainer'


function App() {
  return (
    <Router >
      <React.Fragment>
         <NavBar/>
         <Switch>
         <Route exact path="/" component={Homepage} />
         <Route exact path="/user/:id" component={UserPageContainer}/>
        </Switch>
     </React.Fragment>
    </Router>
  );
}

export default App;
