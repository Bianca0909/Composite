package application;

import interfaces.Shape;
import model.Circle;
import model.Drawing;
import model.Triangle;

public class Client {
    public static void main(String[] args) {
        Shape t1 = new Triangle();
        Shape t2 = new Triangle();
        Shape c3 = new Circle();
        
        Drawing d = new Drawing();
        d.addChilden(t1);
        d.addChilden(t2);
        d.addChilden(c3);
        
        d.draw("Azul");
    }
}
