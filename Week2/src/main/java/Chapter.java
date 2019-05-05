import Exception.*;

public class Chapter implements Comparable<Chapter>{
    private String name;
    private String num;


    public Chapter() {
    }

    public Chapter(String name, String num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public boolean violateChapterRules(String ch) throws ChapterException {
        if(ch.length() <=3 ){
            return false;
        } else {
            throw new ChapterException();
        }
    }

    @Override
    public int compareTo(Chapter o) {
        Double act = Double.parseDouble(this.num);
        Double comp = Double.parseDouble(o.num);
        if(act == comp){
            return 0;
        } else if(act<comp){
            return -1;
        } else {
            return 1;
        }
    }
}
