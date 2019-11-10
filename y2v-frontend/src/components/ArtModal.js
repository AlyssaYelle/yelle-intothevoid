import React, { Component } from 'react';

import '../css/ArtModal.css';
import Player from './Player';


class ArtModal extends Component {
  render() {
    return (
      <div id="myModal" className="modal">
        <span className="close">×</span>
        <div className="modal-content">
          <img className="modal-img" id="img01" src="https://github.com/AlyssaYelle/yelle-intothevoid/raw/master/y2v-frontend/public/assets/scream.png" alt=""/>
          <div id="caption">
            <h3>today i paint because i cannot scream</h3>
            <Player />
            <p>you asked me why i never smile anymore so i am painting you this</p>
          </div>
        </div>
      </div>
    )
  }
}

export default ArtModal;
