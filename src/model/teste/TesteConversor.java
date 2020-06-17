/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.teste;

import model.design.Conversor;

/**
 *
 * @author Elias
 */
public class TesteConversor {
    public static void main(String[] args) {
        //Instâbcias de objeto
        Conversor con = new Conversor();
        
        System.out.printf("%.2f°C = %.2f°F\n", 0.0, con.celFah(0.0));
        System.out.printf("%.2f°C = %.2f°F\n", -40.0, con.celFah(-40.0));
        System.out.printf("%.2f°C = %.2f°F\n\n\n", 38.0, con.celFah(38.0));
        System.out.printf("%.2f°F = %.2f°C\n", 0.0, con.fahCel(0.0));
        System.out.printf("%.2f°F = %.2f°C\n", -40.0, con.fahCel(-40.0));
        System.out.printf("%.2f°F = %.2f°C\n\n\n", 38.0, con.fahCel(38.0));
    }
}
