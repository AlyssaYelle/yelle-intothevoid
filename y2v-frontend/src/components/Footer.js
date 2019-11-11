import React from 'react';
import '../css/Footer.css';

function Footer() {
  return (
    <div className='footer'>
      <footer>
        <div className='newsletter-signup'>
          <form>
            <label>
              <p>Sign up for my newsletter!</p>
              <input type="text" name="fname" placeholder='first name'/>
            </label>
            <label>
              <input type="text" name="lname" placeholder='last name'/>
            </label>
            <label>
              <input type="text" name="email" placeholder='email'/>
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

export default Footer;
