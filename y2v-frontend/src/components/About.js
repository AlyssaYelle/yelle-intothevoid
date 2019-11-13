import React from 'react';

import '../css/About.css';

function About() {
  return (
    <div className='component'>
      <article>
        <div className='portrait-here'></div>
        <div className='details'>
          <h2>Hey! Welcome to my art portfolio!</h2>
        </div>

        <p>
          I'm an artist and software engineer based in Brooklyn and this website is my capstone project for the American Express Developer Academy.
        </p>
        <p>
          This site is powered by React on the front end, and Java/Spring Boot on the back end. The back end consists of two services -- newsletter, and general site services.
          A general visitor to the site can POST their data to the newsletter if they so desire, and they can GET data (art and songs paired with the art) from the general site services.
          An administrator for the site can do anything a general visitor can, plus they can log in to their admin account and add new art and music.
        </p>
        <p>
          The code for this site lives on my <a className='articleLink' href='https://github.com/AlyssaYelle/yelle-intothevoid'>github</a> if you'd like to look at it!
          If you're just interested in the front end, that code is <a className='articleLink' href='https://github.com/AlyssaYelle/yelle-intothevoid/tree/master/y2v-frontend'>here</a>.
          Alternatively, if you care more about the back end, that code is <a className='articleLink' href='https://github.com/AlyssaYelle/yelle-intothevoid/tree/master/full-backend'>here</a>.
        </p>

      </article>
    </div>
  )
}

export default About;
