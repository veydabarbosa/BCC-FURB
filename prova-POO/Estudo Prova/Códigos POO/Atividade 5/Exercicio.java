public class Exercicio {
    private String nome;
    private int series;
    private int repeticoes;
    private double carga;

    public Exercicio(String nome, int series, int repeticoes, double carga){
        this.nome = nome;
        this.series = series;
        this.repeticoes = repeticoes;
        this.carga = carga;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }
    
    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public String getResumo(){
       return String.format("%s: %d séries de %d repetições com %.1f kg.", 
				nome, series, repeticoes, carga);
    }
}
