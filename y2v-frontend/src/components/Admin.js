import React, { Component } from 'react';

import '../css/Admin.css';
import LoginComponent from './LoginComponent';
import AdminInterface from './AdminInterface';

class Admin extends Component {
  constructor() {
    super();

    this.state = {
      isLoggedIn: false,
      token: '',
      art: [],
      music: [],
      artTitle: '',
      artDescription: '',
      artLink: '',
      songTitle: '',
      songArtist: '',
      songURI: '',
      songArtId: ''
    }
  }
  render() {
    return (
      <div className='adminPage'>
        <LoginComponent />
        <AdminInterface />
      </div>
    )
  }
}

export default Admin;
