package programa;

public class Kromi extends Carro{
	//CE
    // Definicion de variables (año de fabricacion y marca)
    
    private int año;
    private String marca;
    
    // Constructor vacio para herencia de atributos
    public Kromi() {
        super();
    }
    // Caontructor de la clase
    public Kromi(int año, String marca) {
        super();
        this.año = año;
        this.marca = marca;
    }
    // Creacion de Getters y Setters
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public String getMarca() {
        return marca;
    }
    public void setMrc(String marca) {
        this.marca = marca;
    }
    
    

}
