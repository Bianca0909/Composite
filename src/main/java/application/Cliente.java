package application;

import interfaces.Component;
import model.Caixa;
import model.Martelo;

public class Cliente {
    
    public static void main(String[] args) {
    Martelo produto1 = new Martelo("Martelinho", 30.6);
    Martelo produto2 = new Martelo("Martelo", 50.0);
    
    Caixa caixa = new Caixa();
    caixa.addChildren(produto1);
    caixa.addChildren(produto2);
    
    var valorTotal = caixa.execute();

        System.out.println("Valor total dos produtos: R$ " + valorTotal);
    
    }
}
