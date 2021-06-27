package treinoExtends;

import java.util.Locale;
import java.util.Scanner;

public class PaginMain {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Informe o nome: ");
        String nome = sc.nextLine();
        System.out.print("Informe a conta: ");
        int conta = sc.nextInt();
        System.out.print("Informe o valor inicial: R$ ");
        double valor = sc.nextDouble();

        OperadorUm dado = new OperadorUm(nome, conta, valor);

        System.out.print(dado);

        System.out.print("\nInforme o valor do deposito: R$ ");
        double deposito = sc.nextDouble();

        Operando dados = new Operando(nome, conta, valor, deposito);

        System.out.print(dados);

        sc.close();

    }

}