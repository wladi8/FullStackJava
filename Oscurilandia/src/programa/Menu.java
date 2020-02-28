package programa;
import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op=0,punt = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String tablero[][] = new String[15][15];
		for(int i=0;i<15;i++) {
			for(int j=0;j<15;j++) {
				tablero[i][j]="-";
			}
		}
		System.out.println("BIENVENIDOS A MDland");
		do {
			System.out.println("------Menu Principal------");
			System.out.println("1. Generar Vehiculo");
			System.out.println("2. Lanzar Huevo");
			System.out.println("3. Mostrar Tablero");
			System.out.println("4. Calcular Puntaje");
			System.out.println("5. Salir");
			System.out.println("Ingrese una opcion:");
			op = sc.nextInt();
			switch(op) {
			case 1:
				Tablero.generarCarro(tablero);
				break;
			case 2:
				Tablero.lanzarHuevo(tablero,punt);
				break;
			case 3:
				Tablero.mostrarTablero(tablero);
				break;
			case 4:
				Tablero.mostrarPuntaje(punt);
				break;
			case 5:
				System.out.println("Gracias por jugar!!!");
				break;
			default:
				System.out.println("ERROR: Opcion No Valida");
				break;
			}
		}while(op!=5);
	}
}
