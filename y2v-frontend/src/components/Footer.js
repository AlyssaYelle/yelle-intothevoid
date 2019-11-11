import React from 'react';
import '../css/Footer.css';

function Footer() {
  return (
    <div className='footer'>
      <footer>
        <div className='newsletter-signup'>
          Sign up for my newsletter!
        </div>
        <div className='logo'>
        </div>
        <div className='contact'>
          Contact me!
          <ul>
            <li><a href='mailto:alyssayellle@gmail.com'>email</a></li>
            <li><a href='https://alyssayelle.github.io/'>portfolio</a></li>
            <li><a href='https://github.com/alyssayelle'>github</a></li>
            <li><a href='https://www.linkedin.com/in/alyssayelle/'>linkedin</a></li>
          </ul>
        </div>
      </footer>
    </div>
  )
}

export default Footer;
