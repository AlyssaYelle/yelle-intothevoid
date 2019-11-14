import React, { Component } from 'react';

import '../css/Admin.css';
// import ArtData from './ArtData';

class AdminInterface extends Component {
  constructor() {
    super();

    this.state = {
      artTitle: '',
      artDescription: '',
      artLink: '',
      songTitle: '',
      songArtist: '',
      songURI: '',
      songArtId: ''
    }

    this.handleInputChange = this.handleInputChange.bind(this);
    this.handleArtSubmit = this.handleArtSubmit.bind(this);
    this.handleSongSubmit = this.handleSongSubmit.bind(this);
  }


  handleInputChange(event) {
    const target = event.target;
    const value = target.value;
    const name = target.name;

    this.setState({
        [name]: value
    });
  }

  handleArtSubmit(event) {
    event.preventDefault();

    console.log('submitting art');

    this.setState({
      artTitle: '',
      artDescription: '',
      artLink: ''
    })
  }

  handleSongSubmit(event) {
    event.preventDefault();

    console.log('submitting song');

    this.setState({
      songTitle: '',
      songArtist: '',
      songURI: '',
      songArtId: ''
    })
  }

  render() {
    return (
      <div className='component'>
        <div className='adminForms'>

          <form onSubmit={this.handleArtSubmit}>
            <label>
              <p>Add new art</p>
              <input
                id='artTitle'
                type="text"
                name="artTitle"
                placeholder='title of art'
                value={this.state.artTitle}
                onChange={this.handleInputChange}
              />
            </label>
            <label>
              <input
                id='artDescription'
                type="text"
                name="artDescription"
                placeholder='description'
                value={this.state.artDescription}
                onChange={this.handleInputChange}
              />
            </label>
            <label>
              <input
                id='artLink'
                type="text"
                name="artLink"
                placeholder='link'
                value={this.state.artLink}
                onChange={this.handleInputChange}
              />
            </label>
            <input className='submit' type="submit" value="submit art" />
          </form>

          <form onSubmit={this.handleSongSubmit}>
            <label>
              <p>Add new song</p>
              <input
                id='songTitle'
                type="text"
                name="songTitle"
                placeholder='title'
                value={this.state.songTitle}
                onChange={this.handleInputChange}
              />
            </label>
            <label>
              <input
                id='songArtist'
                type="text"
                name="songArtist"
                placeholder='artist'
                value={this.state.songArtist}
                onChange={this.handleInputChange}
              />
            </label>
            <label>
              <input
                id='songURI'
                type="text"
                name="songURI"
                placeholder='spotify URI'
                value={this.state.songURI}
                onChange={this.handleInputChange}
              />
            </label>
            <label>
              <input
                id='songArtId'
                type="number"
                name="songArtId"
                placeholder='ard ID'
                value={this.state.songArtId}
                onChange={this.handleInputChange}
              />
            </label>
            <input className='submit' type="submit" value="submit song" />
          </form>

        </div>

      </div>
    )
  }
}

export default AdminInterface;
