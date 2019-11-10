import React, { Component } from 'react';


class ArtImg extends Component {
  render(props) {
    return (
      <img src={this.props.info["artLink"]} alt={this.props.info["artTitle"]}/>
    )
  }
}

export default ArtImg;
