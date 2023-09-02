package CodeOrigin;

import java.lang.reflect.Method;
import CodeOrigin.calculadoraCientifica.calc;

public class calcul extends calc{
  public static void main(String[] args) {
    calc cal = new calc();
     cal.soma();
     cal.soma();
  }

  public static double soma() {
    return 1.0 + 2.0;
  }

}
