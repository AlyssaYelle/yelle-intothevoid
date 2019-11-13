import React, { Component } from 'react';

class ArtData extends Component {
  render(props) {
    return (
      <div>
        <ul>
          <li>{this.props.info.id}</li>
          <li>{this.props.info.title}</li>
          <li>{this.props.info.description}</li>
          <li><a href={this.props.info.link}>link</a></li>
        </ul>
      </div>
    )
  }
}

export default ArtData;
