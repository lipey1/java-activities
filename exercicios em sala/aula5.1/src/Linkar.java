public class Linkar
{
    public static void main(String[] args)
    {
        Autor autor = new Autor("Pedro", "Eslováquio");
        Autor autor2 = new Autor("Lucas", "Pedro");
        Livro livro1 = new Livro("o senhor dos aneis", "jdioajwd21");
        Livro livro2 = new Livro("o senhor dos aneis 2", "dqwde12e22");

        autor.escreverLivro(livro1);
        autor.escreverLivro(livro2);
        autor2.escreverLivro(livro1);







        System.out.println(autor);
    }
}
