package Model;

public class Wallet {
    private int saldo;

    public Wallet() {
        super();
        saldo = 0;
    }

    public String guardarDinero(int valor){if(valor <0)
    return "Cantidad no valida";{  saldo += valor;
        return "Exito! Ahora tines " + saldo;
        ){public String retirarDinero(int valor)(saldo-= valor;
            if(valor > saldo){
                return "Saldo insuficiente";}
        
        }
        return "Exito! Ahora tienes" + saldo;{}

        public String.consultarSaldo(){
            return "tu saldo es: $" + saldo;
        }
}
      



