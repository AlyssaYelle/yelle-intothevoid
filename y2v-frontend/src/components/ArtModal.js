import React, { Component } from 'react';

import '../css/ArtModal.css';
import Player from './Player';


class ArtModal extends Component {
  render(props) {
    return (
      <div id="myModal" className="modal">
        <span className="close">×</span>
        <div className="modal-content">
          <img className="modal-img" id="img01" src={this.props.info["artLink"]} alt=""/>
          <div id="caption">
            <h3>{this.props.info["artTitle"]}</h3>
            <Player uri={this.props.info["songUri"]} title={this.props.info["songTitle"]}/>
            <p>{this.props.info["artDesc"]}</p>
          </div>
        </div>
      </div>
    )
  }
}

export default ArtModal;
