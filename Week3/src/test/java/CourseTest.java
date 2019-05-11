import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import Exception.*;


import org.junit.runner.RunWith;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@RunWith(JUnitParamsRunner.class)
public class CourseTest {

    private Course course;
    private Course course2;
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    @Before
    public void setUp() throws Exception{
        course = new Course("Android", formatter.parse("01-01-2019"), formatter.parse("02-01-2019"));
    }

    @Test
    public void shouldCreateCourse(){
        assertEquals("Android", course.getName());
    }

    @Test(expected = CourseDateException.class)
    public void shouldThrowExceptionWhileAddingTheLowerEndaDateThanTheStartDate() throws ParseException, CourseDateException {
        course2 = new Course("Testing", formatter.parse("02-01-2019"), formatter.parse("01-01-2019"));
    }


}
