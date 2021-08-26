# Git Branches

A branch padrão do git é a main ou master. O Github inicia suas branchs com main, enquanto versões mais antigas do git iniciam o projeto com master.  

Para se mover entre branchs, criando uma nova caso ela não exista, é utilizado o comando *checkout*:

```bash
    git checkout -b branch-nova
```

Para juntar duas branchs, é usado o comando *merge*:

```bash
    git merge branch-nova
```

Para mudar o nome de uma branch, é utilizado o comando:

```bash
    # se dentro da branch
    git branch -m novo-nome
    # se a mudança for de uma branch para a outra
    git branch -m nome-branch novo-nome
```
