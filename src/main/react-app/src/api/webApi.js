import axios from "axios";

axios.defaults.baseURL = 'http://localhost:8080/api';

class Api {

    async getAllTires() {
        try {
            const {data} = await axios.get("/tires");

            return data;
        } catch (e) {
            return e;
        }
    }
}

export default new Api();