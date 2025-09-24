import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pessoa p1 = new Pessoa();

        System.out.println("Digite seu nome: ");
        p1.setNome(scan.nextLine());
        System.out.println("Digite sua altura: ");
        p1.setAltura(scan.nextDouble());
        System.out.println("Digite seu peso: ");
        p1.setPeso(scan.nextDouble());

        System.out.println("Nome: " + p1.getNome() + ", " + "Altura: " + String.format("%.2f", p1.getAltura()) + "," + " Peso: " + p1.getPeso() + "," + " IMC: " + String.format("%.2f", p1.calcularImc()));
        scan.close();
    }
}