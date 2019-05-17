import java.util.Date;

public class Course {
    private String className;
    private Date beforeDate;
    private Date afterDate;

    public Course(String className, Date beforeDate, Date afterDate){
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
