package programa;

public class Carro {
	
	//WU
    // Definicion de variables (año de fabricacion y marca)
	private int ocupantes;
	private String ingreso;
	private int fila;
	private int columna;
	
	 // Constructor vacio para herencia de atributos
	public Carro() {
		super();
	}

	// Constructor de la clase
	public Carro(int ocupantes, String ingreso, int fila, int columna) {
		super();
		this.ocupantes = ocupantes;
		this.ingreso = ingreso;
		this.fila = fila;
		this.columna = columna;
	}
	
	 // Creacion de Getters y Setters
	public int getOcupantes() {
		return ocupantes;
	}

	public void setOcupantes(int ocupantes) {
		this.ocupantes = ocupantes;
	}

	public String getIngreso() {
		return ingreso;
	}

	public void setIngreso(String ingreso) {
		this.ingreso = ingreso;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}
	 // Metodo para desplegar datos
	public  void desplegarDatos(int ocupantes, String ingreso, int fila, int columna) {
		System.out.println("Ocupantes: "+ocupantes);
		System.out.println("Fecha de Ingreso: "+ingreso);
		System.out.println("Coordenadas: "+fila+"x"+columna);
	}
}
