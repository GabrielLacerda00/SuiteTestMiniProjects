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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        // The following exception was thrown during execution in test generation
        try {
            Calculadora calculadora0 = new Calculadora();
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Unresolved compilation problem: ??Must declare a named package because this compilation unit is associated to the named module 'CodeOrigin'?");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }
}

