import java.util.*;

public class Banco {
	private ArrayList<Cuenta> ctas;
	private int numero_actual_de_cuentas;
	public Banco(){
		this.ctas = new ArrayList<Cuenta>();
		this.numero_actual_de_cuentas = 0;
	}
	public void Agregar(int tipo_cuenta , int rut , String nombre ){
		// tipo_cuenta == 0 significa que es una cuenta de ahorro
		// tipo_cuenta == 1 significa que es una cuenta vista
		// El saldo inicial es 0
		if (tipo_cuenta == 0){
			//System.out.println("Cuenta ahorro creada: ");
			CuentaAhorro nuevaCuenta = new CuentaAhorro(rut, nombre);
			this.ctas.add(nuevaCuenta);
			this.numero_actual_de_cuentas+=1;
            
        }else if(tipo_cuenta == 1){
			//System.out.println("Cuenta vista creada: ");
            CuentaVista nuevaCuenta = new CuentaVista(rut, nombre);
			this.ctas.add(nuevaCuenta);
			this.numero_actual_de_cuentas+=1;
        }
	}
	public boolean Eliminar(int numero_cuenta ){ 
		//System.out.println("tamano de el array: "+ctas.size());
		for (int i = 0 ; i<ctas.size(); i++){
			System.out.println("Entrada: "+i+"al for");
			if(ctas.get(i).Numero() == numero_cuenta){
				System.out.println("Se ha eliminado La siguiente cuenta:"+
									"\n"+ctas.get(i).toString());
				this.ctas.remove(i);
				this.numero_actual_de_cuentas-=1;
				return true;
			}
		}
		System.out.println("Cuenta no encontrada");
		return false;
    }
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