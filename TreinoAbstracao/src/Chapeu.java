
public class Chapeu {
	public String material;
	public String estilo;
	public String tamanho;
	public Chapeu(String tipoMaterial, String estiloChapeu, String tamanhoChapeu) {
			this.material = tipoMaterial;
			this.estilo = estiloChapeu;
			this.tamanho = tamanhoChapeu;
			
	}
 
	public void Vestir() {
	System.out.println("Vestindo chapeu...");
	System.out.println("Vestiu!");

 	}

}
