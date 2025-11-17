import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        ArrayList <Book> books = new ArrayList<>();
        Catalog cat;

        // Vetor de Autores
        String[] authors = {
            "Helena Bastos", "Ricardo Nunes", "Alex Viana", "Beatriz Lima", "Carlos Mendes",
            "Helena Bastos", "Tiago Furtado", "Lara Guedes", "Ricardo Nunes", "Ari Costa",
            "Fábio Almeida", "Beatriz Lima", "Diogo Matos", "Carlos Mendes", "Sofia Pereira",
            "Alex Viana", "Nuno Rocha", "Helena Bastos", "Lara Guedes", "Tiago Furtado",
            "Inês Tavares", "Ricardo Nunes", "Ari Costa", "Bruno Carvalho", "Clara Gomes",
            "Fábio Almeida", "Diogo Matos", "Elisa Ferraz", "Gustavo Pires", "Helena Bastos",
            "Jonas Marques", "Lara Guedes", "Alex Viana", "Marcos Andrade", "Nuno Rocha",
            "Beatriz Lima", "Oscar Barreto", "Paula Ribeiro", "Ari Costa", "Sofia Pereira",
            "Ricardo Nunes", "Tiago Furtado", "Helena Bastos", "Carlos Mendes", "Vera Mota",
            "Bruno Carvalho", "Diogo Matos", "Elisa Ferraz", "Fábio Almeida", "Alex Viana",
            "Gustavo Pires", "Inês Tavares", "Jonas Marques", "Lara Guedes", "Marcos Andrade",
            "Beatriz Lima", "Nuno Rocha", "Oscar Barreto", "Paula Ribeiro", "Ricardo Nunes",
            "Sofia Pereira", "Tiago Furtado", "Vera Mota", "Ari Costa", "Carlos Mendes",
            "Elisa Ferraz", "Bruno Carvalho", "Clara Gomes", "Diogo Matos", "Fábio Almeida",
            "Gustavo Pires", "Helena Bastos", "Inês Tavares", "Alex Viana", "Jonas Marques",
            "Lara Guedes", "Marcos Andrade", "Nuno Rocha", "Oscar Barreto", "Paula Ribeiro",
            "Ricardo Nunes", "Sofia Pereira", "Ari Costa", "Tiago Furtado", "Vera Mota",
            "Beatriz Lima", "Bruno Carvalho", "Carlos Mendes", "Clara Gomes", "Diogo Matos",
            "Elisa Ferraz", "Fábio Almeida", "Gustavo Pires", "Helena Bastos", "Inês Tavares",
            "Jonas Marques", "Lara Guedes", "Marcos Andrade", "Nuno Rocha", "Alex Viana",
            "Oscar Barreto"
        };

        // Vetor de Gêneros
        String[] genres = {
            "Fantasia Sombria", "Ficção Científica", "Viagem no Tempo", "Suspense Psicológico", "Alta Fantasia",
            "Fantasia Sombria", "Aventura", "Mitologia", "Distopia", "Realismo Mágico",
            "Aventura", "Terror Gótico", "Fantasia Épica", "Aventura", "Ficção Literária",
            "Steampunk", "Aventura Marítima", "Alta Fantasia", "Poesia", "Ficção Científica",
            "Fantasia Épica", "Alta Fantasia", "Mistério", "Distopia", "Terror Gótico",
            "Ficção Científica", "Ação", "Realismo Mágico", "Suspense", "Mitologia",
            "Fantasia Sombria", "Ficção Literária", "Fantasia", "Terror", "Fantasia Épica",
            "Suspense Psicológico", "Ficção Filosófica", "Realismo Mágico", "Ficção Científica", "Drama",
            "Distopia", "Aventura", "Fantasia", "Ação", "Ficção Literária",
            "Pós-apocalíptico", "Drama", "Mistério", "Ficção Científica", "Mitologia",
            "Mistério", "Distopia", "Fantasia Sombria", "Realismo Mágico", "Terror",
            "Suspense Psicológico", "Aventura Marítima", "Ficção Filosófica", "Fantasia", "Alta Fantasia",
            "Terror", "Fantasia Épica", "Poesia", "Ficção Científica", "Alta Fantasia",
            "Mistério", "Pós-apocalíptico", "Terror Gótico", "Ação", "Ficção Científica",
            "Suspense", "Fantasia", "Aventura", "Distopia", "Fantasia Épica",
            "Mitologia", "Terror Gótico", "Aventura", "Mistério", "Fantasia",
            "Distopia", "Terror", "Ficção Científica", "Aventura", "Ficção Literária",
            "Terror Gótico", "Pós-apocalíptico", "Alta Fantasia", "Suspense", "Ação",
            "Realismo Mágico", "Ficção Científica", "Suspense", "Fantasia Sombria", "Aventura",
            "Fantasia", "Mitologia", "Terror", "Aventura Marítima", "Distopia",
            "Ficção Psicológica"
        };

        // Vetor de Títulos
        String[] titles = {
            "O Jardim das Sombras", "A Cidade de Vidro", "O Eco do Tempo", "Sussurros na Névoa", "O Último Guardião",
            "A Chave de Ossos", "Crônicas do Sol Poente", "O Lamento da Serpente", "O Espelho Quebrado", "Memórias de Poeira",
            "A Ilha Esquecida", "Onde Cantam os Corvos", "Sangue e Cinzas", "A Fronteira do Amanhecer", "A Geometria da Água",
            "O Relojoeiro Cego", "O Navio de Sal", "O Trono de Inverno", "Canção do Silêncio", "A Queda do Cometa",
            "O Arquipélago de Fogo", "A Torre de Marfim", "O Alfabeto Secreto", "O Vento do Norte", "A Cor da Meia-Noite",
            "O Fim da Eternidade", "Marés de Guerra", "A Casa dos Mil Corredores", "O Homem que Roubava Sonhos", "A Filha do Caos",
            "O Labirinto do Fauno", "Onde o Mar Encontra o Céu", "A Biblioteca de Fumaça", "O Ritual da Lua Sangrenta", "O Prisioneiro do Gelo",
            "A Sombra da Montanha", "O Fim do Silêncio", "A Menina que Colecionava Tempestades", "A Máquina de Nuvens", "O Peso do Ar",
            "Antes da Queda", "A Estrada de Sal e Estrelas", "O Pacto das Águas", "O Horizonte de Fogo", "A Teoria dos Pássaros",
            "Onde os Deuses Morrem", "O Último Verão", "A Cidade Submersa", "O Décimo Terceiro Andar", "O Fio de Ariadne",
            "O Enigma do Farol", "A Ilha de Plástico", "A Música dos Ossos", "O Mar sem Estrelas", "A Noite do Caçador",
            "O Vale dos Ecos", "Sob o Céu de Chumbo", "A Memória do Vento", "O Circo Mecânico", "O Destino do Rei",
            "A Pele Fria", "A Guerra dos Deuses Antigos", "O Atlas de Nuvens", "A Lógica do Caos", "A Ascensão Vermelha",
            "O Segredo do Vale", "O Tempo e a Sombra", "O Castelo de Névoa", "O Sol da Meia-Noite", "A Cidade dos Fantasmas",
            "O Colecionador de Olhos", "O Sussurro do Mundo", "A Filha do Navegador", "O Fim do Horizonte", "A Canção do Abismo",
            "O Coração da Terra", "A Floresta de Dentes", "A Viagem de Argos", "O Livro de Areia", "A Cidade dos Mil Sinos",
            "O Império de Cinzas", "O Rio das Almas Perdidas", "O Pássaro de Fogo", "A Sombra do Colosso", "A Paciência das Árvores",
            "A Sétima Noite", "O Deus Adormecido", "A Queda de Aerthos", "Onde a Luz não Chega", "O Fim do Caminho",
            "A Arquiteta de Sonhos", "O Projeto Lazarus", "A Chave do Mestre", "A Senhora da Névoa", "O Mapa de Sal",
            "O Observador Silencioso", "O Fio Vermelho", "A Última Vigília", "O Mar de Ferro", "A Pele do Mundo",
            "O Homem Duplicado"
        };

        // Vetor de Editoras
        String[] publishers = {
            "Editora Coruja Sábia", "Edições Pluma Dourada", "Gráfica Horizonte Aberto", "Publicações da Meia-Noite", "Imprensa do Novo Mundo",
            "Editora Coruja Sábia", "Livros do Observatório", "A Tinta Escarlate", "Edições Pluma Dourada", "Papiro Digital",
            "Biblioteca do Futuro", "Publicações da Meia-Noite", "Selo Meridional", "Imprensa do Novo Mundo", "Editora Coruja Sábia",
            "Gráfica Horizonte Aberto", "Edições Pluma Dourada", "A Tinta Escarlate", "A Tinta Escarlate", "Livros do Observatório",
            "Papiro Digital", "Edições Pluma Dourada", "Papiro Digital", "Biblioteca do Futuro", "Publicações da Meia-Noite",
            "Biblioteca do Futuro", "Selo Meridional", "Gráfica Horizonte Aberto", "Imprensa do Novo Mundo", "Editora Coruja Sábia",
            "Livros do Observatório", "A Tinta Escarlate", "Gráfica Horizonte Aberto", "Publicações da Meia-Noite", "Edições Pluma Dourada",
            "Publicações da Meia-Noite", "Papiro Digital", "Biblioteca do Futuro", "Selo Meridional", "Editora Coruja Sábia",
            "Imprensa do Novo Mundo", "Livros do Observatório", "Editora Coruja Sábia", "Imprensa do Novo Mundo", "A Tinta Escarlate",
            "Biblioteca do Futuro", "Selo Meridional", "Gráfica Horizonte Aberto", "Biblioteca do Futuro", "Gráfica Horizonte Aberto",
            "Imprensa do Novo Mundo", "Papiro Digital", "Livros do Observatório", "A Tinta Escarlate", "Publicações da Meia-Noite",
            "Publicações da Meia-Noite", "Edições Pluma Dourada", "Papiro Digital", "Biblioteca do Futuro", "Edições Pluma Dourada",
            "Editora Coruja Sábia", "Livros do Observatório", "A Tinta Escarlate", "Selo Meridional", "Imprensa do Novo Mundo",
            "Gráfica Horizonte Aberto", "Biblioteca do Futuro", "Publicações da Meia-Noite", "Selo Meridional", "Biblioteca do Futuro",
            "Imprensa do Novo Mundo", "Editora Coruja Sábia", "Papiro Digital", "Gráfica Horizonte Aberto", "Livros do Observatório",
            "A Tinta Escarlate", "Publicações da Meia-Noite", "Edições Pluma Dourada", "Papiro Digital", "Biblioteca do Futuro",
            "Imprensa do Novo Mundo", "Editora Coruja Sábia", "Selo Meridional", "Livros do Observatório", "A Tinta Escarlate",
            "Publicações da Meia-Noite", "Biblioteca do Futuro", "Imprensa do Novo Mundo", "Publicações da Meia-Noite", "Selo Meridional",
            "Gráfica Horizonte Aberto", "Biblioteca do Futuro", "Imprensa do Novo Mundo", "Editora Coruja Sábia", "Papiro Digital",
            "Livros do Observatório", "A Tinta Escarlate", "Publicações da Meia-Noite", "Edições Pluma Dourada", "Gráfica Horizonte Aberto",
            "Papiro Digital"
        };

        for(int i = 0; i < 100; i++) {
            books.add(new Book(titles[i], authors[i], genres[i], publishers[i]));
        }

        cat = new Catalog(books);

        while(true) {
            System.out.println("Selecione a opção desejada: \n 1 - Consultar catálogo de livros \n 2 - Consultar catálogo filtrado por autor\n 3 - Consultar catálogo filtrado por gênero\n 4 - sair");
            int op = keyboard.nextInt();
            keyboard.nextLine();

            if (op == 1){
                cat.showAllBooks();
            }

            else if(op == 2){
                System.out.println("Por qual autor deseja filtrar?");
                String author = keyboard.nextLine();
                BookFilterStrategy strategy = new AuthorFilterStrategy(author);
                cat.setFilterStrategy(strategy);
                cat.filterBooks();
            }

            else if(op == 3){
                System.out.println("Por qual gênero deseja filtrar?");
                String genre = keyboard.nextLine();
                BookFilterStrategy strategy = new GenreFilterStrategy(genre);
                cat.setFilterStrategy(strategy);
                cat.filterBooks();
            }

            else if(op == 4){
                break;
            }
        }
    }
}
