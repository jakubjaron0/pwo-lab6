/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.seq;

import java.math.BigDecimal;

/**
 * Implementacja ciągu Fibonacciego
 * @author kuba
 */
public class FibonacciGenerator extends Generator {

    /**
     * Konstruktor klasy 
     */
    public FibonacciGenerator() {
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }

    /**
     * metoda resetująca ciąg
     */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }

    /**
     *
     * @return zwracaca kolejny wyraz ciągu Fibonnaciego
     */
    @Override
    public BigDecimal nextTerm() {

        if (lastIndex > 1) {
            current = f_1.add(f_2);
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 1) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }

        lastIndex++;
        return current;
    }
}
