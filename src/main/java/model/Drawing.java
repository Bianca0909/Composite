package model;

import interfaces.Shape;
import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
    
    private List<Shape> children = new ArrayList<Shape>();
    
    @Override
    public void draw(String cor) {
        
    }
    
    public void addChilden(Shape c) {
        children.add(c);
    }
    
    public void removeChildren(Shape c) {
        children.remove(c);
    }
    
    public List<Shape> getChildren() {
        return this.children;
    }
    
    public void clear() {
        children.clear();
    }
    
    public void drawing(String cor) {
        for (Shape shape : children) {
            shape.draw(cor);
        }
    }
}
