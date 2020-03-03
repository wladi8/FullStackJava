package programa;

public class Lavadora extends Electrodomestico{

	private final static int carga_def=5;
	
	private int carga;
	
	public int getCarga() {
        return carga;
    }
	
	 public double precioFinal(){
	        double plus=super.precioFinal();
	        if (carga>30){
	            plus+=50000;
	        }
	        return plus;
	    }

	public Lavadora(int carga) {
		this.precio = precio_def;
		this.color = color_def;
		this.consumo = consumo_def;
		this.peso = peso_def;
		this.carga = carga_def;	
	}
	 
	public Lavadora(double precio, double peso) {
		this.precio = precio;
		this.color = color_def;
		this.consumo = consumo_def;
		this.peso = peso;
		this.carga = carga_def;	
	}

	public Lavadora(double precio,char consumo,String color, double peso,int carga) {
		super(precio, color, consumo, peso);
        this.carga=carga;
	}
}
