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
		for (int i = 0 ; i<ctas.size(); i++){
			if(ctas.get(i).Numero() == numero_cuenta){
				System.out.println("\nSe ha eliminado La siguiente cuenta:"+
									"\n"+ctas.get(i).toString());
				this.ctas.remove(i);
				this.numero_actual_de_cuentas-=1;
				return true;
			}
		}
		System.out.println("Cuenta no encontrada");
		return false;
    }
	public boolean checkClient(int rut){
		for(int i = 0; i<ctas.size(); i++){
			if(ctas.get(i).Rut() == rut){
				System.out.println("\n\nLa cuenta se encuentra afiliada: \n"+
				ctas.get(i).toString());
				return true;
			}
		}
		System.out.println("El rut solicitado no esta afiliado a nuestro banco");
		return false;
	}
	public boolean deposito(float cantidad, int numero_cuenta){
		for(int i = 0; i<ctas.size();i++){
			if(ctas.get(i).Numero() == numero_cuenta){
				ctas.get(i).Depositar(cantidad);
				System.out.println("\n\nSe ha depositado: "+cantidad+"\n"+
				ctas.get(i).toString());
				return true;
			}
		}
		System.out.println("No se ha podido realizar el deposito por motivos no encontrados");
		return false;
	}
	public boolean giro(float cantidad, int numero_cuentas){
		for(int i = 0; i<ctas.size(); i++){
			if(ctas.get(i).Numero()== numero_cuentas){
				ctas.get(i).Girar(cantidad);
				System.out.println("\n\nSe ha girado: "+cantidad+"\n"+
				ctas.get(i).toString());
				return true;
			}
		}
		System.out.println("No se ha podido realizar el giro por motivos no encontrados");
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