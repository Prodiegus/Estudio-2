public class CuentaAhorro extends Cuenta{

    public CuentaAhorro(int rut, String nombre) {
        super(rut, nombre);
    }

    @Override
    public void Girar(float cantidad) {}
    @Override
    public void Depositar(float cantidad) {}
    @Override
    public void Imprimir() {}
    public String toString(){
        return "Cuenta ahorro\nNombre: "+nombre+"\nNumero de cuenta: "+numero_cuenta+"\nsaldo: "+saldo+"\n";
    }

}