public class Carro{
    public String modelo;
    public String marca;
    public String cor;
    public int ano;
    public int potencia;
    public float valor;
    public int velocidade;
    public int velocidadeMax;


    //Construtor padrao, faz com que nao seja obrigatorio instanciar a classe, tipo (new Carro("roxo","teste"))


    public Carro(int ano, String cor, String marca, String modelo, int potencia, float valor, int velocidade, int velocidadeMax){
        this.ano = ano;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.valor = valor;
        this.velocidade = velocidade;
        this.velocidadeMax = velocidadeMax;
    }

    public static int Acelerar(int velocidade, int velocidadeMax){
        velocidade += 10;
        System.out.println("Tu acelerou 10km, fica esperto");
        if(velocidade > velocidadeMax){
            System.out.println("nao da mais fi");
            return velocidade - 10;
        } else return velocidade;
    }

    public static int Frear(int velocidade){
        velocidade -= 10;
        System.out.println("Tu diminuiu a potencia, vai fundo");
        if (velocidade <= 0){
            System.out.println("ce ta parado burrao");
            return 0;
        } else return velocidade;
    }
    public static int Parar(int velocidade){
        if(velocidade <= 0){
            System.out.println("Voce ja ta parado seu animal");
        } else if (velocidade >= 30){
        System.out.println("Voce puxou com tudo o freio de mão e morreu. Boa");
        System.exit(0);
        } else {
            System.out.println("Tu parou normalmente, nada demais");
            return 0;
        }
        return velocidade;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "ano=" + ano +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", potencia=" + potencia +
                ", valor=" + valor +
                ", velocidade=" + velocidade +
                '}';
    }
}

