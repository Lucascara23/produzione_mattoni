/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.produzione_mattoni;

/**
 *
 * @author lucascarabattoli
 */
public class Forno {
   private static final int MAX_MATTONI=400;
   
   public void Cuoci_mattoni(int mattoni) throws InterruptedException{
    Logger.scriviLog("Il forno inizia la cottura " + mattoni + "mattoni");
     Thread.sleep(1000);
     Logger.scriviLog("Il forno ha completato la cottura di" + mattoni + "mattoni");
   }
    
}
