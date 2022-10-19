public class produto {

    private String descricao;
    private double preco;

    public produto(String descricao, double preco){
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao(){
        return descricao;
    }

    public double getPreco(){
        return preco;
    }

    public void informar(){}

}
