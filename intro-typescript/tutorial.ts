console.log('TypeScript');

// tipagem de funções

function soma(a: number, b: number){
    return a + b;
}

// interfaces

interface IAnimal{
    nome: string;
    tipo: 'terrestre' | 'aquatico';
    domestico: boolean;
}

interface IFelino extends IAnimal{
    visaoNoturna: boolean;
    executarRugido(alturaEmDecibeis: number): void;
}

const animal: IAnimal = {
    nome: 'Elefante',
    tipo: "terrestre",
    domestico: false
}

const felino: IFelino = {
    nome: 'Leão',
    tipo: "terrestre",
    visaoNoturna: true,
    domestico: false,
    executarRugido: (alturaEmDecibeis) => (`${alturaEmDecibeis}dB`)
}

felino.executarRugido(20);

// types

interface ICanino extends IAnimal {
    porte: 'pequeno' | 'medio' | 'grande';
}

type TypeDomestico = IFelino | ICanino;

const animalDomestico: TypeDomestico = {
    domestico: true,
    nome: 'cachorro',
    porte: 'medio',
    tipo: 'terrestre',
    visaoNoturna: true
}

// Generic types

function adicionaApendiceALista<T>(array: any[], valor: T){
    return array.map(item => item + valor);
}

adicionaApendiceALista([1,2,3], 1);

// Condicionais

interface IUsuario{
    id: string;
    email: string;
}

interface IAdmin extends IUsuario{
    cargo: 'gerente' | 'coordenador' | 'supervisor';
}

// variáveis opcionais com '?'
interface IUsuario2{
    id: string;
    email: string;
    cargo?: 'gerente' | 'coordenador' | 'supervisor' | 'funcionario';
}

function redirecionar(usuario: IUsuario | IAdmin){
    if('cargo' in usuario){
        // redirecionar para administração
    }

    // redirecionar para usuario
}

interface ICachorro{
    nome: string;
    idade: number;
    parqueFavorito?: string
}

// readonly

type CachorroSomenteLeitura = {
    // transforma todas as keys em readonly
    readonly [K in keyof ICachorro]: ICachorro[K];
}

const meuCachorro: ICachorro = {
    nome: 'toby',
    idade: 14
}

// Typescript classe

class MeuCachorro implements ICachorro{
    readonly nome: string;
    readonly idade: number;

    constructor(nome: string, idade: number){
        this.nome = nome;
        this.idade = idade;
    }
}

const cao = new MeuCachorro('Apolo', 14);

// Omit
interface Pessoa{
    nome: string;
    idade: number;
    nacionalidade: string;
}

interface Brasileiro extends Omit<Pessoa, 'nacionalidade'>{

}

//const brasileiro: Brasileiro;

