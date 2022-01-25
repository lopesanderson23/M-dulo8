public abstract class ContaPoupanca  extends Conta{

    private final double taxadeJuros;
    private final int diaAniversario;

    public ContaPoupanca(String titular, int opcao, String tipoconta, int saques, double taxadeJuros, int diaAniversario) {
        super(titular, opcao, tipoconta, saques);
        this.taxadeJuros = taxadeJuros;
        this.diaAniversario = diaAniversario;
    }

    public double getTaxadeJuros() {
        return taxadeJuros;
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", tipoconta='" + tipoconta + '\'' +
                ", saldo=" + saldo +
                ", taxadeJuros=" + taxadeJuros +
                ", diaAniversario=" + diaAniversario +
                '}';
    }


}
