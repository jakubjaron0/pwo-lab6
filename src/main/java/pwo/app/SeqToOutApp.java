/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.app;

import pwo.utils.SequenceTools;

/**
 *
 * @author student
 */
public class SeqToOutApp extends SeqToFileApp {

    /**
     *
     * @param args tablica argumentów typu String
     * @return typ ciągu
     */
    @Override
 protected boolean getArgs(String[] args) {
     
     if(super.getArgs(args)) {return true;}
     
     return seqType != null && from >= 0 && to >= 0;
 }

    /**
     *
     * @return prawde jeśli pomyślnie zapisano ciąg do pliku
     */
    @Override
 protected boolean wirteSeq() {
     
     System.out.println(SequenceTools.getTermsAsColumn(seqType.getGenerator(), from, to));

     return true;
 }

    /**
     *
     * @param args argumenty w postaci tablicy ciągu
     */
    @Override
 public void run(String[] args) {
     System.out.println("Sequence to terminal CLI app");

 if (!getArgs(args)) {
 System.out.println("!Illegal arguments\n"
 + "Legal usage: seqName from to");
 return;
 }

 wirteSeq();
     
 }
}
