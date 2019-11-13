import React, { Component } from 'react';
import '../css/Art.css';

// import custom components
import ArtImg from './ArtImg';


class Art extends Component {
  constructor() {
    super();

    this.state = {
      art: []
    }

  }

  componentDidMount() {
    fetch('http://localhost:8282/art/list')
      .then(response => {
        return response.json();
      })
      .then(response => {
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
