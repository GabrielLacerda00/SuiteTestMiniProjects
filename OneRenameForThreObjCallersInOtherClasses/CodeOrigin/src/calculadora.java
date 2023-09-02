package CodeOrigin.src;

import CodeOrigin.src.calculadoraCientifica.calc;
import java.lang.reflect.Method;

public class calculadora extends calc {
  public static void main(String[] args) {
    calc cal = new calc();
    cal.soma();
  }

  public static double soma() {
    return 1.0 + 2.0;
  }

}
