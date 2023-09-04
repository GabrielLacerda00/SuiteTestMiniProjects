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
        int int2 = org.example.p1.Calculator.add((int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        int int2 = org.example.p1.Calculator.add(100, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        int int2 = org.example.p1.Calculator.add((int) (short) 0, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        int int2 = org.example.p1.Calculator.add(100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        float float6 = calculator0.division(100, 100);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        int int2 = org.example.p1.Calculator.add((int) (byte) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 135 + "'", int2 == 135);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        float float6 = calculator0.division(100, 100);
        float float9 = calculator0.division((int) (short) 100, (-52000));
        int int12 = calculator0.multiply((int) '#', (-52000));
        int int15 = calculator0.multiply((int) 'a', (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1820000) + "'", int12 == (-1820000));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 970 + "'", int15 == 970);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        int int2 = org.example.p1.Calculator.add(0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        int int2 = org.example.p1.Calculator.add(0, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.multiply(10, 100);
        int int12 = calculator0.subtract(1, 1000);
        int int15 = calculator0.multiply((int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-999) + "'", int12 == (-999));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        float float6 = calculator0.division((-1), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        int int2 = org.example.p1.Calculator.add(1, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 971 + "'", int2 == 971);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract((-52000), 971);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-52971) + "'", int6 == (-52971));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.subtract((int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.multiply(10, 100);
        float float12 = calculator0.division((-52000), (int) ' ');
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1625.0f) + "'", float12 == (-1625.0f));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        int int2 = org.example.p1.Calculator.add(135, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 232 + "'", int2 == 232);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        int int2 = org.example.p1.Calculator.add((-999), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-999) + "'", int2 == (-999));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        float float3 = calculator0.division(3465, (int) '#');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 99.0f + "'", float3 == 99.0f);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        int int2 = org.example.p1.Calculator.add((-52971), 3465);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-49506) + "'", int2 == (-49506));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        int int2 = org.example.p1.Calculator.add((-52000), (-1853985));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1905985) + "'", int2 == (-1905985));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.multiply((int) '#', (-52971));
        int int9 = calculator0.multiply((int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1853985) + "'", int6 == (-1853985));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 520 + "'", int9 == 520);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.multiply(10, 100);
        int int12 = calculator0.subtract(1, 1000);
        int int15 = calculator0.multiply(10, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-999) + "'", int12 == (-999));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.multiply(1000, (-52));
        int int12 = calculator0.multiply(1, (-52));
        int int15 = calculator0.multiply(970, 3465);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-52000) + "'", int9 == (-52000));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-52) + "'", int12 == (-52));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3361050 + "'", int15 == 3361050);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        int int2 = org.example.p1.Calculator.add((-49506), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-49507) + "'", int2 == (-49507));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.multiply(1000, (-52));
        int int12 = calculator0.multiply(1, (-52));
        int int15 = calculator0.subtract(0, (int) (byte) -1);
        int int18 = calculator0.subtract(1000, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-52000) + "'", int9 == (-52000));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-52) + "'", int12 == (-52));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 900 + "'", int18 == 900);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.subtract(1, (-999));
        float float12 = calculator0.division((int) (short) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        int int2 = org.example.p1.Calculator.add(971, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.multiply(10, 100);
        int int12 = calculator0.subtract(1, 1000);
        int int15 = calculator0.multiply(99, (int) '#');
        int int18 = calculator0.multiply((int) 'a', (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-999) + "'", int12 == (-999));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3465 + "'", int15 == 3465);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3395 + "'", int18 == 3395);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        float float6 = calculator0.division(100, 100);
        float float9 = calculator0.division((int) (short) 100, (-52000));
        int int12 = calculator0.multiply((int) '#', (-52000));
        int int15 = calculator0.multiply((int) 'a', (int) (short) 10);
        int int18 = calculator0.subtract(1, 0);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1820000) + "'", int12 == (-1820000));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 970 + "'", int15 == 970);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.multiply(232, 520);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 120640 + "'", int3 == 120640);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        int int2 = org.example.p1.Calculator.add(0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.subtract(1, (-999));
        float float12 = calculator0.division(1000, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 28.0f + "'", float12 == 28.0f);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        float float9 = calculator0.division((-10), 200);
        float float12 = calculator0.division(3455, (-52));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-66.0f) + "'", float12 == (-66.0f));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.multiply(10, 100);
        int int12 = calculator0.subtract(1, 1000);
        int int15 = calculator0.multiply(99, (int) '#');
        int int18 = calculator0.subtract(900, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            float float21 = calculator0.division((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-999) + "'", int12 == (-999));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3465 + "'", int15 == 3465);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 800 + "'", int18 == 800);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        float float6 = calculator0.division(100, 100);
        float float9 = calculator0.division((int) (short) 100, (-52000));
        int int12 = calculator0.multiply((int) '#', (-52000));
        int int15 = calculator0.subtract(232, (-52000));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1820000) + "'", int12 == (-1820000));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52232 + "'", int15 == 52232);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        int int2 = org.example.p1.Calculator.add(900, (-52));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 848 + "'", int2 == 848);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        int int2 = org.example.p1.Calculator.add(1000, (-52971));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-51971) + "'", int2 == (-51971));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.multiply(10, 100);
        int int12 = calculator0.subtract(1, 1000);
        int int15 = calculator0.multiply(10, (int) (short) 0);
        int int18 = calculator0.multiply((int) (byte) 1, (int) (byte) 10);
        int int21 = calculator0.multiply((int) (short) 10, (int) (byte) -1);
        float float24 = calculator0.division((-999), (-1820000));
        int int27 = calculator0.subtract(1000, (-49506));
        int int30 = calculator0.subtract((int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-999) + "'", int12 == (-999));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 50506 + "'", int27 == 50506);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-11) + "'", int30 == (-11));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.multiply(10, 100);
        int int12 = calculator0.subtract(1, 1000);
        int int15 = calculator0.multiply(10, (int) (short) 0);
        int int18 = calculator0.multiply((int) (byte) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-999) + "'", int12 == (-999));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.multiply(10, 100);
        float float12 = calculator0.division((-52000), (int) ' ');
        int int15 = calculator0.subtract((-10), 52232);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1625.0f) + "'", float12 == (-1625.0f));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-52242) + "'", int15 == (-52242));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.multiply(10, 100);
        float float12 = calculator0.division((-52000), (int) ' ');
        int int15 = calculator0.multiply(0, (-52));
        int int18 = calculator0.subtract(971, 135);
        float float21 = calculator0.division((int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1625.0f) + "'", float12 == (-1625.0f));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 836 + "'", int18 == 836);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        int int2 = org.example.p1.Calculator.add(232, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 267 + "'", int2 == 267);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        float float9 = calculator0.division((-10), 200);
        int int12 = calculator0.subtract((-999), (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1051) + "'", int12 == (-1051));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.multiply(1000, (-52));
        int int12 = calculator0.multiply(1, (-52));
        int int15 = calculator0.subtract(0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-52000) + "'", int9 == (-52000));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-52) + "'", int12 == (-52));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.multiply(10, 100);
        int int12 = calculator0.subtract(1, 1000);
        int int15 = calculator0.multiply(10, (int) (short) 0);
        int int18 = calculator0.multiply((int) (byte) 1, (int) (byte) 10);
        int int21 = calculator0.multiply((int) (short) 10, (int) (byte) -1);
        int int24 = calculator0.subtract(135, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-999) + "'", int12 == (-999));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 136 + "'", int24 == 136);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.multiply(1000, (-52));
        int int12 = calculator0.subtract(3465, (int) (byte) 10);
        float float15 = calculator0.division((int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-52000) + "'", int9 == (-52000));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3455 + "'", int12 == 3455);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.multiply(10, 100);
        float float12 = calculator0.division((-52000), (int) ' ');
        int int15 = calculator0.multiply(0, (-52));
        int int18 = calculator0.subtract(971, 135);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1625.0f) + "'", float12 == (-1625.0f));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 836 + "'", int18 == 836);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.multiply((int) '#', (-11));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-385) + "'", int9 == (-385));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.multiply(10, (-52242));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-522420) + "'", int9 == (-522420));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.multiply(10, 100);
        int int12 = calculator0.subtract(1, 1000);
        int int15 = calculator0.multiply(99, (int) '#');
        int int18 = calculator0.subtract(900, (int) (short) 100);
        int int21 = calculator0.subtract((-49507), 3361050);
        int int24 = calculator0.multiply(200, 232);
        int int27 = calculator0.multiply(3395, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-999) + "'", int12 == (-999));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3465 + "'", int15 == 3465);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 800 + "'", int18 == 800);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3410557) + "'", int21 == (-3410557));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 46400 + "'", int24 == 46400);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.subtract(1, (-999));
        float float12 = calculator0.division((int) (short) 100, (int) (byte) 10);
        int int15 = calculator0.multiply((-999), (-1051));
        int int18 = calculator0.subtract((-52000), (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049949 + "'", int15 == 1049949);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-52035) + "'", int18 == (-52035));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.multiply(10, 100);
        int int12 = calculator0.subtract(1, 1000);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-999) + "'", int12 == (-999));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        int int2 = org.example.p1.Calculator.add(200, (-51971));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-51771) + "'", int2 == (-51771));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        int int2 = org.example.p1.Calculator.add(267, (-522420));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-522153) + "'", int2 == (-522153));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.multiply(1000, (-52));
        int int12 = calculator0.subtract(3361050, (int) (short) 0);
        float float15 = calculator0.division((-52242), (-3410557));
        int int18 = calculator0.subtract((int) (short) 0, 970);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-52000) + "'", int9 == (-52000));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3361050 + "'", int12 == 3361050);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-970) + "'", int18 == (-970));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        int int2 = org.example.p1.Calculator.add(971, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 981 + "'", int2 == 981);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        int int2 = org.example.p1.Calculator.add((int) (byte) 1, 135);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 136 + "'", int2 == 136);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.multiply(1000, (-52));
        int int12 = calculator0.multiply(1, (-52));
        float float15 = calculator0.division((-1), 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-52000) + "'", int9 == (-52000));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-52) + "'", int12 == (-52));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.multiply(10, 100);
        float float12 = calculator0.division((-52000), (int) ' ');
        int int15 = calculator0.multiply(0, (-52));
        float float18 = calculator0.division(10, 800);
        int int21 = calculator0.subtract((-49507), 520);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1625.0f) + "'", float12 == (-1625.0f));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-50027) + "'", int21 == (-50027));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.example.p1.Calculator calculator0 = new org.example.p1.Calculator();
        int int3 = calculator0.subtract((int) (short) 0, (int) '4');
        int int6 = calculator0.subtract(0, (int) (byte) 0);
        int int9 = calculator0.multiply(10, 100);
        float float12 = calculator0.division((-52000), (int) ' ');
        int int15 = calculator0.multiply(0, (-52));
        int int18 = calculator0.subtract(971, 135);
        int int21 = calculator0.subtract((-522153), (-50027));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-52) + "'", int3 == (-52));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1625.0f) + "'", float12 == (-1625.0f));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 836 + "'", int18 == 836);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-472126) + "'", int21 == (-472126));
    }
}

