public class Main {
    public static void main(String[] args) {
       Aluno aluno1 = new Aluno("Vitor");
       Aluno aluno2 = new Aluno("Lelle", 2403, 18, 50, 1.60);

       PlanoTreino plano1 = new PlanoTreino("Pernas");
       PlanoTreino plano2 = new PlanoTreino("Costas", 1, true);

       try{
        aluno1.setIdade(-35);
       } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
       }

       try{
        plano2.setDescricao("");
       } catch (IllegalArgumentException e){
        System.out.println(e.getMessage());
       }

       System.out.println();

       System.out.println("Alunos");
       System.out.println("Nome: " + aluno1.getNome() + ", Matricula: " + aluno1.getMatricula() + ", Idade: " + aluno1.getIdade() + ", Peso: " + aluno1.getPeso() + ", Altura: " + String.format("%.2f", aluno1.getAltura()));
       System.out.println("Nome: " + aluno2.getNome() + ", Matricula: " + aluno2.getMatricula() + ", Idade: " + aluno2.getIdade() + ", Peso: " + aluno2.getPeso() + ", Altura: " + String.format("%.2f", aluno2.getAltura()));

       System.out.println();

       System.out.println("Planos");
       System.out.println("Descrição: " + plano1.getDescricao() + ", Nivel: " + plano1.getNivel() + ", Ativo:" + plano1.getAtivo());
       System.out.println("Descrição: " + plano2.getDescricao() + ", Nivel: " + plano2.getNivel() + ", Ativo:" + plano2.getAtivo());

       plano1.ativar();
       plano2.desativar();

       System.out.println();

       System.out.println("Planos");
       System.out.println("Descrição: " + plano1.getDescricao() + ", Nivel: " + plano1.getNivel() + ", Ativo:" + plano1.getAtivo());
       System.out.println("Descrição: " + plano2.getDescricao() + ", Nivel: " + plano2.getNivel() + ", Ativo:" + plano2.getAtivo());
    }
}
