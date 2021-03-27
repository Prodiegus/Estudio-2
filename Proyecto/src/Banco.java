public class Banco {
	private Cuenta [] cuentas;
	private int numero_actual_de_cuentas;
	public Banco(int numero_maximo_cuentas ){}
	public void Agregar ( int tipo_cuenta , int rut , String nombre, CuentaAhorro cuentaAhorro ){
		// tipo_cuenta == 0 significa que es una cuenta de ahorro
		// tipo_cuenta == 1 significa que es una cuenta corriente
		// El saldo inicial es 0
		if (tipo_cuenta == 0){
			CuentaAhorro nuevaCuenta = new CuentaAhorro(rut, nombre);
            System.out.println("cuenta de ahorro creada");
            
        }else if(tipo_cuenta == 1){
            System.out.println("cuenta vista creada");
            CuentaVista nuevaCuenta = new CuentaVista(rut, nombre);
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
}
