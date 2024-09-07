public class Saia {
    public String material;
    public String estilo;
    public String tamanho;

    public Saia(String tipoMaterial, String estiloSaia, String tamanhoSaia) {
        this.material = tipoMaterial;
        this.estilo = estiloSaia;
        this.tamanho = tamanhoSaia;
    }

    public void vestir() {
        System.out.println("Vestindo saia...");
        System.out.println("Vestiu!");
    }
}
