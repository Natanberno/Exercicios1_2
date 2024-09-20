import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private List<Pagina> paginas;
    private int contadorPaginas = 0;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = new ArrayList<>();
    }

    public void adicionarPagina(String conteudo) {
        contadorPaginas++;
        Pagina pagina = new Pagina(contadorPaginas, conteudo);
        paginas.add(pagina);
    }

    public List<Pagina> getPaginas() {
        return paginas;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + " de " + autor + ", com " + paginas.size() + " páginas.";
    }
}
