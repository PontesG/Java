
public class BuracoNegro {
  double massa;
  String rotacao;
  double campoGravitacional;
  public BuracoNegro(double qntdMassa,String tipoRotacao,double tamanhoCampo) {
	  this.massa = qntdMassa;
	  this.rotacao = tipoRotacao;
	  this.campoGravitacional = tamanhoCampo;
  } 
	 public void atrair() { 
		 System.out.println("Atraindo...");
		 System.out.println("Atraiu");
	 
  }
   
}
