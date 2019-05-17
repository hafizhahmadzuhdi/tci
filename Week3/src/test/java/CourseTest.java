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
    public void setUp() throws ParseException{
        course = new Course("ANDROID1", formatter.parse("02-02-2019"), formatter.parse("02-05-209"));
    }

    @Test
    public void constructorShouldGetNameOfCourse(){
        assertEquals("ANDROID1", course.getClassName());
    }

    @Test(expected = CourseDateException.class)
    public void shouldThrowAnExceptionDate() throws ParseException{
        courseException = new Course("ANDROID1", formatter.parse("02-02-2019"), formatter.parse("02-05-209"));
    }
}
