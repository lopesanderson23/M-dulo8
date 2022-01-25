public abstract class Conta implements Tributavel {
    public int numero;
    protected String titular;
    private String banco;
    protected String tipoconta;
    public double saldo;
    public int saques;
    static int qtdcontas = 0;


    public Conta(String titular, int opcao, String tipoconta, int saques) {

        this.titular = titular;
        qtdcontas++;
        this.numero=qtdcontas;
        this.saldo = 0;
        this.saques = saques;
        this.tipoconta= tipoconta;
    }


    public void DadosBancarios() {

        System.out.println(" ");
        System.out.println(" --- DADOS BANCÁRIOS --- ");
        System.out.println(" - Número :" + this.numero);
        System.out.println(" - Titular :" + this.titular);
        System.out.println(" - Tipo de conta:" + this.tipoconta);
        System.out.println(" - Saldo :" + this.saldo );
        System.out.println(" ");
    }

    public void Depositar(double pValor) {

        System.out.println(" ");
        System.out.println(" --- Realizando depósito --- ");
        System.out.println(" - Saldo Anterior: " + this.saldo);

        this.saldo += pValor;


        System.out.println(" --- Saldo Posterior:" + this.saldo);
        System.out.println(" --- Fim do Depósito ---");
        System.out.println(" ");
    }

    public double Sacar(double pValor) {

        System.out.println(" ");
        System.out.println(" --- Realizando saque --- ");
        System.out.println(" - Saldo Anterior: " + this.saldo);

        if (pValor <= this.saldo) {
            this.saldo -= pValor;
            System.out.println("- Saldo Posterior: " + this.saldo);


        }else
            System.out.println("--- Fim do Saque ---");


        return pValor;
    }



    public void Transferir(Conta pDest, double pValor) {

        System.out.println(" ");
        System.out.println(" --- Realizando Transferencia --- ");
        System.out.println(" - Saldo Anterior Origem: " + this.saldo);
        System.out.println(" - Saldo Anterior Destino: " + pDest.saldo);

        if (pValor <= this.saldo) {
            this.saldo -= pValor;
            pDest.saldo += pValor;
            System.out.println("- Saldo Posterior Origem: " + this.saldo);
            System.out.println(" - Saldo Posterior destino: " + pDest.saldo);
        } else {

            System.out.println("--- Saldo Insuficiente ---");

        }


        System.out.println("--- Fim da Transferência ---");
        System.out.println();

    }



    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", banco='" + banco + '\'' +
                ", tipoconta='" + tipoconta + '\'' +
                ", saldo=" + saldo +
                ", saques=" + saques +
                '}';
    }

    public int getSacar() {
        return saques;
    }

    public void setSacar(int sacar) {
        this.saques = saques;
    }

    public double getSaldo(int i) {
        return saldo;
    }

    public static int getQtdcontas() {
        return qtdcontas;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public String getTipoconta() {
        return tipoconta;
    }

    public void setTipoconta(String tipoconta) {
        this.tipoconta = tipoconta;
    }
}










