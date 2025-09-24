package Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ContaBancaria[] contas = new ContaBancaria[2];

        for(int i = 0; i < contas.length; i++){
            contas[i] = new ContaBancaria();

            System.out.println("Digite o numero da conta: ");
            contas[i].setNumero(scan.nextLine());
            System.out.println("Digite o titular da conta: ");
            contas[i].setTitular(scan.nextLine());
        }

        System.out.println();

        contas[0].depositar(1000);
        System.out.println("DEPOSITADO R$1000 NA CONTA " + contas[0].getNumero());
        contas[1].depositar(500);
        System.out.println("DEPOSITADO R$500 NA CONTA " + contas[1].getNumero());

        System.out.println();

        for(int i=0; i < contas.length; i++){
            System.out.println("Numero: " + contas[i].getNumero() + ", Titular: " + contas[i].getTitular() + ", saldo: " + contas[i].getSaldo());
        }

        System.out.println();

        contas[0].sacar(100);
        System.out.println("SACADO R$100 DA CONTA " + contas[0].getNumero());
        contas[1].sacar(50);
        System.out.println("SACADO R$50 DA CONTA " + contas[1].getNumero());

        System.out.println();

        for(int i=0; i < contas.length; i++){
            System.out.println("Numero: " + contas[i].getNumero() + ", Titular: " + contas[i].getTitular() + ", saldo: " + contas[i].getSaldo());
        }

        System.out.println();

        contas[0].transferir(contas[1], 200);
        System.out.println("TRANSFERIDO R$200 DA CONTA " + contas[0].getNumero() + "PARA A CONTA " + contas[1].getNumero());

        System.out.println();

        for(int i=0; i < contas.length; i++){
            System.out.println("Numero: " + contas[i].getNumero() + ", Titular: " + contas[i].getTitular() + ", saldo: " + contas[i].getSaldo());
        }

        System.out.println();

        System.out.println("Quandiade de contas criadas: " + ContaBancaria.quantidadeContas);

        System.out.println("------------------------------------------------------------");
        System.out.println("teste de erros: ");
        contas[0].depositar(-100);
        contas[0].sacar(-200);
        contas[0].sacar(800);
        contas[1].transferir(contas[0], -200);
        contas[1].transferir(contas[0], 1000);
        
        scan.close();
    }
}
