package CodeDestiny;

import CodeDestiny.calculadoraCientifica.calc;
import java.lang.reflect.Method;

public class calculadora extends calc {
  public static void main(String[] args) {
      calc cal = new calc();
      cal.sum();
      cal.sum();
  }

  public static double soma() {
    return 1.0 + 2.0;
  }

}
