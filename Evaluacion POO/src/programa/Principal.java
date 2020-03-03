package programa;

public class Principal {
	 
    public static void main(String[] args) {
        double sumaele=0;
        double sumatele=0;
        double sumalava=0;
        double total=0;
        Electrodomestico lisele[]=new Electrodomestico[10];
        lisele[0]=new Electrodomestico(200000, "verde", 'C', 60);
        lisele[1]=new Lavadora(150000, 30);
        lisele[2]=new Television(200000, false);
        lisele[3]=new Electrodomestico();
        lisele[4]=new Electrodomestico(600000, "azul", 'D', 20);
        lisele[5]=new Lavadora(100000, 'C',"rojo", 60, 30);
        lisele[6]=new Television(300000, true);
        lisele[7]=new Lavadora(100000, 7);
        lisele[8]=new Television(250000, 'C',"amarillo", 60, 40, true);
        lisele[9]=new Electrodomestico(50000, 10);
        for(int i=0;i<lisele.length;i++){
            if(lisele[i] instanceof Electrodomestico){
                sumaele+=lisele[i].precioFinal();
            }
            if(lisele[i] instanceof Lavadora){
                sumalava+=lisele[i].precioFinal();
            }
            if(lisele[i] instanceof Television){
                sumatele+=lisele[i].precioFinal();
            }
        }
        total=sumaele+sumalava+sumatele;
        System.out.println("La suma del precio de los Electrodomesticos es de $"+sumaele);
        System.out.println("La suma del precio de las Lavadoras es de $"+sumalava);
        System.out.println("La suma del precio de los TV's es de $"+sumatele);
        System.out.println("La total es de $"+total);
    } 
}