import React, { Component } from 'react';

class ArtImg extends Component {
  render(props) {
    return (
      <img src={this.props.info.src} alt={this.props.info.title}/>
    )
  }
}

export default ArtImg;
