package programa;
import java.util.Scanner;

public class Tablero {

	private int carros;
	private int huevos;
	static int sumap=0; 
	static int st =0;
	static int suc= 0;
	static int total =0;
	
	public Tablero() {
		super();
	}

	public Tablero(int carros, int huevos) {
		super();
		this.carros = carros;
		this.huevos = huevos;
	}

	public int getCarros() {
		return carros;
	}

	public void setCarros(int carros) {
		this.carros = carros;
	}

	public int getHuevos() {
		return huevos;
	}

	public void setHuevos(int huevos) {
		this.huevos = huevos;
	}
	
	public static void generarCarro(String[][] tablero) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);	
		String carro;
		int n1=99,n2=99;
		System.out.println("Ingrese que vehiculo desea generar");
		do {
			System.out.println("K= Kromi \nC= Caguano \nT= Trupalla");
			carro = sc.nextLine();
			if (carro.equals("k")) {
				carro="K";
			}else if(carro.equals("c")) {
				carro="C";
			}else if(carro.equals("t")) {
				carro="T";
			}
			switch(carro) {
			case "K":
				for(int i=0;i<3;i++) {
					for(int j=0;i<3;i++) {
						do {
							n1 = (int) (Math.random() * 11-0);
							n2 = (int) (Math.random() * 14-0);
						}while(tablero[n1][n2]!="-"||tablero[n1+1][n2]!="-"||tablero[n1+2][j]!="-");
						tablero[n1][n2]=carro;
						tablero[n1+1][n2]=carro;
						tablero[n1+2][n2]=carro;
					}
				}			
				break;
			case "C":
				for(int i=0;i<5;i++) {
					for(int j=0;i<5;i++) {
						do {
							n1 = (int) (Math.random() * 14-0);
							n2 = (int) (Math.random() * 12-0);
						}while(tablero[n1][n2]!="-"||tablero[n1][n2+1]!="-");
						tablero[n1][n2]=carro;
						tablero[n1][n2+1]=carro;
					}
				}
				break;
			case "T":
				for(int i=0;i<10;i++) {
					for(int j=0;i<10;i++) {
						do {
							n1 = (int) (Math.random() * 14-0);
							n2 = (int) (Math.random() * 14-0);
						}while(tablero[n1][n2]!="-");
						tablero[n1][n2]=carro;
					}
				}	
				break;
			default:
				System.out.println("ERROR: Ingrese una letra valida");
			}
		}while(carro!="K"&&carro!="C"&&carro!="T");
	}
	
	public static void lanzarHuevo(String[][] tablero, int punt) {
		Scanner sc = new Scanner(System.in);
		int fila=0,columna=0;
		System.out.println("Ingrese la Fila donde lanzar el huevo: ");
		fila = sc.nextInt();
		System.out.println("Ingrese la columna donde lanzar el huevo: ");
		columna = sc.nextInt();
		if (tablero[fila][columna]=="K") {					

			sumap = sumap+3;
			
			
			System.out.println("Acertaste!! "+tablero[fila][columna]);
		}else if (tablero[fila][columna]=="C") {
			
			st = st+2;
			
			System.out.println("Acertaste!! "+tablero[fila][columna]);
		}else if (tablero[fila][columna]=="T") {
			
			suc =suc+1;
			
			System.out.println("Acertaste!! "+tablero[fila][columna]);
		}else {
			System.out.println("Fallaste!!");
		}
		tablero[fila][columna]="H";	
	}
	
	public static void mostrarPuntaje(int punt) {
		total = (sumap+suc+st);
		System.out.println("Puntaje: "+total);
	}
	
	public static void mostrarTablero(String[][] tablero) {
		for (int y=0; y < tablero.length; y++) {
			if(y<=9) {
				  System.out.print("0"+(y));
			  }else {
				  System.out.print((y));
			  }
			if (y!=14) System.out.print("\t");			
		}
		System.out.println("|");
		for (int x=0; x < tablero.length; x++)
		{
			  if(x<=9) {
				  System.out.print("0"+(x)+"|");
			  }else {
				  System.out.print((x)+"|");
			  }
			  for (int y=0; y < tablero[x].length; y++){
			    System.out.print (tablero[x][y]);
			    if (y!=14) System.out.print("\t");
			  }
			  System.out.println("|");
		}
	}
}
