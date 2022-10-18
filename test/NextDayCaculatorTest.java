import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class NextDayCaculatorTest {

    @Test
    public void nextDay() {
        Date toDay = new Date(2018, 1, 1);
        Date expected = new Date(2018, 1, 2);

        Date actual = NextDayCaculator.nextDay(toDay);
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void nextDay1() {
        Date toDay = new Date(2018, 0, 31);
        Date expected = new Date(2018, 1, 1);

        Date actual = NextDayCaculator.nextDay(toDay);
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void nextDay2() {
        Date toDay = new Date(2020, 2, 29);
        Date expected = new Date(2020, 3, 1);

        Date actual = NextDayCaculator.nextDay(toDay);
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void nextDay3() {
        Date toDay = new Date(2018, 12, 31);
        Date expected = new Date(2019, 1, 1);

        Date actual = NextDayCaculator.nextDay(toDay);
        assertEquals(expected.toString(), actual.toString());
    }
}