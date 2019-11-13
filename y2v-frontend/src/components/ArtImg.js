import React, { Component } from 'react';

import ArtModal from './ArtModal';

class ArtImg extends Component {

  constructor() {
    super();

    this.state = {
      isModalDisplayed: false,
    }

    this.displayModal = this.displayModal.bind(this);
    this.closeModal = this.closeModal.bind(this);
  }

  displayModal() {

    this.setState({
      isModalDisplayed: true
    })
  }

  closeModal() {
    this.setState({
      isModalDisplayed: false
    })
  }

  render(props) {
    return (
      <div className='artImg'>
      {this.state.isModalDisplayed ?
        <ArtModal info={this.props.info} close={this.closeModal} display="none"/>
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
