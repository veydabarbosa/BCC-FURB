public class Aluno {
    private String nome;
    private int matricula;
    private int idade;
    private double peso;
    private double altura;
    private Instrutor instrutor;
    private PlanoTreino planoTreino;

    public Aluno (String nome, Instrutor instrutor){
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public Aluno (String nome, int matricula, int idade, double peso, double altura, Instrutor instrutor){
        this(nome, instrutor);
        this.matricula = matricula;
        this.peso = peso;
        this.altura = altura;
        setIdade(idade);
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa!");
        } 
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Instrutor getInstrutor(){
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public PlanoTreino getPlanoTreino() {
        return planoTreino;
    }

    public void setPlanoTreino(PlanoTreino planoTreino) {
        this.planoTreino = planoTreino;
    }
}
