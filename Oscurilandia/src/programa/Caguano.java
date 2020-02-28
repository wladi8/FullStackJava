package programa;

public class Caguano extends Carro{

	// CE
    // Definicion de atributos (Alcance de tiro, color de confeti)
    
    private int alcance;
    private String color;
    
    // Constructor vacio 
    public Caguano() {
        super();
    }
    // Constructor de la clase
    public Caguano(int alcance, String color) {
        super();
        this.alcance = alcance;
        this.color = color;
    }
    // Getters y Setters
    public int getAlcance() {
        return alcance;
    }
    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

}
