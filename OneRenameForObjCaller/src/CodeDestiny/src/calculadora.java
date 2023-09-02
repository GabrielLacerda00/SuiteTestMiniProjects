package codeDestiny;
import java.lang.reflect.Method;
import codeDestiny.calculadoraCientifica.calc;

public class calculadora extends calc{
  public static void main(String[] args) {
    calc cal = new calc();
    cal.sum();
  }

  public double soma() {
    return 1.0 + 2.0;
  }

}
