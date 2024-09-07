

public class Calca {
    public String material;
    public String estilo;
    public String tamanho;

    public Calca(String tipoMaterial, String estiloCalca, String tamanhoCalca) {
        this.material = tipoMaterial;
        this.estilo = estiloCalca;
        this.tamanho = tamanhoCalca;
    }

    public void vestir() {
        System.out.println("Vestindo calça...");
        System.out.println("Vestiu!");
    }
}
