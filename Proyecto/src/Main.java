import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner lectura = new Scanner(System.in);
		Banco adminBanco = new Banco();
   	 	adminBanco.Agregar(0, 16789987, "Javiera Sepulveda");
   	 	adminBanco.Agregar(1, 20268906, "Javier Gamboa");
    	adminBanco.Agregar(0, 14116745, "Nicol Lopez");
    	adminBanco.Agregar(0, 19786394, "Maria Santander");
    	adminBanco.Agregar(1, 16128754, "Claudio Guajardo");

		System.out.println("Menu de creacion de cuentas Administracion de Cuentas: \n");
		for(int i = 0; i!=1;i = lectura.nextInt()){
			System.out.println("\n Oprima la siguente tecla dependiendo de la accion que quiera realizar\n"+
								"1.- Crear una cuenta\n"+
								"2.- Eliminar una cuenta\n"+
								"3.- Verificar estado de cliente\n"+
								"4.- Depositar dinero\n"+
								"5.- Girar dinero\n");
			switch(lectura.nextInt()){
				case 1:
					crearCuenta(adminBanco);	
           		break;
                    
        case 2:
					eliminarCuenta(adminBanco);
            	break;
				
				case 3:
					verificar(adminBanco);
			      	break;

        case 4:	
          depositar(adminBanco);
              break;
        case 5:
          girar(adminBanco);
              break;
			}
			System.out.print("Oprima 1 para salir, otro entero para seguir: ");
		}
		System.out.println("\nMuchas gracias por preferir el mejor banco del mejor pais de Chile");
  	}
	public static void crearCuenta(Banco adminBanco){ 
		  Scanner lectura = new Scanner(System.in);
		  System.out.println("Usted a ingresado al menu de creacion de cuentas:");
	    System.out.println("Ingrese los dados de la cuenta en el siguente orden:"
                        +"\n1.-tipocuenta[0/1](0 = Cuenta ahorro y 1 = Cuenta vista)"
						            +"\n2.-Rut Usuario"
		                    +"\n3.-Nombre Usuario(Nombre Apellido)\n");
		  adminBanco.Agregar(lectura.nextInt(),lectura.nextInt(),(lectura.next()+" "+lectura.next()));
		  System.out.println("\n");

  }
	public static void eliminarCuenta(Banco adminBanco){
		  Scanner lectura = new Scanner(System.in);
		  System.out.println("Usted a ingresado a la opcion de eliminar cuenta: \n\n");
    	System.out.print("Indique el numero de cuenta que desea eliminar: ");
	    adminBanco.Eliminar(lectura.nextInt());

	}
	public static void verificar(Banco adminBanco){
		  Scanner lectura = new Scanner(System.in);
		  System.out.println("Usted a ingresado la opcion de verficar estado de cliente: ");
		  System.out.print("Porfavor indique el rut que desea consultar: ");
		  adminBanco.checkClient(lectura.nextInt());

	}
  public static void depositar(Banco adminBanco){
    Scanner lectura = new Scanner(System.in);
    System.out.println("Usted ha ingresado a la opcion de depositar: \n\n");
    System.out.print("Porfavor indique el monto y numero de cuenta (recuerde el espacio): ");
    adminBanco.deposito(lectura.nextFloat(),lectura.nextInt());



  }
  public static void girar(Banco adminBanco){
    Scanner lectura = new Scanner(System.in);





  }
}
