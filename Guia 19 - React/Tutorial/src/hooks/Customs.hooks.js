import { useState } from "react";
/* Un hook es una funcion (you don't say?) */
export const useUserForm = (initialState = {}) => {

/* los datos de un form y el setteo de la misma */   
    const [form, setForm] = useState(initialState);
/* funcion que monitorea cambios */
    const handleChanges = ({target}) => {
/* extraigo datos de target */
        const {name, value} = target;
        // console.log("target: "+ target);
        // console.log("name: "+ name);
        // console.log("value: "+ value);
/* agrego los datos extraidos al objeto form */
        setForm({
            ...form,//spread 
            [name]: value,       
        })//form es un json<-
    }
/* retornamos la forma, el setteo de la misma y la función que actualiza form 
   y asi lo desestructuraremos cuando lo llamemos en algun componente
*/
    return {
        form, setForm, handleChanges
    }

}