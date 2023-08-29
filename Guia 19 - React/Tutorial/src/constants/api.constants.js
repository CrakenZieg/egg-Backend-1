export const API_DATA = {
    URL: "http://rickandmortyapi.com/api",

    CHARACTERS: function () {
        return `${this.URL}/character`;
    },

    CHARACTERS_BY_ID: function (id) {
        return `${this.URL}/character/${id}`;
    }
}