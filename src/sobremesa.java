public class sobremesa extends produto {

    private String tamanho;

    sobremesa(String tamanho, String descricao, double preco){
        super(descricao, preco);
        this.tamanho = tamanho;
    }

    public String getTamanho(){
        return tamanho;
    }

    @Override
    public void informar() {
        System.out.println("Sobremesa " + getTamanho() + ", " + getDescricao() + ", R$" + getPreco());
    }

}
