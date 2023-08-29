export const CONSUMIBLES_API = {
    URL: "https://www.thecocktaildb.com/api/json/v1/1",

    ALCOHOLICA: function () {return `${this.URL}/filter.php?a=Alcoholic`;},

    ALEATORIA: function () {return `${this.URL}/random.php`;},

    POR_ID:function (id) {return `${this.URL}/lookup.php?i=${id}`;},

    POR_INGREDIENTE:function (ing){return `${this.URL}/filter.php?i=${ing}`;},
    
    POR_NOMBRE:function (nom){return `${this.URL}/search.php?s=${nom}`;},
}