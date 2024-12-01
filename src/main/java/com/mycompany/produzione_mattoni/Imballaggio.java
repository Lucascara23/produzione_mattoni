/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.produzione_mattoni;

/**
 *
 * @author lucascarabattoli
 */
public class Imballaggio {
    private static final int MAX_IMBA=1600;
    
    public void imballaggio_mattoni(int mattoni ) throws InterruptedException{
      Logger.scriviLog("Inizia l'imballaggio dei " + mattoni + "mattoni");
     Thread.sleep(1000);
     Logger.scriviLog("è stato completato completato l'imballaggio di " + mattoni + "mattoni");
        
    }
    
    
    
    
}
