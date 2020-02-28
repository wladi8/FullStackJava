package programa;

public class Huevo {
	
	private int lanzamiento;
	private int fila;
	private int columna;
	private int puntaje;
	
	public Huevo() {
		super();
	}

	public Huevo(int lanzamiento, int fila, int columna, int puntaje) {
		super();
		this.lanzamiento = lanzamiento;
		this.fila = fila;
		this.columna = columna;
		this.puntaje = puntaje;
	}

	public int getLanzamiento() {
		return lanzamiento;
	}

	public void setLanzamiento(int lanzamiento) {
		this.lanzamiento = lanzamiento;
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

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	
}
