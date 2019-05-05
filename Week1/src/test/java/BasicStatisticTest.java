import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicStatisticTest {

    /*
    This assignment need to based on the TDD lifecycle
    1. Specify requirement of test
    2. Implement the code
    3. Enhance the code
     */


    @Test
    public void shouldGetZeroOfArrayListSize(){
        BasicStatistic bs = new BasicStatistic();
        int x = bs.numberOfDataItems();
        assertEquals(0, x);
    }

    @Test
    public void shouldAddValueToArrayList(){
        double one = 1.5;
        BasicStatistic bs = new BasicStatistic();
        bs.addDoubletoData(one);
        assertEquals(1, bs.numberOfDataItems());
    }

    @Test
    public void shouldClearAllValues(){
        BasicStatistic bs = new BasicStatistic();
        double one = 2.3;
        bs.addDoubletoData(one);
        double two = 4.8;
        bs.addDoubletoData(two);
        bs.clearData();
        assertEquals(0, bs.numberOfDataItems());
    }

    @Test
    public void shouldTotalAllOfValues(){
        BasicStatistic bs = new BasicStatistic();
        for(double i=1; i<6; i++){
            bs.addDoubletoData(i);
        }
        double result = bs.sum();
        //Need to put delta when comparing the double value
        assertEquals(15.0, result, 0);
    }

    // I'm following one of the naming convention from Roy Osherove
    // [UnitOfWork_StateUnderTest_ExpectedBehavior

    @Test
    public void Mean_SimpleValues_Calculated(){
        BasicStatistic bs = new BasicStatistic();
        double a = 19.2;
        double b = 13.1;
        double c = 10.2;
        bs.addDoubletoData(a);
        bs.addDoubletoData(b);
        bs.addDoubletoData(c);
        double res = bs.mean();
        assertEquals(14.17, res, 0);
    }

    @Test
    public void Median_EvenNumbersUnsorted_Calculated(){
        BasicStatistic bs = new BasicStatistic();
        double a, b, c;
        a = 2.3;
        b = 4.8;
        c = 3.2;
        bs.addDoubletoData(a);
        bs.addDoubletoData(b);
        bs.addDoubletoData(c);
        double res = bs.median();
        assertEquals(3.2, res, 0);
    }

    @Test
    public void Median_OddNumbersUnsorted_Calculated(){
        BasicStatistic bs = new BasicStatistic();
        double a, b, c, d;
        a = 2.3;
        b = 4.8;
        c = 8.6;
        d = 7.1;
        bs.addDoubletoData(a);
        bs.addDoubletoData(b);
        bs.addDoubletoData(c);
        bs.addDoubletoData(d);
        double res = bs.median();
        assertEquals(5.95, res, 0);
    }

    @Test
    public void Median_EvenNumbersSorted_Calculated(){
        BasicStatistic bs = new BasicStatistic();
        double a, b, c;
        a = 2.3;
        b = 3.5;
        c = 4.8;
        bs.addDoubletoData(a);
        bs.addDoubletoData(b);
        bs.addDoubletoData(c);
        double res = bs.median();
        assertEquals(3.5, res, 0);
    }

    @Test
    public void Median_OddNumbersSorted_Calculated(){
        BasicStatistic bs = new BasicStatistic();
        double a, b, c, d;
        a = 2.3;
        b = 4.9;
        d = 8.6;
        c = 7.1;
        bs.addDoubletoData(a);
        bs.addDoubletoData(b);
        bs.addDoubletoData(c);
        bs.addDoubletoData(d);
        double res = bs.median();
        assertEquals(6, res, 0);
    }

    @Test
    public void Median_NegativeNumber_Calculated(){
        BasicStatistic bs = new BasicStatistic();
        double a, b, c, d;
        a = -2.3;
        b = 4.9;
        c = -8.6;
        d = 7.1;
        bs.addDoubletoData(a);
        bs.addDoubletoData(b);
        bs.addDoubletoData(c);
        bs.addDoubletoData(d);
        double res = bs.median();
        assertEquals(1.3, res, 0);
    }

    @Test
    public void Max_SimpleValuesSorted_Calculated(){
        BasicStatistic bs = new BasicStatistic();
        double a = 14.2;
        double b = 11.2;
        double c = 13.1;
        bs.addDoubletoData(a);
        bs.addDoubletoData(b);
        bs.addDoubletoData(c);
        double res = bs.max();
        assertEquals(14.2, res, 0);
    }

    @Test
    public void Max_NegativeValuesSorted_Calculated(){
        BasicStatistic bs = new BasicStatistic();
        double a = -14.2;
        double b = -11.2;
        double c = -13.1;
        bs.addDoubletoData(a);
        bs.addDoubletoData(b);
        bs.addDoubletoData(c);
        double res = bs.max();
        assertEquals(-11.2, res, 0);
    }


}
