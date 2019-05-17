import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import Exception.*;

@RunWith(JUnitParamsRunner.class)
public class CourseTest {

/**
 * All Tests are made based on the document requirements
 */

    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    private Course course;
    private Course courseException;

    @Before
    public void setUp() throws ParseException, CourseDateException {
        course = new Course("ANDROID1", formatter.parse("02-05-2019"), formatter.parse("02-07-2019"));
    }

    @Test
    public void constructorShouldGetNameOfCourse(){
        assertEquals("ANDROID1", course.getClassName());
    }

    @Test(expected = CourseDateException.class)
    public void shouldThrowAnExceptionDate() throws ParseException, CourseDateException {
        courseException = new Course("Testing", formatter.parse("02-06-2019"), formatter.parse("02-05-209"));
    }
}
