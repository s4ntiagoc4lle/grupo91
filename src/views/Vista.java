package views;

import Model.Wallet;

public class Vista {
    public static void main(String[] args) {
        //creamos objeto de wallet
        Wallet billetera1 = new Wallet();
        
        System.out.println(billetera1.consultarSaldo());
        System.out.println(billetera1.guardarDinero(50000));
        System.out.println(billetera1.consultarSaldo());
        

    }
}
