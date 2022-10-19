public class combo {

    private burger bg;
    private bebida bb;
    private sobremesa s;

    public void criarCombo(int tipo){
        if(tipo == 1){
            bg = new burger(100, "smash bovino", 32.5);
            bb = new bebida(350, "coca-cola", 7);
            s = new sobremesa("pequeno", "sorvete de flocos", 12);
        }
        else{
            bg = new burger(100, "smash suíno", 29.5);
            bb = new bebida(600, "suco de maracujá", 11);
            s = new sobremesa("grande", "torta holandesa", 25);
        }
    }

    public void visualizarCombo()
    {
        bg.informar();
        bb.informar();
        s.informar();
        System.out.println("\nPreço final: R$" + (bg.getPreco() + bb.getPreco() + s.getPreco()));
        System.out.println("Preço final com desconto: R$" + (bg.getPreco() * 0.8 + bb.getPreco() * 0.95 + s.getPreco() * 0.7));
    }

}
