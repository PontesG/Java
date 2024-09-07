
public class Tenis {
    public String material;
    public String estilo;
    public String tamanho;

    public Tenis(String tipoMaterial, String estiloTenis, String tamanhoTenis) {
        this.material = tipoMaterial;
        this.estilo = estiloTenis;
        this.tamanho = tamanhoTenis;
    }

    public void vestir() {
        System.out.println("Calçando tênis...");
        System.out.println("Calçou!");
    }
}
