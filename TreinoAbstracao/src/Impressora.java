public class Impressora {
    String tipoImpressao;
    String tipoTinta;
    int tamanhoPapel;
     
    public Impressora(int cmPapel,String tipoQualquer,String tipoQualquerTinta) {
    	 this.tamanhoPapel = cmPapel;
    	 this.tipoImpressao = tipoQualquer;
    	 this.tipoTinta = tipoQualquerTinta;
    	 
    }
    public void imprimir() {
    	System.out.println("Imprimindo...");
    	System.out.println("Imprimiu");
    }
}
