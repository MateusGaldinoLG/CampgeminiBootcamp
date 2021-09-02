//funções
function soma(n1, n2){
    return n1+n2;
}

console.log(soma(5, 10))

function setReplace(frase, nome, novoNome){
    return frase.replace(nome, novoNome)
}

console.log(
    setReplace(
        "Vai Japão",
        "Japão",
        "Brasil"
    )
)

function validarIdade(idade){
    var validar;
    if(idade >= 18){
        validar = true
    } else {
        validar = false
    }
    return validar;
}

// var idade = prompt("Qual sua idade?")
// console.log(validarIdade(idade))

function clicou(){
    //alert("Obrigado por clickar")

    document.getElementById("agradecimento").innerHTML = "<strong>Obrigado por clicar</strong>"
}

