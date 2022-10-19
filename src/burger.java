public class burger extends produto {

    private int gramas;

    burger(int gramas, String descricao, double preco){
        super(descricao, preco);
        this.gramas = gramas;
    }

    public int getGramas(){
        return gramas;
    }

    @Override
    public void informar() {
        System.out.println("\nBurger de " + getGramas() + " gramas, " + getDescricao() + ", R$" + getPreco());
    }

}
