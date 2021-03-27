public class CuentaVista extends Cuenta{

    public CuentaVista(int rut, String nombre) {
        super(rut, nombre);

    }

    @Override
    public void Girar(float cantidad) {}
    @Override
    public void Depositar(float cantidad) {}
    @Override
    public void Imprimir() {}
    public String toString(){
        return "Nombre: "+nombre+"\nNumero de cuenta: "+numero_cuenta+"\nsaldo: "+saldo+"\n";
    }

}