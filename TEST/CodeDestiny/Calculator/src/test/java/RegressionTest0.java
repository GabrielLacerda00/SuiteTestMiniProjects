import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        java.lang.Class<?> wildcardClass1 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.subtract((int) '4', (int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.subtract((-2), 10);
        int int12 = calculator0.multiply((int) 'a', (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-12) + "'", int9 == (-12));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 970 + "'", int12 == 970);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.multiply(53, 1);
        int int6 = calculator0.add((-2), (-52));
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-54) + "'", int6 == (-54));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.subtract((int) '4', (int) (byte) -1);
        float float12 = calculator0.division((int) (byte) 0, (int) (short) -1);
        int int15 = calculator0.subtract((int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-25) + "'", int15 == (-25));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.subtract((-2), 10);
        int int12 = calculator0.multiply(64, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-12) + "'", int9 == (-12));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2048 + "'", int12 == 2048);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.add((-52), 0);
        int int6 = calculator0.subtract((int) (short) 10, (-12));
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.add((-52), 0);
        int int6 = calculator0.subtract((int) (short) 10, (-12));
        float float9 = calculator0.division((int) (short) 10, 22);
        int int12 = calculator0.add((int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.subtract((int) '4', (int) (byte) -1);
        int int12 = calculator0.add((int) (short) 10, (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-90) + "'", int12 == (-90));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.subtract((-1), (int) (short) 1);
        int int12 = calculator0.subtract((int) ' ', 0);
        float float15 = calculator0.division((int) 'a', 32);
        int int18 = calculator0.multiply(107, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 3.0f + "'", float15 == 3.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.add((-52), 0);
        int int6 = calculator0.add((int) '4', 0);
        int int9 = calculator0.multiply((int) (short) -1, (-54));
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 54 + "'", int9 == 54);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.add((-52), 0);
        float float9 = calculator0.division((-2), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-52) + "'", int6 == (-52));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.subtract((-1), (int) (short) 1);
        int int12 = calculator0.subtract((int) ' ', 0);
        float float15 = calculator0.division((int) 'a', 32);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 3.0f + "'", float15 == 3.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.subtract((int) '4', (int) (byte) -1);
        int int12 = calculator0.add(54, 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 108 + "'", int12 == 108);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.subtract((-2), 10);
        int int12 = calculator0.multiply((int) 'a', (int) (short) 10);
        int int15 = calculator0.multiply(22, 0);
        int int18 = calculator0.subtract((-54), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-12) + "'", int9 == (-12));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 970 + "'", int12 == 970);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-54) + "'", int18 == (-54));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        float float6 = calculator0.division(1, 22);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.add((-52), 0);
        float float6 = calculator0.division(0, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.add((-52), 0);
        int int6 = calculator0.add(11, 53);
        int int9 = calculator0.multiply((int) (byte) -1, 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-53) + "'", int9 == (-53));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        float float6 = calculator0.division(1, 22);
        int int9 = calculator0.add((int) ' ', (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.add((-52), 0);
        int int6 = calculator0.add(11, 53);
        float float9 = calculator0.division(22, 10);
        int int12 = calculator0.add(2048, (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.0f + "'", float9 == 2.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1948 + "'", int12 == 1948);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.add((-52), 0);
        float float9 = calculator0.division(100, (int) (byte) -1);
        int int12 = calculator0.add((-11), (-11));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-52) + "'", int6 == (-52));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-100.0f) + "'", float9 == (-100.0f));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-22) + "'", int12 == (-22));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.subtract((-2), 10);
        int int12 = calculator0.multiply((int) 'a', (int) (short) 10);
        int int15 = calculator0.subtract((-1), (int) (byte) -1);
        int int18 = calculator0.multiply(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-12) + "'", int9 == (-12));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 970 + "'", int12 == 970);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        float float6 = calculator0.division(1, 22);
        float float9 = calculator0.division(1000, 1000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.multiply((-52), (int) (short) -1);
        float float9 = calculator0.division((int) (short) 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.add((int) (short) 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            float float9 = calculator0.division(10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.subtract((-1), (int) (short) 1);
        int int12 = calculator0.subtract((int) ' ', 0);
        float float15 = calculator0.division((int) 'a', 32);
        int int18 = calculator0.subtract((-90), 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 3.0f + "'", float15 == 3.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-143) + "'", int18 == (-143));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.add((-52), 0);
        int int9 = calculator0.add((-12), (int) (short) 1);
        int int12 = calculator0.subtract((int) (short) 0, (-54));
        int int15 = calculator0.multiply((int) ' ', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-52) + "'", int6 == (-52));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-11) + "'", int9 == (-11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 54 + "'", int12 == 54);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3200 + "'", int15 == 3200);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.subtract((-2), 10);
        int int12 = calculator0.multiply((int) 'a', (int) (short) 10);
        int int15 = calculator0.multiply((int) (short) 0, 1948);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-12) + "'", int9 == (-12));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 970 + "'", int12 == 970);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.multiply((int) '#', 0);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.add((-52), 0);
        int int9 = calculator0.add((-12), (int) (short) 1);
        int int12 = calculator0.subtract((int) (short) 0, (-54));
        float float15 = calculator0.division((int) (short) 0, 64);
        int int18 = calculator0.multiply(970, 107);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-52) + "'", int6 == (-52));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-11) + "'", int9 == (-11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 54 + "'", int12 == 54);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 103790 + "'", int18 == 103790);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.add((-52), 0);
        int int6 = calculator0.add(11, 53);
        float float9 = calculator0.division(100, 53);
        int int12 = calculator0.subtract(108, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 107 + "'", int12 == 107);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.multiply(53, 1);
        int int6 = calculator0.add((-51), 108);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 57 + "'", int6 == 57);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.add((-52), 0);
        int int6 = calculator0.add(11, 53);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.add((-52), 0);
        int int6 = calculator0.multiply(100, 10);
        int int9 = calculator0.multiply((-90), 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5130) + "'", int9 == (-5130));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.add((-52), 0);
        int int6 = calculator0.add((int) '4', 0);
        int int9 = calculator0.multiply((int) (short) -1, (-54));
        int int12 = calculator0.multiply((-90), (-52));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 54 + "'", int9 == 54);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4680 + "'", int12 == 4680);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.subtract((-1), (int) (short) 1);
        int int12 = calculator0.subtract((int) ' ', 0);
        float float15 = calculator0.division((int) 'a', 32);
        int int18 = calculator0.subtract((-1), (int) ' ');
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 3.0f + "'", float15 == 3.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-33) + "'", int18 == (-33));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.add((-52), 0);
        float float9 = calculator0.division(100, (int) (byte) -1);
        int int12 = calculator0.multiply((int) (byte) 0, (-1));
        float float15 = calculator0.division((-12), (-33));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-52) + "'", int6 == (-52));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-100.0f) + "'", float9 == (-100.0f));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.multiply(53, 1);
        int int6 = calculator0.add((-2), (-52));
        int int9 = calculator0.subtract((int) '#', 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-54) + "'", int6 == (-54));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        float float3 = calculator0.division((-52), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.subtract((int) '4', (int) (byte) -1);
        float float12 = calculator0.division((int) (byte) 0, (int) (short) -1);
        int int15 = calculator0.multiply(0, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.subtract((-2), 10);
        int int12 = calculator0.add((int) '#', 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-12) + "'", int9 == (-12));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.subtract((-2), 10);
        int int12 = calculator0.multiply((int) 'a', (int) (short) 10);
        int int15 = calculator0.multiply(22, 0);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-12) + "'", int9 == (-12));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 970 + "'", int12 == 970);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.add((-52), 0);
        int int6 = calculator0.add((int) '4', 0);
        int int9 = calculator0.add(1948, (-22));
        int int12 = calculator0.add(32, 1948);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1926 + "'", int9 == 1926);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1980 + "'", int12 == 1980);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        float float3 = calculator0.division((-54), (int) (short) 1);
        int int6 = calculator0.subtract(52, 970);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-54.0f) + "'", float3 == (-54.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-918) + "'", int6 == (-918));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.multiply(53, 1);
        int int6 = calculator0.multiply(1, (int) (byte) 100);
        int int9 = calculator0.multiply((int) (short) -1, (int) (short) 100);
        int int12 = calculator0.subtract(970, 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 916 + "'", int12 == 916);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.add((-52), 0);
        int int6 = calculator0.add(11, 53);
        float float9 = calculator0.division(100, 53);
        int int12 = calculator0.add(1, (-52));
        int int15 = calculator0.add((int) (short) 0, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-51) + "'", int12 == (-51));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.add((int) (short) 1, (int) (byte) 10);
        int int9 = calculator0.subtract((int) (byte) 0, 0);
        float float12 = calculator0.division(103790, (-11));
        int int15 = calculator0.multiply(1926, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-9435.0f) + "'", float12 == (-9435.0f));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 61632 + "'", int15 == 61632);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.subtract((-1), (int) (short) 1);
        int int12 = calculator0.subtract((int) ' ', 0);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.add((-52), 0);
        int int6 = calculator0.add(11, 53);
        int int9 = calculator0.add((int) (short) 0, 1948);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1948 + "'", int9 == 1948);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.subtract((-1), (int) (short) 1);
        int int12 = calculator0.subtract((int) ' ', 0);
        float float15 = calculator0.division((int) 'a', 32);
        int int18 = calculator0.subtract(64, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 3.0f + "'", float15 == 3.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-36) + "'", int18 == (-36));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.multiply(53, 1);
        int int6 = calculator0.add((int) (byte) 1, (int) '4');
        int int9 = calculator0.add((int) (short) -1, (-90));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-91) + "'", int9 == (-91));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.add((-52), 0);
        int int9 = calculator0.subtract(32, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-52) + "'", int6 == (-52));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.add((-52), 0);
        int int9 = calculator0.add((-12), (int) (short) 1);
        int int12 = calculator0.add((-918), 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-52) + "'", int6 == (-52));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-11) + "'", int9 == (-11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-861) + "'", int12 == (-861));
    }
}

