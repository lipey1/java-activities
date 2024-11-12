public class Livro {

    private String nome;
    private String isbn;

    public Livro(String nome, String isbn) {
        this.nome = nome;
        this.isbn = isbn;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "isbn='" + isbn + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}