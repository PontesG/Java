import java.util.Scanner;

public class VerificaLogin {
    public static void main(String[] args) {
        String[][] credenciais = {
            {"user1", "senha123"},
            {"admin", "admin123"},
            {"joao", "joao456"},
            {"maria", "maria789"},
            {"pedro", "pedro321"},
            {"ana", "ana654"}
        };
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o login: ");
        String login = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();
        
        boolean autenticado = false;
        
        for (int i = 0; i < credenciais.length; i++) {
            if (credenciais[i][0].equals(login) && credenciais[i][1].equals(senha)) {
                autenticado = true;
                break;
            }
        }
        
        if (autenticado) {
            System.out.println("Login bem-sucedido! Bem-vindo, " + login + "!");
        } else {
            System.out.println("Login ou senha incorretos. Tente novamente.");
        }
        
        scanner.close();
    }
}
