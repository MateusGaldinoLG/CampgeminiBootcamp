# Collections framework

Collections são objetos que agrupam múltiplos elementos (variáveis primitivas ou objetos) dentro de uma única unidade

## Lists

Interface em java.util.List  
Possui elementos duplicados e garante ordem de inserção  
ArrayLists são usados para operações de pesquisa  
LinkedLists são usados para operações de inserção e exclusão

```Java
    // até o java 5
    List lista = new ArrayList();
    // a partir do java 5 com generics
    List<Double> lista = new ArrayList<>();
    // <> = diamond operator
```

Para comparar listas, são usados as interfaces Comparable e Comparator e a função Collections.sort()

```Java
    class Person implements Comparable<Person>{}
    class ComparatorPerson implements Comparator<Person>{}

    Collections.sort(list, new ComparatorPerson())
```
