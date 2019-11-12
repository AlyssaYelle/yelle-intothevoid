import React, { Component } from 'react';
import '../css/Art.css';

// import custom components
import ArtImg from './ArtImg';
import ArtModal from './ArtModal';


class Art extends Component {
  constructor() {
    super();

    this.state = {
      modal: {
        isDisplayed: false,
        info: {}
      },
      art: []
    }

  }

  componentDidMount() {
    fetch('http://localhost:8282/art/list')
      .then(response => {
        return response.json();
      })
      .then(response => {
        console.log(response)
        this.setState({
          art: response
        })
      })
      .catch(error => {
        console.log(error)
      })
  }



  render() {
    return (
      <div className="component">
      {this.state.modal.isDisplayed ?
        <ArtModal info={this.state.modal.info}/>
        : ''
      }
      {this.state.art ?
        this.state.art.map((item, key) => {
          return (
            <ArtImg key={key} info={item}/>
          )
        })
        : ''
      }
      </div>
    )
  }
}

export default Art;
