import java.io.*;

class Main {
  public static void main(String[] args) throws FileNotFoundException {
    Banco adminBanco = new Banco();
    adminBanco.Agregar(0,20890710, "Maria Santander");
    adminBanco.Agregar(1,12760310, "Paolo Rivera");
    adminBanco.Agregar(0,18218955, "Francisco Espinoza");
    adminBanco.Agregar(1,177878345, "Javiera Rojas");
    adminBanco.Eliminar(45547385);
    System.out.println("------------------------------Borrado numero de cuenta 45547385---------------------------------");
    for(int i=0; i<adminBanco.getNmroCuentas(); i++){
      System.out.println(adminBanco.getCuenta(i));

    }

  }
}