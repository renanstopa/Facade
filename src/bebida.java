public class bebida extends produto {

    private int ml;

    bebida(int ml, String descricao, double preco){
        super(descricao, preco);
        this.ml = ml;
    }

    public int getMl(){
        return ml;
    }

    @Override
    public void informar() {
        System.out.println("Bebida de " + getMl() + " mls, " + getDescricao() + ", R$" + getPreco());
    }

}
