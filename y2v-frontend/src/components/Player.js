import React, { Component } from 'react';

class Player extends Component {
  constructor(props) {
    super(props);

    this.state = {
      uri: 'https://open.spotify.com/embed/track/3TbKcmraxp8J4PvsJNRXhi',
      title: 'Keep the streets empty for me'
    }
  }

  render() {
    return (
      <div>
        <iframe
          src={this.state.uri}
          title={this.state.title}
          width="300"
          height="80"
          frameborder="0"
          allowtransparency="true"
          allow="encrypted-media">
        </iframe>
      </div>
    )
  }
}

export default Player;
