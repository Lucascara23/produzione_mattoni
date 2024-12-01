/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.produzione_mattoni;

/**
 *
 * @author lucascarabattoli
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
   private static final String file_log = "file_produzione.txt";

    public static synchronized void scriviLog(String messaggio) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file_log, true))) {
            writer.write(messaggio);
            writer.newLine();
        } catch (IOException e) {
        }
    }
}


