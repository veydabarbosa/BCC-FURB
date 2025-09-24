package Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pessoa pessoas[] = new Pessoa[3];

        for(int i = 0; i < pessoas.length; i++){
            pessoas[i] = new Pessoa();

            System.out.println("Digite o nome da pessoa " + (i+1) + ":");
            pessoas[i].setNome(scan.nextLine());
            System.out.println("Digite a altura da pessoa " + (i+1) + ":");
            pessoas[i].setAltura(scan.nextDouble());
            System.out.println("Digite o peso da pessoa " + (i+1) + ":");
            pessoas[i].setPeso(scan.nextDouble());
            scan.nextLine();
    }

    for(int i = 0; i < pessoas.length; i++){
        System.out.println("Nome: " + pessoas[i].getNome() + ", " + "Altura: " + String.format("%.2f", pessoas[i].getAltura()) + "," + " Peso: " + pessoas[i].getPeso() + "," + " IMC: " + String.format("%.2f", pessoas[i].calcularImc()));
    }
    scan.close();
}
}