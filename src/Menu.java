import java.util.ArrayList;
import java.util.Scanner;

public class Menu{




    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String titular;
        String tipoconta;
        int opcao, numero, numero2, saques = 0;
        double valor;
        ArrayList<Conta> contas = new ArrayList<>();
        Conta c1,c2;


        do {

            System.out.println(" ");
            System.out.println(" --- MENU --- ");
            System.out.println(" 1) CRIAR CONTA");
            System.out.println(" 2) DADOS BANCARIOS");
            System.out.println(" 3) DEPÓSITO");
            System.out.println(" 4) SAQUE ");
            System.out.println(" 5) TRANSFERÊNCIA");
            System.out.println(" 6) SALDO TOTAL DE CONTAS");
            System.out.println(" 0) SAIR ");

            System.out.print(" OPÇÃO: ");
            opcao = in.nextInt();
            in.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print(" Digite o nome do Titular: ");
                    titular = in.nextLine();

                    System.out.print(" Digite o Tipo de Conta: ");
                    tipoconta = in.nextLine();
                    c1 = new Conta(titular, opcao, tipoconta, saques) {

                        @Override
                        public double getValorImpostoSaque() {
                            return 0;
                        }
                    };
                    contas.add(c1);

                }
                case 2 -> {
                    System.out.print(" Digite o número da conta ");
                    numero = in.nextInt();
                    c1 = contas.get(numero - 1);
                    c1.DadosBancarios();
                }
                case 3 -> {
                    System.out.print(" Digite o número da conta ");
                    numero = in.nextInt();
                    c1 = contas.get(numero - 1);
                    System.out.println(" DIGITE O VALOR DO DEPÓSITO:");
                    valor = in.nextDouble();
                    c1.Depositar(valor);
                }
                case 4 -> {

                    System.out.print(" Digite o número da conta ");
                    numero = in.nextInt();
                    c1 = contas.get(numero -1);
                    System.out.println(" DIGITE O VALOR DO SAQUE:");
                    valor = in.nextDouble();

                    c1.Sacar(valor);

                }
                case 5 -> {
                    System.out.print(" Digite o número da conta de origem ");
                    numero = in.nextInt();
                    c1 = contas.get(numero - 1);
                    System.out.print(" Digite o número da conta de destino ");
                    numero2 = in.nextInt();
                    c2 = contas.get(numero2 - 1);
                    System.out.println(" DIGITE O VALOR DA TRANSFERÊNCIA:");
                    valor = in.nextDouble();
                    c1.Transferir(c2, valor);
                }
                case 6 -> {
                    System.out.println(" - Saldo Total de Contas :");
                    System.out.println(contas.get(0).getSaldo(0) + contas.get(1).getSaldo(0));

                }
                default -> System.out.println(" OBRIGADO PROCESSO FINALIZADO ");
            }


        } while (opcao != 0);

    }

}

