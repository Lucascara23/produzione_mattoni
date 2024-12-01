/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.produzione_mattoni;

/**
 *
 * @author lucascarabattoli
 */

public class Mescolatrice extends Thread {
    private int id;
    
    public Mescolatrice(int id){
        this.id = id;
    }
    
    public void run(){
      try {
            Logger.scriviLog("Mescolatrice " + id + "inizia ");
            Thread.sleep(1000);
             Logger.scriviLog("Mescolatrice " + id + "ha finito ");
        } catch (InterruptedException e) {
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
