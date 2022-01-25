public  class ContaCorrente extends Conta implements Tributavel {
    private double chequeEspecial;
    private double limiteSaque;


    public ContaCorrente(String titular, int opcao, String tipoconta, int saques, double chequeEspecial, double limiteSaque) {
        super(titular, opcao, tipoconta, saques);
        this.chequeEspecial = chequeEspecial;
        this.limiteSaque = limiteSaque;
    }

    @Override
    public double getValorImpostoSaque() {
        double valor = 0;
        valor = this.saldo*0.6;
        return valor;

    }


    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", tipoconta='" + tipoconta + '\'' +
                ", saldo=" + saldo +
                ", chequeEspecial=" + chequeEspecial +
                ", limiteSaque=" + limiteSaque +
                '}';
    }
}










