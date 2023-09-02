package test;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        // The following exception was thrown during execution in test generation
        try {
            calculadora calculadora0 = new calculadora();
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Unresolved compilation problems: ??Must declare a named package because this compilation unit is associated to the named module 'codeOrigin'??The declared package \"CodeOrigin.src\" does not match the expected package \"\"??The import codeOrigin cannot be resolved??calc cannot be resolved to a type?");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        // The following exception was thrown during execution in test generation
        try {
            double double0 = calculadora.soma();
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Unresolved compilation problem: ?");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        // The following exception was thrown during execution in test generation
        try {
            calculadoraCientifica.calc calc0 = new calculadoraCientifica.calc();
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Unresolved compilation problem: ??The declared package \"CodeOrigin.src.calculadoraCientifica\" does not match the expected package \"calculadoraCientifica\"?");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        // The following exception was thrown during execution in test generation
        try {
            double double0 = calculadoraCientifica.calc.soma();
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Unresolved compilation problem: ?");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }
}

