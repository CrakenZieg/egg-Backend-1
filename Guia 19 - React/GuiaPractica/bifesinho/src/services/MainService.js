import BebidasService from "./BebidaService";

class MainService {

    async getBebida(){
        return new Promise(
            (resolve)=>{
                let buffer = [];
                    BebidasService.getBebida()
                        .then((response) => { buffer.push(response.drinks[0]) })
                        .catch((error) => { console.log(error) });
                return resolve;
            }
        )     
    }
    
}

export default new MainService();