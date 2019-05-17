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
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");


    @Before
    public void setUp() throws ParseException{
        school = new School("Fontys", formatter.parse("01-01-2005"));
    }

}
