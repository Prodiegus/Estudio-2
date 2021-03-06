abstract public class Cuenta {
    protected int numero_cuenta;
    protected String nombre;
    protected float saldo;
    protected int rut;
    public Cuenta(int rut , String nombre ){
        this.nombre = nombre;
        this.rut = rut;
        this.numero_cuenta = rut/4*5;
		this.saldo = 0.0f;
	}
    public int Rut(){return rut;}
    public String Nombre(){return nombre;}
    public float Saldo(){return saldo;}
    public abstract int Numero();
    public abstract void Girar ( float cantidad );
    public abstract void Depositar ( float cantidad );
    public abstract void Imprimir();    
}