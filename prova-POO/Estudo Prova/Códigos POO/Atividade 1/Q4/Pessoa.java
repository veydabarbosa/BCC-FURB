package Q4;
public class Pessoa {
    private String nome;
    private double altura;
    private double peso;

    /** 
     * @return String
     */
    public String getNome() {
        return nome;
    }

    /** 
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /** 
     * @return double
     */
    public double getAltura() {
        return altura;
    }
    
    /** 
     * @param altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /** 
     * @return double
     */
    public double getPeso() {
        return peso;
    }

    /** 
     * @param peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    /** 
     * @return double
     */
    public double calcularImc(){
        return peso / (altura * altura);
    }
}