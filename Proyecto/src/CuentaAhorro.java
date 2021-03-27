public class CuentaAhorro extends Cuenta{
    // al decir CuentaVista extends Cuenta estamos creando una instancia de herencia
    // eso quiere decir que este "hijo puede acceder a su padre "Cuenta"
    // esto nos da la ventaja para poder manipular una cuenta vista y una cuenta ahorro
    // por separado.
        public CuentaAhorro(int rut, String nombre) {
            super(rut, nombre);
            this.numero_cuenta = rut/3*5;
            System.out.println(toString());
        }
    
        @Override
        public void Girar(float cantidad) {
            this.saldo-=(cantidad+cantidad*0.03);
        }
        @Override
        public void Depositar(float cantidad) {}
        @Override
        public void Imprimir() {}
        public String toString(){
            return "Cuenta ahorro\nNombre: "+nombre+"\nNumero de cuenta: "+numero_cuenta+"\nsaldo: "+saldo+"\n";
        }
    
    }