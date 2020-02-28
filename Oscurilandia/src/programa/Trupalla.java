package programa;

public class Trupalla extends Carro{
	
	//WU
    // Definicion de variables (año de fabricacion y marca)
	private int armadura;
	private String persona;
	
	 // Constructor vacio para herencia de atributos
	public Trupalla() {
		super();
	}

	// Caontructor de la clase
	public Trupalla(int armadura, String persona) {
		super();
		this.armadura = armadura;
		this.persona = persona;
	}

	// Creacion de Getters y Setters
	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
	}
	
	
}
