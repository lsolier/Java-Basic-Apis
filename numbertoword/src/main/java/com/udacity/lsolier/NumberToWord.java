package com.udacity.lsolier;

import jdk.nashorn.internal.objects.NativeUint8Array;

public class NumberToWord {

  private static final String[] LESS_THAN_20 =
      {"", "un", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve",
          "diez", "once", "doce", "trece", "catorce", "quince", "diesiseis",
          "diesisiete", "diesiocho", "diesinueve"};
  private static final String[] TENS = {"", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
  private static final String[] THOUSANDS = {"", "mil", "millon", "mil millones"};

  public static String translateNumberToWord(int number) {
    if (number == 0) {
      return "cero";
    }
    int i = 0;
    String words = "";
    while(number > 0) {
      if (number % 1000 != 0) {
        words = helper(number % 1000) + THOUSANDS[i] + " " + words;
      }
      number /= 1000;
      i++;
    }
    return words.trim();
  }

  public static String helper(int number) {
    if (number == 0) {
      return "";
    } else if(number < 20) {
      return LESS_THAN_20[number] + " ";
    } else if (number < 100) {
      return TENS[number/10] + " " + helper(number % 10);
    } else if (number/100 == 1) {
      return " ciento " + helper(number % 100);
    } else {
      return LESS_THAN_20[number/100] + " cientos " + helper(number % 100);
    }
  }
}
