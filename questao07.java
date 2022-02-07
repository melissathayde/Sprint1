import java.util.Scanner;

public class questao07 {

	public static void main(String[] args) {
		
		String respostaUsuario;
		String usuario;
		int qtdPerguntas = 5;
		int certo = 0;
		int errado = 0;
		
		Scanner leia = new Scanner(System.in);
		
		String[] respostasCertas  = new String[qtdPerguntas];
		String[] perguntas        = new String[qtdPerguntas];
		
		perguntas[0] = "Quem é o campeão Brasileiro de 1987?";
		perguntas[1] = "Quantos estados temos no Brasil?";
		perguntas[2] = "Que linguagem estamos estudando?";
		perguntas[3] = "Qual o nome do cachorro de Melissa?";
		perguntas[4] = "Onde Melissa mora?";
		
		respostasCertas[0] = "Sport";
		respostasCertas[1] = "26";
		respostasCertas[2] = "Java";
		respostasCertas[3] = "Nick";
		respostasCertas[4] = "Recife";
		
		System.out.println("Digite o nome do usuário:");
		usuario = leia.next();
		
		for (int i = 0; i < 5; i++) {
		
			System.out.println(perguntas[i]);
			respostaUsuario = leia.next();
			
			if ( respostaUsuario.equals(respostasCertas[i])) {	
				System.out.println("Resposta certa.");
				certo = certo + 1;
			} else {
				System.out.println("Resposta errada.");
				errado = errado + 1;
			}
			
		}
		
		System.out.println("Nome do usuário: " + usuario);	
		System.out.println("Respostas certas: " + certo);	
		System.out.println("Respostas erradas: " + errado);	
	
	}
}

