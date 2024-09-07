
public class Gravata {
    public String material;
    public String estilo;
    public String tamanho;

    public Gravata(String tipoMaterial, String estiloGravata, String tamanhoGravata) {
        this.material = tipoMaterial;
        this.estilo = estiloGravata;
        this.tamanho = tamanhoGravata;
    }

    public void vestir() {
        System.out.println("Colocando gravata...");
        System.out.println("Colocou!");
    }
}
