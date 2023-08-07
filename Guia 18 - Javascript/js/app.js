/*1
    Escribir un algoritmo en el cual se consulte al usuario que ingrese ¿cómo está el día de hoy? 
    (soleado, nublado, lloviendo). A continuación, mostrar por pantalla un mensaje que indique 
    "El día de hoy está ...", completando el mensaje con el dato que ingresó el usuario.  
*/

function ejercicio1() {
    let clima = prompt("¿Cómo está el día de hoy? (soleado, nublado, lloviendo)");
    if (clima === "" || clima == null) {
        alert("Debes ingresar como está el día!");
    } else {
        alert(`El día de hoy está ${clima}`);
    }
}

/*2
    Conocido el número en matemática PI π, pedir al usuario que ingrese el valor del radio de una 
    circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que para calcular 
    el área y el perímetro se utilizan las siguientes fórmulas: 
    area = PI * radio2  
    perimetro = 2 * PI * radio
*/

function ejercicio2() {
    let radio = prompt("Ingrese el valor del radio de una circunferencia:");
    if (radio === "" || radio == null) {
        alert("Debes ingresar el valor del radio!");
    } else {
        let num = Number.parseFloat(radio);
        let area = Math.PI * Math.pow(num, 2);
        let perimetro = Math.PI * 2 * num;
        alert(`Area: ${area}\nPerímetro: ${perimetro}`);
    }
}

/*3 
    Escriba un programa en donde se pida la edad del usuario. Si el usuario es mayor de 
    edad se debe mostrar un mensaje indicándolo.  
*/

function ejercicio3() {
    let edad = prompt("Ingrese el valor de la edad:");
    if (edad === "" || edad == null) {
        alert("Debes ingresar el valor de la edad!");
    } else {
        let edadNum = Number.parseFloat(edad);
        alert(`Edad: ${edadNum}, ${(edadNum < 18) ? "es menor!" : "es mayor!"}`);
    }
}

/*4
    Realiza un programa que sólo permita introducir los caracteres 'S' y 'N'. Si el usuario 
    ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla que 
    diga 'CORRECTO', en caso contrario, se deberá imprimir 'INCORRECTO'. 
*/

function ejercicio4() {
    let opc = prompt("Ingrese 'S' o 'N':");
    if (opc === "S" || opc === "N") {
        alert("CORRECTO");
    } else {
        alert("INCORRECTO");
    }
}

/*5
    Construir un programa que simule un menú de opciones para realizar las cuatro operaciones 
    aritméticas básicas (suma, resta, multiplicación y división) con dos valores numéricos 
    enteros. El usuario, además, debe especificar la operación con el primer carácter de la 
    operación que desea realizar: 'S' o 's' para la suma, 'R' o 'r' para la resta, 'M' o 'm' 
    para la multiplicación y 'D' o 'd' para la división.  
*/

function ejercicio5() {
    let opc = prompt("Ingrese la operacion: \n-'S' para suma\n-'R' para resta" +
        "\n-'M' para multiplicación\n-'D' para división").toLowerCase();
    if (opc === "s" || opc === "r" || opc === "m" || opc === "d") {
        let num1;
        let num2;
        do {
            num1 = Number.parseFloat(prompt("Ingrese el primer número"));
            num2 = Number.parseFloat(prompt("Ingrese el segundo número"));
        } while (num1 == null || num2 == null);
        switch (opc) {
            case 's':
                alert(`${num1}+${num2}=${num1 + num2}`)
                break;
            case 'r':
                alert(`${num1}-${num2}=${num1 - num2}`)
                break;
            case 'm':
                alert(`${num1}*${num2}=${num1 * num2}`)
                break;
            case 'd':
                alert(`${num1}/${num2}=${num1 / num2}`)
                break;
            default:
                break;
        }
    } else {
        alert("Debes ingresar una opción!");
    }
}

/*6 
    Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar. 
    En caso de que el valor ingresado sea 0, se debe mostrar "el número no es par ni impar".  
*/

function ejercicio6() {
    let opc = Number.parseInt(prompt("Ingrese un numero entero:"));
    if (opc === 0) {
        alert("El número no es par ni impar");
    } else if (opc % 2 == 0) {
        alert("El número es par!");
    } else {
        alert("El número es impar!");
    }
}

/*7
    Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
    números al usuario hasta que la suma de los números introducidos supere el límite inicial.  
*/

function ejercicio7() {
    let suma = 0;
    let opc = Number.parseInt(prompt("Ingrese un numero entero:"));
    do {
        suma += Number.parseInt(prompt("Ingrese un numero entero:"));
    } while (suma < opc);
    alert(`La suma ${suma} es mayor que el primer número ${opc}`);
}

/*8 
    Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el programa se 
    debe mostrar el máximo número ingresado, el mínimo, y el promedio de todos ellos.    
*/

function ejercicio8() {
    let num, max, min;
    let numeros = [];
    let promedio = 0;
    do {
        do {
            num = Number.parseInt(prompt("Ingrese un numero (0 termina los ingresos)"));
        } while (Number.isNaN(num));
        if (num == 0) {
            break;
        } else
        if (max == null || min == null) {
            max = num;
            min = num;
        } else
        if (num > max) {
            max = num;
        } else
        if (num < min) {
            min = num;
        }
        numeros.push(num);
        promedio += num;
    } while (num != 0);
    promedio = promedio / numeros.length;
    alert(`Número máximo: ${max}\nNúmero mínimo: ${min}\nPromedio: ${promedio}`)
}

/*9 
    Realizar un programa que pida una frase y el programa deberá mostrar la frase con un espacio entre 
    cada letra. La frase se mostrara así: H o l a. Nota: recordar el funcionamiento de la función 
    Substring().
*/

