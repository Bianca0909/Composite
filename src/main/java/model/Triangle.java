/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.Shape;

public class Triangle implements Shape {
   
    private String cor;
     
    @Override
    public void draw(String cor) {
        System.err.println("Triangle: " + cor);
    }
    
    public void triangle() {
        
    }
    
}
