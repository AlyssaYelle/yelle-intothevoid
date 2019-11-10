import React, { Component } from 'react';

import '../css/ArtModal.css';


class ArtModal extends Component {
  render() {
    return (
      <div id="myModal" className="modal">
        <span className="close">×</span>
        <img className="modal-content" id="img01" src="https://github.com/AlyssaYelle/yelle-intothevoid/raw/master/y2v-frontend/public/assets/scream.png"/>
        <div id="caption">Test caption</div>
      </div>
    )
  }
}

export default ArtModal;
