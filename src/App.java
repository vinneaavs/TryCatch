import java.util.*; 

public class App {

        // Abaixo segue um exemplo de código que você pode ou não utilizar
public static class Problem {
    public static void main(String[] args) {
      	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	String jogador1, jogador2;
// TODO: complete os espaços em branco com sua solução para o problema
    	for (int i = 0; i < N; i++) {
    		jogador1 = leitor.next();
    		jogador2 = leitor.next();
    		if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque")) System.out.println("Aniquilacao mutua");
    		else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel")) System.out.println("Ambos venceram");
    		else if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("papel")) System.out.println("Jogador 1 venceu");
    		else if (jogador2.equalsIgnoreCase("ataque")&& jogador1.equalsIgnoreCase("papel")) System.out.println("Jogador 2 venceu");
            else if (jogador2.equalsIgnoreCase("pedra")&& jogador1.equalsIgnoreCase("pedra")) System.out.println("Sem ganhador");

    		else if (jogador2.equalsIgnoreCase("pedra")&& jogador1.equalsIgnoreCase("papel")) System.out.println("Jogador 1 venceu");
    		else if (jogador1.equalsIgnoreCase("pedra")&& jogador2.equalsIgnoreCase("papel")) System.out.println("Jogador 2 venceu");
    		// else System.out.println("Ambos venceram");
    	}
    }
}

// Ataque Aéreo vs. Pedra: Neste caso, o jogador com o Ataque Aéreo derrota o jogador com a Pedra, por razões óbvias.
// Pedra vs. Papel: Neste caso, o jogador com a Pedra derrota o com Papel, porque a Pedra machuca muito mais.
// Papel vs. Ataque Aéreo: Aqui o Ataque Aéreo ganha, porque Ataque Aéreo sempre ganha e o Papel é patético.
// Papel vs. Papel: Nesta variação, ambos os jogadores ganham, porque o Papel é inútil e ninguém que enfrenta o Papel pode perder.
// Pedra vs. Pedra: Para este caso não há ganhador, porque depende do que os jogadores decidem fazer com a Pedra e normalmente não fazem nada.
// Ataque Aéreo vs. Ataque Aéreo: Quando isto acontece, todos os jogadores perdem, devido a Aniquilação Mútua.

}

