package model;

import interfaces.Component;
import java.util.ArrayList;
import java.util.List;

public class Caixa implements Component {

    private List<Component> children = new ArrayList<Component>();
    
    public void addChildren(Component component) {
        children.add(component);
    }
    
    public void removeChildren(Component component) {
        children.remove(component);
    }
    
    @Override
    public Double execute() {
        Double valorCaixa = 0.0;
        
        for (Component component : children) {
             valorCaixa += component.execute();
        }
        
        return valorCaixa;
    }   
    
}
