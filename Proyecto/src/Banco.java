import java.util.*;

public class Banco {
	private ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
	private int numero_actual_de_cuentas;
	public void Agregar ( int tipo_cuenta , int rut , String nombre){
		// tipo_cuenta == 0 significa que es una cuenta de ahorro
		// tipo_cuenta == 1 significa que es una cuenta corriente
		// El saldo inicial es 0
		if (tipo_cuenta == 0){
			System.out.println("Cuenta ahorro creada: ");
			CuentaAhorro nuevaCuenta = new CuentaAhorro(rut, nombre);
			cuentas.add(nuevaCuenta);
			this.numero_actual_de_cuentas+=1;
            
        }else if(tipo_cuenta == 1){
			System.out.println("Cuenta vista creada: ");
            CuentaVista nuevaCuenta = new CuentaVista(rut, nombre);
			cuentas.add(nuevaCuenta);
			this.numero_actual_de_cuentas+=1;
        }
	}
	/*public void Eliminar(int numero_cuenta ){
	    // Elimina la cuenta de numero numero_cuenta
        System.out.println("Numero de cuenta");
        numero_cuenta cuenta = new numero_cuenta();
    }*/
	public int Numero_cuentas_saldo( float min , float max){return 0;}	
	    // Imprime toda la informacion de las cuentas cuyo saldo
	    // esta entre min y max ( ambos inclusive )
	    // y retorna cuantas hay
	public int NumeroCuenta( String nombre , int tipo_cuenta ){return 0;}
	// Retorna el numero de la cuenta del cliente con el nombre
	// especificado	
	/*public Cuenta Cuenta( int numero_cuenta ){
		Cuenta cuenta = new Cuenta(100, "hola");
		return cuenta;
		}*/
	// retorna la cuenta de la cuenta con numero_cuenta
	public String getCuentas(int i){
		return cuentas.get(i).toString();
	}
	public int getNmroCuentas(){
		return numero_actual_de_cuentas;
	}
}
