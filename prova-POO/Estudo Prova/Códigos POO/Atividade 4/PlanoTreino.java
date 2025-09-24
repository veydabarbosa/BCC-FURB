public class PlanoTreino {
    private String descricao;
    private int nivel;
    private boolean ativo;

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

    public PlanoTreino(String descricao){
        this(descricao, 0 , false);
    }

    public PlanoTreino(String descricao, int nivel, boolean ativo){
        setDescricao(descricao);
        this.nivel = nivel;
        this.ativo = ativo;
    }

    public void ativar(){
       this.ativo = true;
    }

    public void desativar(){
        this.ativo = false;
    }
}
