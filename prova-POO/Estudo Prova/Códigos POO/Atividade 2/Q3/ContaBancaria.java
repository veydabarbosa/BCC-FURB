package Q3;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;
    public static int quantidadeContas;

    public ContaBancaria() {
        quantidadeContas++;
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Não é possivel depositar numeros negativos!");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("O valor deve ser maior que 0 e deve ser menor ou igual ao saldo da conta!");
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor){
        if (valor > 0 && this.saldo >= valor) {
            sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Valor negativo ou saldo insulficiente.");
        }
    }
}