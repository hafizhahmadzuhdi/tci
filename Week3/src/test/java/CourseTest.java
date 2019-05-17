import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@RunWith(JUnitParamsRunner.class)
public class CourseTest {

/**
 * All Tests are made based on the document requirements
 */

    private static final Object[] getViolateCourses(){
            return new Object[]{
                    new Object[] {"ANDROID2", "03-05-2019", "02-05-2019"}
            };
    }

    @Test
    public void constructorShouldGetNameOfCourse(){
        Course course = new Course("ANDROID1", "02-02-2019", "02-05-209");
        assertEquals("ANDROID1", course.getClassName());
    }

    @Test(expected = CourseDateException.class)
    @Parameters(method = "getCourses")
    public void shouldThrowAnExceptionDate(String className, String beforeDate, String endDate){
        Course course = new Course(className, beforeDate, endDate);
    }
}
