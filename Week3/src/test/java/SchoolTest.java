import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import Exception.*;


import org.junit.runner.RunWith;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@RunWith(JUnitParamsRunner.class)
public class SchoolTest {

    private School school;
    private Course course;
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");


    @Before
    public void setUp() throws ParseException, CourseDateException{
        school = new School("Fontys", formatter.parse("01-01-2005"));
        course = new Course("ANDROID1", formatter.parse("02-05-2019"), formatter.parse("02-07-2019"));
    }

    @Test
    public void constructorShouldGetNameOfSchool(){
        assertEquals("Fontys", school.getName());
    }

    @Test
    public void shouldAddCourseToTheSchool(){
        school.addCourse(course);
        assertEquals(1, school.getCoursesSize());
    }

}
