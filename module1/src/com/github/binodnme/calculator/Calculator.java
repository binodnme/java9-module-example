package com.github.binodnme.calculator;

import com.github.binodnme.printer.Printer;

/**
 * @author Binod Shrestha <binodshrestha@lftechnology.com> on 4/4/17.
 */
public class Calculator {

    public static Integer add(Integer number1, Integer number2) {
        Integer result = number1 + number2;
        Printer.print(result);
        return result;
    }

}
