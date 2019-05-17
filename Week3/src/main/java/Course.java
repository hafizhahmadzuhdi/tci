public class Course {
    private String className;
    private String beforeDate;
    private String afterDate;

    public Course(String className, String beforeDate, String afterDate) {
        this.className = className;
        this.beforeDate = beforeDate;
        this.afterDate = afterDate;
    }

    public String getClassName() {
        return className;
    }

    public String getBeforeDate() {
        return beforeDate;
    }

    public String getAfterDate() {
        return afterDate;
    }
}
