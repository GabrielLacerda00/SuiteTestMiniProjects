package CodeOrigin.src;

import java.lang.reflect.Method;
import CodeDestiny.src.calculadoraCientifica.calc;

public class calculad extends calc{
  public static void main(String[] args) {
    calc cal = new calc();
    cal.sum();
  }

  public static double soma() {
    return 1.0 + 2.0;
  }

}
