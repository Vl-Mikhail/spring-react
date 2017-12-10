import React, { Component } from 'react';
import './styles/App.css';
import { fetchTires } from './ducks';
import { connect } from 'react-redux';
import { BootstrapTable, TableHeaderColumn } from 'react-bootstrap-table';

class App extends Component {

    componentDidMount() {
        this.props.fetchTires();
    }

    priceFormatter = (cell, _) => {
        return `<i class='glyphicon glyphicon-usd'></i> ${cell}`;
    };

    render() {
        const { tires } = this.props;

        return (
            <div className="App">
                <header className="App-header">
                    <h1 className="App-title">Welcome to Spring - React</h1>
                </header>
                <div className="wrapper">
                    <BootstrapTable data={tires}>
                        <TableHeaderColumn isKey dataField='id'>Product ID</TableHeaderColumn>
                        <TableHeaderColumn dataField='size'>Size</TableHeaderColumn>
                        <TableHeaderColumn dataField='season'>Season</TableHeaderColumn>
                        <TableHeaderColumn dataField='price' dataFormat={this.priceFormatter}>Price</TableHeaderColumn>
                    </BootstrapTable>
                </div>
            </div>
        );
    }
}

export default connect(state => ({ tires: state.tires }), { fetchTires })(App);

