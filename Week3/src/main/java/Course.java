import java.util.Date;
import Exception.*;

public class Course {
    private String className;
    private Date beforeDate;
    private Date afterDate;

    public Course(String className, Date beforeDate, Date afterDate) throws CourseDateException {

        if(afterDate.before(beforeDate)){
            throw new CourseDateException();
        }

        this.className = className;
        this.beforeDate = beforeDate;
        this.afterDate = afterDate;
    }

    public String getClassName() {
        return className;
    }

    public Date getBeforeDate() {
        return beforeDate;
    }

    public Date getAfterDate() {
        return afterDate;
    }

}
