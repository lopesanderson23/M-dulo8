public class ContaSalario extends Conta implements Tributavel {
    private int limiteSaque;
    protected double saldo;


    public ContaSalario(String titular, int opcao, String tipoconta, int saques, int limiteSaque, double saldo) {
        super(titular, opcao, tipoconta, saques);
        this.limiteSaque = limiteSaque;
        this.saldo = saldo;
    }

    public void Limite(int lSaque) {
        if (lSaque >= 2) {
            System.out.println("Limite de saque Excedido");
        } else {

            System.out.println(" ------------------- ");
        }
    }

    @Override
    public double getValorImpostoSaque() {
        double valor = 0;
        valor = this.saldo * 0.2;
        return valor;
    }

    @Override
    public String toString() {
        return "ContaSalario{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", tipoconta='" + tipoconta + '\'' +
                ", saldo=" + saldo +
                ", limiteSaque=" + limiteSaque +
                ", saldo=" + saldo +
                '}';
    }
}


