import java.util.Date;
import Exception.*;

public class Course {

    private String name;
    private Date startDate;
    private Date endDate;

    public Course(String name, Date startDate, Date endDate) throws CourseDateException {
        if(endDate.before(startDate)){
            throw new CourseDateException();
        }

        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;

    }

    public String getName() {
        return name;
    }


    public Date getStartDate() {
        return startDate;
    }


    public Date getEndDate() {
        return endDate;
    }




}
