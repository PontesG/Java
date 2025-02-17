import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        
        // Verificação de número positivo ou negativo
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        System.out.println(numero >= 0 ? "Número positivo" : "Número negativo");

        // Comparação entre dois números
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        if (num1 == num2) {
            System.out.println("Os números são iguais.");
        } else if (num1 > num2) {
            System.out.println("O primeiro número é maior.");
        } else {
            System.out.println("O segundo número é maior.");
        }

        // Menu para calcular áreas
        System.out.println("\n1. Calcular área do quadrado\n2. Calcular área do círculo");
        System.out.print("Escolha uma opção: ");
        int escolha = scanner.nextInt();
        if (escolha == 1) {
            System.out.print("Digite o lado do quadrado: ");
            double lado = scanner.nextDouble();
            System.out.println("Área do quadrado: " + (lado * lado));
        } else if (escolha == 2) {
            System.out.print("Digite o raio do círculo: ");
            double raio = scanner.nextDouble();
            System.out.println("Área do círculo: " + (Math.PI * raio * raio));
        }

        // Tabuada
        System.out.print("Digite um número para exibir sua tabuada: ");
        int tabuada = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }

        // Verificação de par ou ímpar
        System.out.print("Digite um número inteiro: ");
        int parOuImpar = scanner.nextInt();
        System.out.println(parOuImpar % 2 == 0 ? "Número par" : "Número ímpar");
        
        // Cálculo do fatorial
        System.out.print("Digite um número para calcular o fatorial: ");
        int fatorial = scanner.nextInt();
        int resultado = 1;
        for (int i = 1; i <= fatorial; i++) {
            resultado *= i;
        }
        System.out.println("Fatorial de " + fatorial + " é " + resultado);

        // Faixa etária
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        if (idade < 18) {
            System.out.println("Menor de idade");
        } else if (idade < 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }

        // Soma dos primeiros n números ímpares
        System.out.print("Digite um número inteiro n: ");
        int n = scanner.nextInt();
        int soma = 0, contador = 0, numeroImpar = 1;
        while (contador < n) {
            soma += numeroImpar;
            numeroImpar += 2;
            contador++;
        }
        System.out.println("Soma dos primeiros " + n + " números ímpares: " + soma);

        // Lista de nomes
        String[] nomes = new String[5];
        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < 5; i++) {
            nomes[i] = scanner.next();
        }
        System.out.print("Digite um nome para verificar se está na lista: ");
        String nomeVerificar = scanner.next();
        boolean encontrado = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeVerificar)) {
                encontrado = true;
                break;
            }
        }
        System.out.println(encontrado ? "O nome está na lista." : "O nome não está na lista.");
        
        // Senha secreta
        final String senhaSecreta = "Java123";
        String senha;
        do {
            System.out.print("Digite a senha: ");
            senha = scanner.next();
            if (!senha.equals(senhaSecreta)) {
                System.out.println("Senha incorreta! Tente novamente.");
            }
        } while (!senha.equals(senhaSecreta));
        System.out.println("Acesso concedido!");

        scanner.close();
    }
}