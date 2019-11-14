import React, { Component } from 'react';

import '../css/Admin.css';
import LoginComponent from './LoginComponent';
import AdminInterface from './AdminInterface';

class Admin extends Component {
  constructor() {
    super();

    this.state = {
      artTitle: '',
      artDescription: '',
      artLink: '',
      songTitle: '',
      songArtist: '',
      songURI: '',
      songArtId: '',
      username: '',
      password: '',
      isLoggedIn: false,
      token: ''
    }
    this.login = this.login.bind(this)
  }

  login() {
    this.setState({
      isLoggedIn: true
    })
  }


  render() {
    return (
      <div className='adminPage'>
        {!this.state.isLoggedIn ?
          <LoginComponent login={this.login}/>
          : ''
        }
        {this.state.isLoggedIn ?
          <AdminInterface />
          : ''
        }
      </div>
    )
  }
}

export default Admin;
