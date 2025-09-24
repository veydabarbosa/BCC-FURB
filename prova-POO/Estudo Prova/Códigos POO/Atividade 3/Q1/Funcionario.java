public class Funcionario {
    private String nome;
    private double salario;

    private static double faixa1 = 1903.98;
    private static double faixa2 = 2826.65;
    private static double faixa3 = 3751.05;
    private static double faixa4 = 4664.68;

    private static double percentualFaixa2 = 7.5;
    private static double percentualFaixa3 = 15.0;
    private static double percentualFaixa4 = 22.5;
    private static double percentualFaixa5 = 27.5;

    private static double cemPorcento = 100.0;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("Salário não pode ser negativo!");
        }
    }

    public double getSalario() {
        return salario;
    }

    public double calcularIrpf(){
        double imposto = 0;
        double diferenca = 0;

        if (salario > faixa1) {
			if (salario <= faixa2) {
				diferenca = salario - faixa1;
				imposto = diferenca * (percentualFaixa2 / cemPorcento);
			} else if (salario <= faixa3) {
				diferenca = faixa2 - faixa1;
				imposto = diferenca * (percentualFaixa2 / cemPorcento);

				diferenca = salario - faixa2;
				imposto += diferenca * (percentualFaixa3 / cemPorcento);
			} else if (salario <= faixa4) {
				diferenca = faixa2 - faixa1;
				imposto = diferenca * (percentualFaixa2 / cemPorcento);

				diferenca = faixa3 - faixa2;
				imposto += diferenca * (percentualFaixa3 / cemPorcento);

				diferenca = salario - faixa3;
				imposto += diferenca * (percentualFaixa4 / cemPorcento);
			} else {
				diferenca = faixa2 - faixa1;
				imposto = diferenca * (percentualFaixa2 / cemPorcento);

				diferenca = faixa3 - faixa2;
				imposto += diferenca * (percentualFaixa3 / cemPorcento);

				diferenca = faixa4 - faixa3;
				imposto += diferenca * (percentualFaixa4 / cemPorcento);

				diferenca = salario - faixa4;
				imposto += diferenca * (percentualFaixa5 / cemPorcento);
			}
		}
        return imposto;
    }
}
