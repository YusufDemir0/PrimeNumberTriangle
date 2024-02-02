/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primenumber;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author yusuf
 */
public class PrimeNumberCalculator {

    private static int i;

    public static int PrimeNumberCalculator(int i) {
        PrimeNumberCalculator.i = i;
        return Calc();
    }

    private static int Calc() {
        for (int current = PrimeNumberCalculator.i-1; current > 1; current--) {
            if (PrimeNumberCalculator.i % current == 0 ) {
                return 0;
            }
        }
        return 1;
        //eğer 1 return ederse asal
    }

}
