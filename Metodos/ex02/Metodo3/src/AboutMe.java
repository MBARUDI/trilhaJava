import java.util.Scanner;


public class AboutMe {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.print("Digite sua idade: ");
            int idade = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite sua altura (em metros, ex: 1.75): ");
            double altura = Double.parseDouble(scanner.nextLine());

            System.out.println("\nInformações coletadas:");
            System.out.println("Nome completo: " + nome + " " + sobrenome);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Altura: " + altura + " metros");
        } catch (NumberFormatException e) {
            System.out.println("Erro: Certifique-se de digitar números válidos para idade e altura.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            // Recursos já são fechados automaticamente pelo try-with-resources
        }
    }
}
