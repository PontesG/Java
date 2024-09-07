public class Planeta {
 double tamanho;
 String composicao;
 String  atmosfera;
 
 public Planeta(double tamanhoPlaneta,String tipoComposicao,String tipoAtmosfera) {
	 this.tamanho = tamanhoPlaneta;
	 this.composicao = tipoComposicao;
	 this.atmosfera = tipoAtmosfera;
 }
 public void Orbitar() {
	 System.out.println("Orbitando...");
	 System.out.println("Orbitou 1 volta");
 }
}
