package CodeOrigin.src;

import java.lang.reflect.Method;
import CodeOrigin.src.calculadoraCientifica.calc;

public class calcul extends calc{
  public static void main(String[] args) {
    calc cal = new calc();
    cal.soma();
  }

  public static double soma() {
    return 1.0 + 2.0;
  }

}
