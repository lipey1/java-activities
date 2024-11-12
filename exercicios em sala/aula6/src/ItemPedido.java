import java.util.ArrayList;

public class ItemPedido {
    private Produto produto;
    private Integer qtd;

    public ArrayList ItemPedido(Produto produto, Integer qtd) {
        this.produto = produto;
        this.qtd = qtd;
        return new ArrayList<>(produto, qtd);
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }
}