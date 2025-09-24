package Q2;

public class Livro {

	private String titulo;
	private String autor;
	private int anoPublicacao;
	private static int totalLivros;

	public Livro() {
		this("Sem título", "Desonhecido", 0);
	}

	public Livro(String titulo, String autor, int ano) {
		this.titulo = titulo;
		this.autor = autor;
		anoPublicacao = ano;
		totalLivros++;
	}

	/** 
	 * @return String
	 */
	public String exibirInfo() {
		return "Título: " + titulo
				+ " Autor: " + autor
				+ " Ano de publicação: " + anoPublicacao;
	}

	/** 
	 * @param resumido
	 * @return String
	 */
	public String exibirInfo(boolean resumido) {
		if (resumido) {
			return "Título: " + titulo;
		}
		return exibirInfo();
	}

	/** 
	 * @return int
	 */
	public static int getTotalLivros() {
		return totalLivros;
	}
}