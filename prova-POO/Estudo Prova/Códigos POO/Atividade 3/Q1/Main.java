import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Funcionario funcionarios[] = new Funcionario[3];

        for(int i = 0; i < funcionarios.length; i++){
            funcionarios[i] = new Funcionario();

            System.out.println("Digite o nome do funcionário");
            funcionarios[i].setNome(scan.nextLine());
            System.out.println("Digite o salário do funcionário: ");
            funcionarios[i].setSalario(scan.nextDouble());
            scan.nextLine();
        }

        for(int i = 0; i < funcionarios.length; i++){
            System.out.println("Funcionário: " + funcionarios[i].getNome() + " , Salário: " + funcionarios[i].getSalario() + " ; IRPF: " + String.format("%.2f", funcionarios[i].calcularIrpf()));
        }

        scan.close();
    }
}
