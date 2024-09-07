
public class Girafa {
  public double altura;
  public double peso;
  public int idade;
  public Girafa(double metros, double pesoQualquer) {
	  this.altura = metros;
	  this.peso = pesoQualquer;
	  this.idade = 0;
  }
  public void comer() {
	  System.out.println("Comendo...");
	  System.out.println("Comeu!");
  }
}
