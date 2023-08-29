import { CONSUMIBLES_API } from '../constants/Constantes';

class BebidasService {

    async getBebida(){
        const response = await fetch(CONSUMIBLES_API.ALCOHOLICA());
        return response.json();
    }

    async getBebidaAleatoria(){
        const response = await fetch(CONSUMIBLES_API.ALEATORIA());
        return response.json();
    }

    async getBebidaPorId(id){        
        const response = await fetch(CONSUMIBLES_API.POR_ID(id));
        return response.json();
    }

    async getBebidaPorIngrediente(ing){
        const response = await fetch(CONSUMIBLES_API.POR_INGREDIENTE(ing));
        return response.json();
    }

    async getBebidaPorNobmre(nom){
        const response = await fetch(CONSUMIBLES_API.POR_NOMBRE(nom));
        return response.json();
    }

}

export default new BebidasService();