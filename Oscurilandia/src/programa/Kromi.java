package programa;

public class Kromi extends Carro{
	//CE
    // Definicion de variables (a�o de fabricacion y marca)
    
    private int a�o;
    private String marca;
    
    // Constructor vacio para herencia de atributos
    public Kromi() {
        super();
    }
    // Caontructor de la clase
    public Kromi(int a�o, String marca) {
        super();
        this.a�o = a�o;
        this.marca = marca;
    }
    // Creacion de Getters y Setters
    public int getA�o() {
        return a�o;
    }
    public void setA�o(int a�o) {
        this.a�o = a�o;
    }
    public String getMarca() {
        return marca;
    }
    public void setMrc(String marca) {
        this.marca = marca;
    }
    
    

}
