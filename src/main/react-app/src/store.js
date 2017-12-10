import { applyMiddleware, compose, createStore } from 'redux';
import { createLogger } from 'redux-logger';
import thunk from 'redux-thunk';
import promiseMiddleware from 'redux-promise';

import rootReducer from './rootReducer';


const middlewares = [
    createLogger(),
    thunk,
    promiseMiddleware,
];

export default createStore(
    rootReducer,
    undefined,
    compose(
        applyMiddleware(...middlewares),
        window.devToolsExtension ? window.devToolsExtension() : f => f
    )
);