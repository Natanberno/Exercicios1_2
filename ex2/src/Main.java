public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("O Senhor dos Anéis", "nao sei");

        livro.adicionarPagina("Em uma toca no chão vivia um hobbit...");
        livro.adicionarPagina("O condado era pacífico...");

        System.out.println(livro);

        for (Pagina pagina : livro.getPaginas()) {
            System.out.println(pagina);
        }
    }
}
