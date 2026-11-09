# Mercado List

Exercício de Java que simula um mercado pelo terminal. O programa mantém o catálogo e o carrinho em memória durante a execução.

## Funcionalidades

- Cadastrar produtos por nome e preço, com código numérico gerado automaticamente.
- Listar os produtos cadastrados e consultar seus códigos.
- Adicionar um produto ao carrinho pelo código.
- Listar os itens no carrinho e mostrar o total formatado em reais.

## Estrutura

| Arquivo | Responsabilidade |
| --- | --- |
| [Mercado.java](project_Mercado/src/mercado/Mercado.java) | Ponto de entrada, menu e operações do catálogo e do carrinho. |
| [Produtos.java](project_Mercado/src/mercado/Produtos.java) | Representação dos produtos e geração dos códigos. |
| [Utilitarios.java](project_Mercado/src/mercado/Utilitarios.java) | Formatação e funções auxiliares. |
| [Test.java](project_Mercado/src/mercado/Test.java) | Demonstração manual da criação e exibição de produtos. |

## Como executar

Use um JDK com `javac` disponível. A configuração do IntelliJ IDEA referencia o JDK 24. Na raiz do repositório:

```bash
cd project_Mercado
javac -encoding UTF-8 -d out src/mercado/*.java
java -cp out mercado.Mercado
```

Cadastre um item pela opção 1 usando ponto no preço, como `5.50`. Use a opção 2 para ver seu código, a opção 3 para adicioná-lo e a opção 4 para conferir o total.

## Aprendizados e status

O exercício pratica entrada com `Scanner`, coleções `ArrayList`, classes e formatação de valores. O fluxo funciona como aplicativo de console e começa com listas vazias a cada execução.
