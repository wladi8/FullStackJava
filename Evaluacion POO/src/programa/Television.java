package programa;

public class Television extends Electrodomestico{
	
	private final static int resolucion_def=20;
	private final static boolean sintonizadorTDT_def=false;
	
	private int resolucion;
	private boolean sintonizadorTDT;

	public double precioFinal(){
        double plus=super.precioFinal();
        if (resolucion>40){
            plus+=precio*0.3;
        }
        if (sintonizadorTDT){
            plus+=50;
        }
        return plus;
    }
	
	public Television(int resolucion, boolean sintonizadorTDT) {
		this.precio = precio_def;
		this.color = color_def;
		this.consumo = consumo_def;
		this.peso = peso_def;
		this.resolucion = resolucion_def;
		this.sintonizadorTDT = sintonizadorTDT_def;
	}
	
	public Television(double precio,char consumo,String color, double peso,int resolucion, boolean sintonizadorTDT) {
		super(precio, color, consumo, peso);
        this.resolucion=resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
	}
}
