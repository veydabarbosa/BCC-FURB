public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.setNome("Vitor");
        p1.setAltura(1.80);
        p1.setPeso(100);
        p1.calcularImc();

        System.out.println("Nome: " + p1.getNome() + ", " + "Altura: " + String.format("%.2f", p1.getAltura()) + "," + " Peso: " + p1.getPeso() + "," + " IMC: " + String.format("%.2f", p1.calcularImc()));
    }
}
