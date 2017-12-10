import { createAction, handleActions } from 'redux-actions';
import Api from "../api/webApi";

export const fetchTires = createAction(
    'FETCH_TIRES',
    Api.getAllTires
);


export const tires = handleActions({
    [fetchTires](state, action) {
        return action.payload;
    },
}, []);