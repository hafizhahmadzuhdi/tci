import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Exception.*;

public class School{

    private String name;
    private Date openingDate;
    private List<Course> courses;


    public School(String name, Date openingDate) throws SchoolNullException{
        if(name == null || openingDate == null){
            throw new SchoolNullException();
        }
        this.name = name;
        this.openingDate = openingDate;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course a) throws CourseException{
        if(a.getBeforeDate().before(openingDate)){
            throw new CourseException();
        }
        courses.add(a);
    }

    public int getCoursesSize(){
        return this.courses.size();
    }
}
