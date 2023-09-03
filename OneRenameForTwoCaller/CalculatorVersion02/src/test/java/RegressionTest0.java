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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        calculator0.printCalc();
        java.lang.Class<?> wildcardClass2 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        java.lang.Class<?> wildcardClass1 = calculator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        int int2 = CalculatorVersion01.src.main.java.org.example.code.Calculator.add((int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        int int2 = CalculatorVersion01.src.main.java.org.example.code.Calculator.add((int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        int int3 = calculator0.subtract((int) (byte) -1, (int) '#');
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-36) + "'", int3 == (-36));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        int int2 = CalculatorVersion01.src.main.java.org.example.code.Calculator.add((int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 96 + "'", int2 == 96);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        int int3 = calculator0.subtract((int) (byte) -1, (int) '#');
        int int6 = calculator0.multiply((int) '#', 70);
        int int9 = calculator0.subtract((int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-36) + "'", int3 == (-36));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2450 + "'", int6 == 2450);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        int int2 = CalculatorVersion01.src.main.java.org.example.code.Calculator.add(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        calculator0.printCalc();
        int int4 = calculator0.multiply((int) '4', 0);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        int int2 = CalculatorVersion01.src.main.java.org.example.code.Calculator.add((-770), 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-760) + "'", int2 == (-760));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        int int3 = calculator0.subtract((int) (byte) -1, (int) '#');
        int int6 = calculator0.multiply(36, 10);
        int int9 = calculator0.multiply((int) (short) 10, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-36) + "'", int3 == (-36));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 360 + "'", int6 == 360);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 320 + "'", int9 == 320);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        int int3 = calculator0.multiply(2450, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 245000 + "'", int3 == 245000);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        float float3 = calculator0.division(0, 1);
        int int6 = calculator0.subtract(100, (int) (short) 0);
        calculator0.printCalc();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        int int2 = CalculatorVersion01.src.main.java.org.example.code.Calculator.add(32, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 132 + "'", int2 == 132);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        calculator0.printCalc();
        int int4 = calculator0.multiply(1, (int) (short) -1);
        float float7 = calculator0.division((int) (byte) 100, (int) '#');
        float float10 = calculator0.division(68, (-1));
        int int13 = calculator0.subtract((int) '#', 34);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-68.0f) + "'", float10 == (-68.0f));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        calculator0.printCalc();
        int int4 = calculator0.multiply(1, (int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        calculator0.printCalc();
        int int4 = calculator0.subtract(68, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 68 + "'", int4 == 68);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        int int2 = CalculatorVersion01.src.main.java.org.example.code.Calculator.add((int) (byte) 100, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 136 + "'", int2 == 136);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        int int2 = CalculatorVersion01.src.main.java.org.example.code.Calculator.add((int) '#', (-36));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        calculator0.printCalc();
        // The following exception was thrown during execution in test generation
        try {
            float float4 = calculator0.division(770, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        int int2 = CalculatorVersion01.src.main.java.org.example.code.Calculator.add((int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        int int2 = CalculatorVersion01.src.main.java.org.example.code.Calculator.add(360, 3500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3860 + "'", int2 == 3860);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        int int3 = calculator0.subtract((int) (byte) -1, (int) '#');
        int int6 = calculator0.multiply(36, 10);
        calculator0.printCalc();
        float float10 = calculator0.division((int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-36) + "'", int3 == (-36));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 360 + "'", int6 == 360);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        int int2 = CalculatorVersion01.src.main.java.org.example.code.Calculator.add((-760), 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-663) + "'", int2 == (-663));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        float float3 = calculator0.division(0, 1);
        int int6 = calculator0.subtract(100, (int) (short) 0);
        int int9 = calculator0.subtract((int) (short) 10, (int) ' ');
        int int12 = calculator0.subtract((int) (short) 100, (int) ' ');
        int int15 = calculator0.multiply((-1), (-770));
        int int18 = calculator0.multiply(132, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-22) + "'", int9 == (-22));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 68 + "'", int12 == 68);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 770 + "'", int15 == 770);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        float float3 = calculator0.division(0, 1);
        int int6 = calculator0.subtract(100, (int) (short) 0);
        int int9 = calculator0.subtract((int) (short) 10, (int) ' ');
        int int12 = calculator0.subtract((int) (short) 100, (int) ' ');
        int int15 = calculator0.subtract(32, 360);
        float float18 = calculator0.division(320, 770);
        int int21 = calculator0.subtract((-770), (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-22) + "'", int9 == (-22));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 68 + "'", int12 == 68);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-328) + "'", int15 == (-328));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-770) + "'", int21 == (-770));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        calculator0.printCalc();
        int int4 = calculator0.subtract((int) '#', (int) (short) -1);
        float float7 = calculator0.division(96, (int) (byte) 100);
        int int10 = calculator0.multiply((int) 'a', (int) (short) 100);
        int int13 = calculator0.multiply(36, 96);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36 + "'", int4 == 36);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9700 + "'", int10 == 9700);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3456 + "'", int13 == 3456);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        calculator0.printCalc();
        int int4 = calculator0.subtract((int) '#', (int) (short) -1);
        java.lang.Class<?> wildcardClass5 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36 + "'", int4 == 36);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        int int2 = CalculatorVersion01.src.main.java.org.example.code.Calculator.add((int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        calculator0.printCalc();
        int int4 = calculator0.multiply(1, (int) (short) -1);
        calculator0.printCalc();
        int int8 = calculator0.subtract((-22), (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-57) + "'", int8 == (-57));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        calculator0.printCalc();
        int int4 = calculator0.multiply(1, (int) (short) -1);
        int int7 = calculator0.multiply((int) '#', (-22));
        float float10 = calculator0.division((int) (short) 0, 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-770) + "'", int7 == (-770));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        calculator0.printCalc();
        int int4 = calculator0.multiply(1, (int) (short) -1);
        int int7 = calculator0.subtract((int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        float float3 = calculator0.division(0, 1);
        int int6 = calculator0.subtract(100, (int) (short) 0);
        int int9 = calculator0.subtract((int) (short) 10, (int) ' ');
        int int12 = calculator0.subtract((int) (short) 100, (int) ' ');
        float float15 = calculator0.division(0, 34);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-22) + "'", int9 == (-22));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 68 + "'", int12 == 68);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        float float3 = calculator0.division(0, 1);
        int int6 = calculator0.subtract(100, (int) (short) 0);
        int int9 = calculator0.subtract((int) (short) 10, (int) ' ');
        int int12 = calculator0.multiply((int) (byte) 100, (int) '#');
        int int15 = calculator0.subtract((-1), 136);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-22) + "'", int9 == (-22));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3500 + "'", int12 == 3500);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-137) + "'", int15 == (-137));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        int int2 = CalculatorVersion01.src.main.java.org.example.code.Calculator.add(97, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        calculator0.printCalc();
        float float4 = calculator0.division((int) (byte) 0, (-36));
        calculator0.printCalc();
        int int8 = calculator0.subtract(770, 36);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 734 + "'", int8 == 734);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        int int2 = CalculatorVersion01.src.main.java.org.example.code.Calculator.add(96, 3860);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3956 + "'", int2 == 3956);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        int int2 = CalculatorVersion01.src.main.java.org.example.code.Calculator.add(425, 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10125 + "'", int2 == 10125);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        calculator0.printCalc();
        calculator0.printCalc();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        float float3 = calculator0.division(0, 1);
        int int6 = calculator0.subtract(100, (int) (short) 0);
        int int9 = calculator0.subtract((int) (short) 10, (int) ' ');
        int int12 = calculator0.subtract((int) 'a', (-328));
        int int15 = calculator0.multiply(3956, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-22) + "'", int9 == (-22));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 425 + "'", int12 == 425);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3956) + "'", int15 == (-3956));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        calculator0.printCalc();
        int int4 = calculator0.multiply(1, (int) (short) -1);
        float float7 = calculator0.division((int) (byte) 100, (int) '#');
        float float10 = calculator0.division(68, (-1));
        float float13 = calculator0.division((int) '4', 3500);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-68.0f) + "'", float10 == (-68.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        int int2 = CalculatorVersion01.src.main.java.org.example.code.Calculator.add((int) (short) 1, 3500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3501 + "'", int2 == 3501);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        calculator0.printCalc();
        int int4 = calculator0.multiply(1, (int) (short) -1);
        float float7 = calculator0.division((int) (byte) 100, (int) '#');
        calculator0.printCalc();
        int int11 = calculator0.multiply((-663), 770);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-510510) + "'", int11 == (-510510));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        int int3 = calculator0.subtract((int) (byte) -1, (int) '#');
        int int6 = calculator0.multiply(36, 10);
        calculator0.printCalc();
        calculator0.printCalc();
        calculator0.printCalc();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-36) + "'", int3 == (-36));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 360 + "'", int6 == 360);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        int int3 = calculator0.subtract((int) (byte) -1, (int) '#');
        float float6 = calculator0.division((int) '#', 3456);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-36) + "'", int3 == (-36));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        calculator0.printCalc();
        int int4 = calculator0.multiply(1, (int) (short) -1);
        calculator0.printCalc();
        int int8 = calculator0.subtract(360, (-663));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1023 + "'", int8 == 1023);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        float float3 = calculator0.division(0, 1);
        int int6 = calculator0.subtract(100, (int) (short) 0);
        int int9 = calculator0.subtract((-770), (int) (byte) 0);
        calculator0.printCalc();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-770) + "'", int9 == (-770));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        calculator0.printCalc();
        int int4 = calculator0.multiply(1, (int) (short) -1);
        float float7 = calculator0.division((int) (byte) 100, (int) '#');
        float float10 = calculator0.division(68, (-1));
        calculator0.printCalc();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-68.0f) + "'", float10 == (-68.0f));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        int int2 = CalculatorVersion01.src.main.java.org.example.code.Calculator.add(3456, 310);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3766 + "'", int2 == 3766);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        int int2 = CalculatorVersion01.src.main.java.org.example.code.Calculator.add(32, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 132 + "'", int2 == 132);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        calculator0.printCalc();
        int int4 = calculator0.subtract((int) (byte) -1, (-137));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 136 + "'", int4 == 136);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        int int2 = CalculatorVersion01.src.main.java.org.example.code.Calculator.add((int) (byte) -1, 3860);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3859 + "'", int2 == 3859);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        int int2 = CalculatorVersion01.src.main.java.org.example.code.Calculator.add(97, 3500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3597 + "'", int2 == 3597);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        calculator0.printCalc();
        float float4 = calculator0.division((int) (byte) 0, (-36));
        calculator0.printCalc();
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        calculator0.printCalc();
        int int4 = calculator0.subtract((int) '#', (int) (short) -1);
        int int7 = calculator0.multiply(0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36 + "'", int4 == 36);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        int int2 = CalculatorVersion01.src.main.java.org.example.code.Calculator.add(0, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        float float3 = calculator0.division(0, 1);
        int int6 = calculator0.subtract(100, (int) (short) 0);
        int int9 = calculator0.subtract((int) (short) 10, (int) ' ');
        int int12 = calculator0.subtract((int) 'a', (-328));
        float float15 = calculator0.division(0, 1);
        calculator0.printCalc();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-22) + "'", int9 == (-22));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 425 + "'", int12 == 425);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        calculator0.printCalc();
        int int4 = calculator0.multiply(1, (int) (short) -1);
        float float7 = calculator0.division((int) (byte) 100, (int) '#');
        int int10 = calculator0.subtract(132, (-137));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 269 + "'", int10 == 269);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        float float3 = calculator0.division(0, 1);
        int int6 = calculator0.subtract(100, (int) (short) 0);
        float float9 = calculator0.division(96, (int) (byte) -1);
        int int12 = calculator0.subtract((-328), 34);
        int int15 = calculator0.multiply(3860, (-510510));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-96.0f) + "'", float9 == (-96.0f));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-362) + "'", int12 == (-362));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1970568600) + "'", int15 == (-1970568600));
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        calculator0.printCalc();
        int int4 = calculator0.subtract((int) '#', (int) (short) -1);
        float float7 = calculator0.division(96, (int) (byte) 100);
        float float10 = calculator0.division((int) (short) 100, (-22));
        int int13 = calculator0.subtract(320, 10);
        java.lang.Class<?> wildcardClass14 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36 + "'", int4 == 36);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-4.0f) + "'", float10 == (-4.0f));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 310 + "'", int13 == 310);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        float float3 = calculator0.division(0, 1);
        int int6 = calculator0.subtract(100, (int) (short) 0);
        int int9 = calculator0.subtract((int) (short) 10, (int) ' ');
        float float12 = calculator0.division((int) (byte) 10, (int) 'a');
        int int15 = calculator0.multiply((-770), (-328));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-22) + "'", int9 == (-22));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 252560 + "'", int15 == 252560);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        CalculatorVersion01.src.main.java.org.example.code.Calculator calculator0 = new CalculatorVersion01.src.main.java.org.example.code.Calculator();
        calculator0.printCalc();
        int int4 = calculator0.subtract((int) '#', (int) (short) -1);
        int int7 = calculator0.multiply(70, (-770));
        calculator0.printCalc();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36 + "'", int4 == 36);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-53900) + "'", int7 == (-53900));
    }
}

