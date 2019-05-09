import java.util.Date;
import java.util.List;

public class School {

    private String name;
    private Date openingDate;
    private List<Course> courses;

    public School(String name, Date openingDate) {
        this.name = name;
        this.openingDate = openingDate;
        this.courses = null;
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
}
