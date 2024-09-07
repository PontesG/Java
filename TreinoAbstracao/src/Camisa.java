

public class Camisa {
    public String material;
    public String estilo;
    public String tamanho;

    public Camisa(String tipoMaterial, String estiloCamisa, String tamanhoCamisa) {
        this.material = tipoMaterial;
        this.estilo = estiloCamisa;
        this.tamanho = tamanhoCamisa;
    }

    public void vestir() {
        System.out.println("Vestindo camisa...");
        System.out.println("Vestiu!");
    }
}
