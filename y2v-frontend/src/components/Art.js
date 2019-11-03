import React, { Component } from 'react';
import '../css/Art.css';


class Art extends Component {
  constructor(props) {
    super(props);

    this.state = {
      art: [
        {
          title: "The ghosts we no longer know",
          src: "https://github.com/AlyssaYelle/yelle-intothevoid/raw/master/y2v-frontend/public/assets/ghosts.png"
        },
        {
          title: "I am telling you this",
          src: "https://github.com/AlyssaYelle/yelle-intothevoid/raw/master/y2v-frontend/public/assets/scream.png"
        },
        {
          title: "You are hurting all of us",
          src: "https://github.com/AlyssaYelle/yelle-intothevoid/raw/master/y2v-frontend/public/assets/harm.png"
        },
        {
          title: "Open wide my veins",
          src: "https://github.com/AlyssaYelle/yelle-intothevoid/raw/master/y2v-frontend/public/assets/blood1.png"
        }
      ]
    }
  }

  render() {
    return (
      <div className="component">
      {this.state.art ?
        this.state.art.map((item, key) => {
          return (
            <img key={key} src={item.src} alt={item.title}/>
          )
        })
        : ''
      }
      </div>
    )
  }
}

export default Art;
