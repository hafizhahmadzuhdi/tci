import java.util.Date;
import Exception.*;

public class Course {

    private String name;
    private Date startDate;
    private Date endDate;

    public Course(String name, Date startDate, Date endDate) throws EnddateEarlierException {
        if(endDate.before(startDate)){
            throw new EnddateEarlierException();
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
