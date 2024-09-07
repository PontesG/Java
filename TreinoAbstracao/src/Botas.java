
public class Botas {
    public String material;
    public String estilo;
    public String tamanho;

    public Botas(String tipoMaterial, String estiloBotas, String tamanhoBotas) {
        this.material = tipoMaterial;
        this.estilo = estiloBotas;
        this.tamanho = tamanhoBotas;
    }

    public void vestir() {
        System.out.println("Calçando botas...");
        System.out.println("Calçou!");
    }
}
