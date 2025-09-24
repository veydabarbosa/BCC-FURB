import java.util.ArrayList;

public class Instrutor {
    private String nome;
    private String cref;
    private String especialidade;
    private ArrayList<Aluno> alunos;
    private Instrutor mentor;

    public Instrutor(String nome, String cref, String especialidade){
        this.nome = nome;
        this.cref = cref;
        this.especialidade = especialidade;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCref() {
        return cref;
    }

    public void setCref(String cref) {
        this.cref = cref;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Instrutor getMentor() {
        return mentor;
    }

    public void setMentor(Instrutor mentor) {
        this.mentor = mentor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);
    }

    public String getResumo() {
    String resumo = "Instrutor: " + nome + 
                    " | CREF: " + cref + 
                    " | Especialidade: " + especialidade;
    if (mentor != null) {
        resumo += " | Mentor: " + mentor.getNome();
    }
    return resumo;
    }

    /**
     * versão do professor:
     * 
    public String getResumo() {
		StringBuilder resumo = new StringBuilder();
		resumo.append("Instrutor: ").append(nome).append("\n");
		resumo.append("CREF: ").append(cref).append("\n");
		resumo.append("Especialidade: ").append(especialidade).append("\n");

		if (mentor != null) {
			resumo.append("Mentor: ").append(mentor.getNome()).append("\n");
		} else {
			resumo.append("Mentor: Nenhum\n");
		}

		resumo.append("Alunos:\n");
		if (alunos != null && !alunos.isEmpty()) {
			for (Aluno aluno : alunos) {
				resumo.append("- ").append(aluno.getNome()).append("\n");
			}
		} else {
			resumo.append("- Nenhum aluno associado.\n");
		}

		return resumo.toString();
    */
}