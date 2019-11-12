import React, { Component } from 'react';
import '../css/Footer.css';

class Footer extends Component {
  constructor() {
    super();

    this.state = {
      firstName: '',
      lastName: '',
      email: ''
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

  handleSubmit(event) {
    event.preventDefault();


    fetch('http://localhost:8181/newsletter/subscribe', {
      method: 'POST',
      headers: {
          'Content-Type': 'application/json'
      },
      body: JSON.stringify({
          firstName: this.state.firstName,
          lastName: this.state.lastName,
          email: this.state.email,

      })
    })
    .then((res) => {
      console.log(res);
      return res.json();
    })
    .then((res) => {
      console.log(this.state.firstName);
      console.log(this.state.lastName);
      console.log(this.state.email);
      alert("Thanks for signing up!")

      this.setState({
        firstName: '',
        lastName: '',
        email: ''
      })
    })
    .catch((err) => {
    	console.log('fetch unsuccessful');
        console.log(err);
    })

  }

  render() {
    return (
      <div className='footer'>
        <footer>
          <div className='newsletter-signup'>
            <form onSubmit={this.handleSubmit}>
              <label>
                <p>Sign up for my newsletter!</p>
                <input
                  id='firstNameInput'
                  type="text"
                  name="firstName"
                  placeholder='first name'
                  value={this.state.firstName}
                  onChange={this.handleInputChange}
                />
              </label>
              <label>
                <input
                  id='lastNameInput'
                  type="text"
                  name="lastName"
                  placeholder='last name'
                  value={this.state.lastName}
                  onChange={this.handleInputChange}
                />
              </label>
              <label>
                <input
                  id='emailInput'
                  type="text"
                  name="email"
                  placeholder='email'
                  value={this.state.email}
                  onChange={this.handleInputChange}
                />
              </label>
              <input id='submit' type="submit" value="Sign up!" />
            </form>
          </div>
          <div className='logo'>
            <img id='logo' src='https://github.com/AlyssaYelle/yelle-intothevoid/raw/master/y2v-frontend/src/Untitled-Artwork-1.png' alt='' />
          </div>
          <div className='contact'>
            <p>Contact me!</p>
            <ul>
              <li><a href='mailto:alyssayellle@gmail.com'>email</a></li>
              <li><a href='https://github.com/alyssayelle'>github</a></li>
            </ul>
          </div>
        </footer>
      </div>
    )
  }
}

export default Footer;
