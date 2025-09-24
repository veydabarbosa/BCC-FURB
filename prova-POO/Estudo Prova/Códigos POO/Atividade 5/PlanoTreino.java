import java.util.ArrayList;

public class PlanoTreino {
    private String descricao;
    private int nivel;
    private boolean ativo;
    private Aluno aluno;
    private ArrayList<Exercicio> exercicios = new ArrayList<>();

    public PlanoTreino(String descricao){
        setDescricao(descricao);
        this.ativo= true;
    }

    public PlanoTreino(String descricao, int nivel, boolean ativo){
        setDescricao(descricao);
        this.nivel = nivel;
        this.ativo = ativo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.isEmpty()) {
            throw new IllegalArgumentException("A descrição não pode ser vazia!");
        }
        this.descricao = descricao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public boolean getAtivo(){
        return ativo;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void ativar(){
       this.ativo = true;
    }

    public void desativar(){
        this.ativo = false;
    }

    public void adicionarExercicio(Exercicio exercicios) {
        this.exercicios.add(exercicios);
    }

    public void removerExercicios(Exercicio exercicios) {
        this.exercicios.remove(exercicios);
    }

    public ArrayList<Exercicio> getExercicios(){
        return exercicios;
    }
}
