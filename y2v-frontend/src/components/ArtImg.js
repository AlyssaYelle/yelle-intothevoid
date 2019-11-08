import React, { Component } from 'react';

// import custom component
import Popover from './Popover';

class ArtImg extends Component {
  render(props) {
    return (
      <img src={this.props.info.src} alt={this.props.info.title}/>
    )
  }
}

export default ArtImg;
