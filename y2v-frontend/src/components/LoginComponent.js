import React, { Component } from 'react';

import '../css/Admin.css';

class LoginComponent extends Component {
  constructor() {
    super();

    this.state = {
      username: '',
      password: ''
    }

    this.handleInputChange = this.handleInputChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleInputChange(event) {
    const target = event.target;
    const value = target.value;
    const name = target.name;

    this.setState({
        [name]: value
    });
  }

  // probably should actually add this to parent class and call as props
  handleSubmit(event) {
    event.preventDefault();

    fetch('http://localhost:8282/admin/login', {
      method: 'POST',
      headers: {
          'Content-Type': 'application/json'
      },
      body: JSON.stringify({
          username: this.state.username,
          password: this.state.password
      })
    })
    .then((res) => {
      console.log(res);
      return res.json();
    })
    .then((res) => {
      alert("Successfully logged in!")

      this.setState({
        username: '',
        password: ''
      })
    })
    .catch((err) => {
      console.log('fetch unsuccessful');
        console.log(err);
    })
  }

  render(props) {
    return (
      <div className='LoginComponent'>
        <form onSubmit={this.handleSubmit}>
          <label>
            <p>Administrator login</p>
            <input
              id='username'
              type="text"
              name="username"
              placeholder='username'
              value={this.state.username}
              onChange={this.handleInputChange}
            />
          </label>

          <label>
            <input
              id='password'
              type="password"
              name="password"
              placeholder='password'
              value={this.state.password}
              onChange={this.handleInputChange}
            />
          </label>

          <input id='submit' type="submit" value="log in" />
        </form>
      </div>
    )
  }
}

export default LoginComponent;
