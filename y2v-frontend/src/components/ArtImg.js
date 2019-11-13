import React, { Component } from 'react';

import ArtModal from './ArtModal';

class ArtImg extends Component {

  constructor() {
    super();

    this.state = {
      isModalDisplayed: false,
    }

    this.displayModal = this.displayModal.bind(this);
  }

  displayModal() {
    if (this.state.isModalDisplayed) {
      document.getElementById('myModal').style.display = 'block';
    } else {
      this.setState({
        isModalDisplayed: true
      })
    }
  }

  render(props) {
    return (
      <div className='artImg'>
      {this.state.isModalDisplayed ?
        <ArtModal info={this.props.info} display="block"/>
        : ''
      }
      <img
        onClick={this.displayModal}
        src={this.props.info["artLink"]}
        alt={this.props.info["artTitle"]}
      />
      </div>
    )
  }
}

export default ArtImg;