function ejercicio9() {
    let frase = prompt("Ingrese la frase");
    let fraseArr = frase.split("");
    frase = "";
    for (let i = 0; i < fraseArr.length; i++) {
        if (fraseArr[i] != " " && i != (fraseArr.length - 1)) {
            frase = frase.concat(fraseArr[i] + " ");
        } else {
            frase = frase.concat(fraseArr[i]);
        }
    }
    alert(frase);
}

/*10 
    Escribir una función flecha que reciba una palabra y la devuelva al revés. 
*/

function ejercicio10() {
    let frase = prompt("Ingresa una frase:");
    let retorno = reversa(frase);
    alert(retorno);
}

let reversa = (frase) => {
    let fraseArr = frase.split("");
    let retorno = fraseArr.reduce((a,b)=>{return a+b});
    /*let retorno = "";
    for (let i = 0; i < fraseArr.length; i++) {
        retorno = retorno.concat(fraseArr[fraseArr.length-1-i]);
    }*/
    return retorno;
}

/*11 
    Escribir una función que reciba un String y devuelva la palabra más larga.  String Ejemplo: "Guia de JavaScript" Resultado esperado : "JavaScript"
*/

function ejercicio11() {
    let frase = prompt("Ingresa una frase:");
    alert(larga(frase));
}

let larga = (frase) => {
    let fraseArr = frase.split(" ");
    let retorno = "";
    for (let i = 0; i < fraseArr.length; i++) {
        if (fraseArr[i].length > retorno.length) {
            retorno = fraseArr[i];
        }
    }
    return retorno;
}

/*12
    Escribir una función flecha de JavaScript que reciba un argumento y retorne el tipo de dato. 
*/

function ejercicio12() {
    let frase = prompt("Ingresa algo:");
    alert(tipo(frase));
}

let tipo = (e) => {
    return typeof (e);
}

/*13 
    Crear un objeto persona, con las propiedades nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), 
    peso y altura. A continuación, muestre las propiedades del objeto JavaScript. 
*/

class Persona {
    nombre;
    edad;
    sexo;
    peso;
    altura;
    constructor(nombre, edad, sexo, peso, altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
}
function ejercicio13() {
    let pepe = new Persona("Pepe", 153, "O", 80, 1.75);
    alert("Pepe = " + pepe);
    alert(`Nombre: ${pepe.nombre}, edad: ${pepe.edad} años, sexo: ${pepe.sexo}, peso: ${pepe.peso}kg, altura: ${pepe.altura}m`);
}

/*14 
    Crear un objeto libro que contenga las siguientes propiedades: ISBN, Título, Autor, Número de 
    páginas. Crear un método para cargar un libro pidiendo los datos al usuario y luego informar 
    mediante otro método el número de ISBN, el título, el autor del libro y el numero de páginas. 
*/

class Libro {
    isbn;
    titulo;
    autor;
    numeroPags;
    constructor(isbn, titulo, autor, numeroPags) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPags = numeroPags;
    }
}
function ejercicio14() {
    let libro = crearLibro();
}
function crearLibro(){
    let isbn, titulo, autor, numeroPags;
    isbn = cargaValida('isbn');
    titulo = cargaValida('título');
    autor = cargaValida('autor');
    numeroPags = cargaValida('número de páginas');
    let libro = new Libro(isbn, titulo, autor, numeroPags);
    return libro;
}
function cargaValida(param){
    let retorno;
    do{
        retorno = prompt(`Ingrese el ${param}:`);
    } while (retorno==null||retorno==="");
    return retorno;
}

/*15 
    Escribe un programa JavaScript para calcular el área y el perímetro de un objeto Círculo 
    con la propiedad radio. Nota: Cree dos métodos para calcular el área y el perímetro. El radio del 
    círculo lo proporcionará el usuario. 
*/

function ejercicio15(){
    let radio = prompt("Introduce el radio:");
    let area = areaCirculo(radio);
    let perimetro = perimetroCirculo(radio);
    alert(`Para un circulo de radio ${radio} su area es ${area} y su perímetro es ${perimetro}`);
}
function areaCirculo(radio){
    return Math.PI*Math.pow(radio,2);
}
function perimetroCirculo(radio){
    return Math.PI*radio*2;
}

/*16 
    Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios y los 
    muestre por pantalla. 
*/

function ejercicio16(){
    let vector1 = [];
    let vector2 = [];
    let n = 5;
    for(let i=0; i<n; i++){
        vector1[i]=Math.floor((Math.random()*101));
        vector2[i]=Math.floor((Math.random()*101));
    }
    alert(`Vector1: [${vector1.toString}]\nVector2: [${vector2.toString}]`);
}

/*17 
    Realizar un programa que elimine los dos últimos elementos de un array. Mostrar el resultado
*/

function ejercico17(){
    
}

/* 18. A partir del siguiente array: var valores = [true, 5, false, "hola", "adios", 2]: a) Determinar cual de los dos elementos de texto es mayor b) Utilizando exclusivamente los dos valores booleanos del array, determinar los operadores necesarios para obtener un resultado true y otro resultado false c) Determinar el resultado de las cinco operaciones matemáticas realizadas con los dos elementos numéricos */

/* 19. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.    */

/* 20. Realizar un programa que obtenga la siguiente matriz [[3], [6], [9], [12], [15]] y devuelve y muestre el siguiente array [6, 9, 12, 15, 18]. */

/* 21. Escribir un programa para obtener un array de las propiedades de un objeto Persona. Las propiedades son nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. */

/* 22. Escribir un programa de JavaScript que al clickear un botón muestre un mensaje a elección.

*/

/*

(a,)

*/