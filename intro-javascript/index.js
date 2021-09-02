var nome = "Mateus G";
var idade = 29;
var frase = "Japão é o melhor time";
//alert("Bem vindo " + nome);
console.log(nome);
console.log(frase.replace("Japão", "Brasil"));
console.log(frase.toUpperCase())
console.log(frase.toLowerCase())

//arrays
var lista = ["maçã", "pera", "laranja"];
//adicionar elemento a array
lista.push("uva")
//remover último elemento da lista
lista.pop();

console.log(lista)
console.log(lista[1])
//métodos e atributos do array
console.log(lista.length)
console.log(lista.reverse())
console.log(lista.toString())
console.log(lista.join("-"))

//dicionarios
var fruta = [
    {
        nome: "maçã",
        cor: "vermelha"
    },
    {
        nome: "uva",
        cor: "roxo"
    }
]

console.log(fruta)
// console.log(fruta.nome)
console.log(fruta[0].nome)

// condicionais
var idade = prompt("Qual sua idade?");
if(idade >= 18){
    console.log("maior de idade")
} else {
    console.log("menor de idade")
}

// repetição
var count = 0;
while(count < 5){
    console.log(count)
    count = count + 1;
}
for (let i = 0; i < 5; i++) {
    console.log(i)
}

// datas
var d = new Date();
console.log(d)
console.log(d.getHours())