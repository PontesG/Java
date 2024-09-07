import java.util.Scanner;
public class Calculadora {
    Scanner scan = new Scanner(System.in);
	double num1,num2;
	int opcao;
	public double soma(double num1, double num2) {
		  return num1+num2;
	 }

	 public double subtracao(double num1, double num2) {
		  return num1-num2;
	 }
	
	public double multiplicacao(double num1, double num2) { 
		return num1*num2;
	}

	public double divisao(double num1,double num2) {
		return  num1/num2;
	}
	public void receberValores(){
		System.out.println("Digite o primeiro numero");
		num1 = scan.nextDouble();
		System.out.println("Digite o segundo numero");
		num2 = scan.nextDouble();
	}
	public void selecionarOp(int opcao) {
		switch(opcao) {
		case 1:
			receberValores();
			System.out.println(soma(num1,num2));
		  break;
		case 2:
			receberValores();
			System.out.println(subtracao(num1,num2));
		  break;
		case 3:
			receberValores();
			System.out.println(multiplicacao(num1,num2));
		  break;
		case 4:
			receberValores();
			System.out.println(divisao(num1,num2));
		  break;
		  default: 
			  System.out.println("Apenas de 1 a 4");
		}
		
		
	}
}
