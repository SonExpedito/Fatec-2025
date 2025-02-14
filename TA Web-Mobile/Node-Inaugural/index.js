var soma = require("./soma.js");


console.log("Olá");
var n1 = 8;
var n2 = 10;
var media = (soma(n1,n2)) / 2;

console.log("Sua média é: ", media);

if (media >= 6) {
    console.log("Passou de Ano") 

}
else {
    console.log("Repetiu")
}