public class Cachorro extends Animal{

    private String porte;
    public Cachorro(String nome, Integer idade, String porte) {
        super(nome, idade);
        this.porte = porte;
    }

    public String getPorte() {
        return porte;
    }

    @Override
    public String toString() {
        return "Cachorro\n" +
                "nome:'" + getNome() + '\'' +
                "idade:'" + getIdade() + '\'' +
                "porte:'" + porte + '\'' +
                '}';
    }
}
