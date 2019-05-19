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
    private Course course, course2, course3;
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");


    @Before
    public void setUp() throws ParseException, CourseDateException, SchoolNullException{
        school = new School("Fontys", formatter.parse("01-01-2005"));
        course = new Course("ANDROID1", formatter.parse("01-05-2019"), formatter.parse("02-07-2019"));
        course2 = new Course("ANDROID2", formatter.parse("01-01-2004"), formatter.parse("02-07-2019"));
        course3 = new Course("ANDROID1", formatter.parse("01-01-2019"), formatter.parse("02-07-2019"));

    }

    @Test
    public void constructorShouldGetNameOfSchool(){
        assertEquals("Fontys", school.getName());
    }

    @Test
    public void shouldAddCourseToTheSchool()  throws CourseException, DuplicateCourseException{
        school.addCourse(course);
        assertEquals(1, school.getCoursesSize());
    }

    @Test(expected = SchoolNullException.class)
    public void shouldThrowSchoolException() throws SchoolNullException{
        School school2 = new School(null, null);
    }

    @Test(expected = CourseException.class)
    public void shouldThrowCourseException() throws CourseException, DuplicateCourseException {
        school.addCourse(course2);
    }

    @Test(expected = DuplicateCourseException.class)
    public void shouldThrowDuplicateCourseException() throws CourseException, DuplicateCourseException {
        school.addCourse(course);
        school.addCourse(course3);
    }

    @Test
    public void shouldGetCourseBasedOnName() throws CourseException, DuplicateCourseException{
        school.addCourse(course);
        Course myCourse = school.getCourseOnName("ANDROID1");
        assertEquals(myCourse, course);
    }

}
