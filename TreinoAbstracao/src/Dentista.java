    public class Dentista {
	public String especializacao;
	public String ferramentas;
	public String formacao;
	public Dentista(String tipoEspecializacao, String tipoFerramenta, String tipoFormacao) {
			this.especializacao = tipoEspecializacao;
			this.ferramentas = tipoFerramenta;
			this.formacao = tipoFormacao;
			
	}
 
	public void tratamento() {
	System.out.println("Tratando...");
	System.out.println("Tratou!");

 	}

}
