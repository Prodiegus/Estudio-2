public class CuentaVista extends Cuenta{
    // al decir CuentaVista extends Cuenta estamos creando una instancia de herencia
    // eso quiere decir que este "hijo puede acceder a su padre "Cuenta"
    // esto nos da la ventaja para poder manipular una cuenta vista y una cuenta ahorro
    // por separado.
        public CuentaVista(int rut, String nombre) {
            super(rut, nombre);
    
            this.numero_cuenta = rut/2*5;
            System.out.println(toString());
        }
        @Override
        public int Numero() {return this.numero_cuenta;}
        @Override
        public void Girar(float cantidad) {
            if(cantidad+300<=this.saldo && cantidad<=400000){
                this.saldo-=(cantidad+300);
            }else{
                System.out.println("El giro no se ha efectuado\n\n");
                System.out.println("Usted no cumple con las condiciones para realizar el giro");
            }
        
        }
        @Override
        public void Depositar(float cantidad) {
            if(cantidad<1000000){
                this.saldo+=cantidad;
            }else{
                System.out.println("Usted excedio el limite de deposito");
            }
        }
        @Override
        public void Imprimir() {}
        public String toString(){
            return "Cuenta vista\nNombre: "+nombre
                    +"\nNumero de cuenta: "
                    +numero_cuenta+"\nsaldo: "
                    +saldo+"\n";
        }
    }