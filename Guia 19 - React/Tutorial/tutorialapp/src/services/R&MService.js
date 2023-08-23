import { API_DATA } from "../constants/api.constants";

class RickAndMortyService {

    async getAllCharacters(){
        const response = await fetch(API_DATA.CHARACTERS());
        return response.json();
    }

    async getCharacterById(id){
        const response = await fetch(API_DATA.CHARACTERS_BY_ID(id));
        return response.json();
    }

}

export default new RickAndMortyService();