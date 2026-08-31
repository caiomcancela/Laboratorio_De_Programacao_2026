package banco;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int operador = 0;

        Banco c1 = new Banco(1, 1, "Banco UNIFAGOC");

        while (operador != 4 && operador != 5) {

            System.out.println("\n======= SISTEMA BANCÁRIO =======");
            System.out.println("1 - Creditar");
            System.out.println("2 - Debitar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Encerrar Conta");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            operador = input.nextInt();
            input.nextLine();

            if (operador >= 1 && operador <= 5) {
                switch (operador) {
                    case 1:
                        if (c1.getTipo() != 4) {
                            System.out.print("Digite o valor para crédito: R$ ");
                            double credito = input.nextDouble();
                            if (credito > 0) {
                                c1.creditar(credito);
                                System.out.println("Valor creditado!");
                            } else {
                                System.out.println("O valor deve ser maior que zero.");
                            }
                        } else {
                            System.out.println("Não é possível creditar. Conta encerrada.");
                        }

                        break;

                    case 2:
                        if (c1.getTipo() != 4) {
                            System.out.print("Digite o valor para débito: R$ ");
                            double debito = input.nextDouble();

                            if (debito > 0) {
                                c1.debitar(debito);
                                System.out.println("Valor Debitado!");
                            } else {
                                System.out.println("O valor deve ser maior que zero.");
                            }
                        } else {
                            System.out.println( "Não é possível debitar. Conta encerrada.");
                        }

                        break;

                    case 3:
                        System.out.print("Digite o numero da conta: ");
                        int numeroConta = input.nextInt();
                        input.nextLine();
                        System.out.println(c1.consultar_saldo(numeroConta));
                        break;

                    case 4:
                        if (c1.getSaldo() < 0) {
                            System.out.println("Nao é possível encerrar uma conta com saldo negativo.");
                            operador = 0;

                        } else {
                            c1.encerrarConta();
                            System.out.println(c1.textoEncerrar());
                        }
                        break;

                    case 5:
                        System.out.println("Sistema encerrado.");
                        break;
                }
            } else {
                System.out.println("Opção inválida. Einputolha uma opção entre 1 e 5.");
                operador = 0;
            }
        }
    }
}
