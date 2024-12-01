/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.produzione_mattoni;

/**
 *
 * @author lucascarabattoli
 */
public class Produzione_mattoni {
    private static final int NUMERO_MESCOLATRICI = 8;
    private static final int MATTONI_PER_CICLO = 1600;

    public static void main(String[] args) throws InterruptedException {
        Logger.scriviLog("La produzione è stata avviata.");

       
        Mescolatrice[] mescolatrici = new Mescolatrice[NUMERO_MESCOLATRICI];
        for (int i = 0; i < NUMERO_MESCOLATRICI; i++) {
            mescolatrici[i] = new Mescolatrice(i + 1);
            mescolatrici[i].start();
        }
        for (Mescolatrice mescolatrice : mescolatrici) {
            mescolatrice.join();
        }

        // Fase 2: Cottura dei mattoni
        Forno forno = new Forno();
        int mattoniCotti = 0;
        while (mattoniCotti < MATTONI_PER_CICLO) {
            forno.Cuoci_mattoni(Math.min(400, MATTONI_PER_CICLO - mattoniCotti));
            mattoniCotti += 400;
        }

       
        Imballaggio Imballaggio = new Imballaggio();
        Imballaggio.imballaggio_mattoni(MATTONI_PER_CICLO);

        Logger.scriviLog("Produzione completata.");
    }
}
