# Aula 2

Para mudar o nome de uma branch, é utilizado o comando:

```bash
    # se dentro da branch
    git branch -m novo-nome
    # se a mudança for de uma branch para a outra
    git branch -m nome-branch novo-nome
```

Para deletar uma branch, é utilizado o comando:

```bash
    git branch -d branch-para-deletar
```

Para manter as alterações em uma única branch, é utilizado o stash:

```bash
    git stash save "texto"
    git stash list

    # para tirar o stash
    git stash pop 0
```

Para localizar o histórico de modificações, é usado o comando log

```bash
    git log --graph # vê as alterações em forma de grafo
    git log pasta/arquivo # vê todas as alterações ligadas à pasta ou arquivo
    git log --oneline # vê todos os commits de forma resumida 
```
