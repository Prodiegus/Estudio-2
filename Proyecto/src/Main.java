import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws FileNotFoundException {
		Scanner lectura = new Scanner(System.in);
		System.out.println("Menu de creacion de (penes) Administracion de Cuentas: \noprima 1 despues de realizar una operacion para salir"
		+"\n para continuar creando oprima cualquier numero entero");
		for (int i = 0; i!=1; i = lectura.nextInt()){
			System.out.println("\n Oprima la siguente tecla dependiendo de la accion que quiera realizar\n"+
								"1.- Crear una cuenta\n"+
								"2.- Eliminar una cuenta\n"+
								"3.- Verificar estado de cliente");
			switch(lectura.nextInt()){
				case 1:
					crearCuenta();	
           		break;
                    
            	case 2:
					eliminarCuenta();
            	break;

			}
		}
  	}
  	public static void crearCuenta(){ 
		Scanner lectura = new Scanner(System.in);
        Banco adminBanco = new Banco();
		System.out.println("Usted a ingresado al menu de creacion de cuentas:");
		System.out.println("Ingrese los dados de la cuenta en el siguente orden:"
    	+"\n1.-tipocuenta[0/1](0 = Cuenta ahorro y 1 = Cuenta vista)"
		+"\n2.-Rut Usuario"
		+"\n3.-Nombre Usuario(Nombre Apellido)\n");
		adminBanco.Agregar(lectura.nextInt(),lectura.nextInt(),(lectura.next()+" "+lectura.next()));
		System.out.println("\n");

    }
	public static void eliminarCuenta(){
		Scanner lectura = new Scanner(System.in);
        Banco adminBanco = new Banco();
		System.out.println("Usted a ingresado a la opcion de eliminar cuenta: \n\n");
        System.out.println("Indique el numero de cuenta que desea eliminar:");
		adminBanco.Eliminar(lectura.nextInt());

	}

}