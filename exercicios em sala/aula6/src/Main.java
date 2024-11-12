public class Main {
    public static void main(String[] args) {
        Produto prod = new Produto("teste", 321.32);
        Produto prod2 = new Produto("teste2", 412.32);

        Endereco endereco = new Endereco("Rua teste", "Cidade Z", "3141", "Almirando souza");

        Cliente cli = new Cliente(endereco, "Paulo");

        Pedido pedido = new Pedido(1, Cliente, endereco);

        pedido.adicionarItem(new ItemPedido(prod, 1));

    }
}