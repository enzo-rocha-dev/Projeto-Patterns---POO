# Projeto-Patterns---POO

## Intergrantes do projeto
- Enzo Guilherme Elias da Rocha - 15449850
- Giovana Leite Paião - 16869044 
---
## visão geral

Este projeto implementa um catálogo de livros em Java utilizando o padrão de projeto **Strategy**, permitindo filtrar livros por autor ou gênero de forma desacoplada, extensível e alinhada às boas práticas de orientação a objetos.

A arquitetura é composta por:

- **Book** – classe que modela o livro.  
- **Catalog** – responsável por armazenar e disponibilizar o catálogo.  
- **Strategy Pattern**:
  - **BookFilterStrategy** — interface base para filtros.  
  - **AuthorFilterStrategy** — implementação de filtro por autor.  
  - **GenreFilterStrategy** — implementação de filtro por gênero.  
- **Main** — interface de execução via console, responsável pela interação com o usuário.

---

## fluxo de uso

Ao executar o programa, o usuário acessa um menu interativo com as seguintes funcionalidades:

### **1. Listar todos os livros**
- Exibe no console todo o catálogo de livros já carregado internamente no sistema.

### **2. Filtrar livros por gênero**
- O usuário informa o gênero desejado.
- O sistema aplica a `GenreFilterStrategy`.
- Exibe somente os livros cujo gênero corresponde ao termo pesquisado.

### **3. Filtrar livros por autor**
- O usuário informa o nome do autor.
- O sistema aplica a `AuthorFilterStrategy`.
- Exibe os livros cujo autor coincide com a busca, após normalização do texto.

### **4. Sair**
- Encerra imediatamente a execução da aplicação.

---