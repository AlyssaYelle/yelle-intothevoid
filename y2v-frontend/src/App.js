import React, { Component } from 'react';
import {
  BrowserRouter as Router,
  Route,
  Link
} from 'react-router-dom';
import './App.css';

// import custom components
import Art from './components/Art';
import About from './components/About';
import Code from './components/Code';
import Footer from './components/Footer';

class App extends Component {
  render() {
    return (
      <div className="App">
        <Router>
          <header>
            <h1>
              <span>Yelle</span> into the void
            </h1>
            <nav>
              <Link className="nav-link" to="/">Art</Link>
              <Link className="nav-link" to="/about">About</Link>
              <Link className="nav-link" to="/code">Code</Link>
            </nav>
          </header>

          <Route exact path="/" component={Art} />
          <Route path="/about" component={About} />
          <Route path="/code" component={Code} />

        </Router>

        <Footer />
      </div>
    )
  }
}

export default App;
