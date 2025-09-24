package Q2;

import java.util.Scanner;

public class Main {

	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe quantos livros deseja cadastrar");
		int quantidadeLivros = scan.nextInt();

		Livro[] livros = new Livro[quantidadeLivros];

		for (int i = 0; i < livros.length; i++) {
			scan.nextLine();

			System.out.println("Informe o título do livro N." + i);
			String titulo = scan.nextLine();

			System.out.println("Informe o autor do livro N." + i);
			String autor = scan.nextLine();

			System.out.println("Informe o ano de publicação do livro N." + i);
			int anoPublicacao = scan.nextInt();

			livros[i] = new Livro(titulo, autor, anoPublicacao);
		}

		for (int i = 0; i < livros.length; i++) {
			Livro livroCadastrado = livros[i];
			if (i % 2 == 0) {
				System.out.println(livroCadastrado.exibirInfo(true));
			} else {
				System.out.println(livroCadastrado.exibirInfo());
			}

		}

		System.out.println("Total de livros cadastrados: " + Livro.getTotalLivros());

		scan.close();

        /*
        Livro livro1 = new Livro();
        Livro livro2 = new Livro("Turma da monica", "Mauricio de souza", 1990);

        System.out.println(livro1.exibirInfo());
        System.out.println(livro2.exibirInfo());

        System.out.println();
        
        System.out.println(livro1.exibirInfo(true));
        System.out.println(livro2.exibirInfo(false));
        System.out.println(Livro.getTotalLivros());
        */
    }
}
