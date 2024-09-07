public class Jaqueta {
    public String material;
    public String estilo;
    public String tamanho;

    public Jaqueta(String tipoMaterial, String estiloJaqueta, String tamanhoJaqueta) {
        this.material = tipoMaterial;
        this.estilo = estiloJaqueta;
        this.tamanho = tamanhoJaqueta;
    }

    public void vestir() {
        System.out.println("Vestindo jaqueta...");
        System.out.println("Vestiu!");
    }
}
