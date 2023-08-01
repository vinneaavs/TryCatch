import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

        try 
        {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o nome: ");

            String nome = scanner.next();
            System.out.println("Digite o sobrenome: ");

            String sobrenome = scanner.next();
            System.out.println("Digite a idade: ");

            Integer idade = scanner.nextInt();
            System.out.println("Digite a altura: ");

            Double altura = scanner.nextDouble();

            System.out.println("Nome "+ nome + "SobreNome "+sobrenome+ "Altura: "+altura+ "Idade: "+idade);
            
        } catch (Exception e) {
            System.out.println("Campo inserido não condiz com o tipo esperado");

        }
    }
}
