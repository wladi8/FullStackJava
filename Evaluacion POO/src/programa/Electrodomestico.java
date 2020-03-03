package programa;

public class Electrodomestico {
	protected final static double precio_def=100000;
	protected final static String color_def="blanco";
	protected final static char consumo_def='F';
	protected final static double peso_def=5;
	
	
	protected double precio=100000;
	protected String color="blanco";
	protected char consumo='F';
	protected double peso=5;
	
	public void comprobarColor(String color) {
		if(color == "Negro" || color == "Azul"
			|| color == "Gris" || color == "Rojo") {
			this.color = color;
		} else {
			this.color = "Blanco";
		}		
	}
	
	public void comprobarConsumo(char consumo) {
        String letrasconsumo = "ABCDEF";
        if (letrasconsumo.indexOf(Character.toUpperCase(consumo)) > 0 ){
            this.consumo = Character.toUpperCase(consumo);
        } else {
            this.consumo = 'F';
        }
    }
	
	public String comprobarColor() {
        return color;
    }
	
	public double comprobarPeso() {
        return peso;
    }
	
	public double precioFinal(){
        double plus=0;
        switch(consumo){
            case 'A':
                plus+=100000;
                break;
            case 'B':
                plus+=80000;
                break;
            case 'C':
                plus+=60000;
                break;
            case 'D':
                plus+=50000;
                break;
            case 'E':
                plus+=30000;
                break;
            case 'F':
                plus+=10000;
                break;
        }  
        if(peso>=0 && peso<19){
            plus+=10;
        }else if(peso>=20 && peso<49){
            plus+=50;
        }else if(peso>=50 && peso<=79){
            plus+=80;
        }else if(peso>=80){
            plus+=100;
        }   
        return precio+plus;
    }
	public Electrodomestico(){
		this.precio = precio_def;
		this.color = color_def;
		this.consumo = consumo_def;
		this.peso = peso_def;
    }

	public Electrodomestico(double precio, double peso) {
		super();
		this.precio = precio;
		this.peso = peso;
	}

	public Electrodomestico(double precio, String color, char consumo, double peso) {
		super();
		this.precio = precio;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
		comprobarConsumo(consumo);
		comprobarColor(color);
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public static double getPrecioDef() {
		return precio_def;
	}

	public static String getColorDef() {
		return color_def;
	}

	public static char getConsumoDef() {
		return consumo_def;
	}

	public static double getPesoDef() {
		return peso_def;
	}

	
}
