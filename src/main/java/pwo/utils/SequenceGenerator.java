/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pwo.utils;

/**
 * Interfejs dowolnego generatora 
 * liczbowego o wyrazach zdefiniowanych  w zakresie od 0.
 * @author kuba
 * @version 1.0.0
 */
import java.math.BigDecimal;

/**
 *
 * @author student
 */
public interface SequenceGenerator {

    /**
     * Powoduje że metoda {@link #nextTerm()}
     * rozpoczyna od 0. <br>
     * nie wpływa na działanie metody {@link #getTerm(int)}.
     */
    void reset();

    /**
     *Zwraca kolejny wyraz ciągu.
     * @return Wartość wyrazu ciągu.
     * @see @getTerm(int)
     */
    BigDecimal nextTerm();

    /**
     *Zwraca wyraz ciągu o podanym indeksie.
     *
     * @param i Nr wyrazu ciągu dla którego
     * jest uzyskiwana wartość
     * @return Wartość wyrazu ciągu o indeksie i
     * @exception IllegalArgumentException jeżeli i < 0
     * @see #nextTerm()
     * 
     */
    BigDecimal getTerm(int i);
}
