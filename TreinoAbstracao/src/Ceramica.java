public class Ceramica {
String composicao;
double altura;
double largura;
public Ceramica(String tipoComposicao,double alturaCeramica,double larguraCeramica) {
	this.composicao = tipoComposicao;
	this.altura = alturaCeramica;
	this.largura = larguraCeramica;
}
public void esculpir() {
	System.out.println("Esculpindo...");
	System.out.println("Ficou escupilda a estrutura");
}

}
