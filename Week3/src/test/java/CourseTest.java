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

/**
 * All Tests are made based on the document requirements
 */

    public void constructorShouldGetNameOfCourse(){
        Course course = new Course("ANDROID1", "02-02-2019", "02-05-209");
        assertEquals("ANDROID1", course.getClassName());
    }

}
