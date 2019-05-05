import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Exception.*;

public class Book {

    private String name;
    private String author;
    List<Chapter> chapter = new ArrayList<Chapter>();

    public Book(){

    }


    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Chapter> getChapter() {
        return chapter;
    }

    public void setChapter(List<Chapter> chapter) {
        this.chapter = chapter;
    }

    public boolean addChapterToBook(Chapter x) throws DuplicateException {
        for(Chapter bs : chapter){
            if(bs.getNum() == x.getNum()){
                throw new DuplicateException();
            }
        }
        chapter.add(x);
        return true;
    }

    public boolean violateBookRules(){
        if(this.author == null || this.name == null){
            return true;
        } else {
            return false;
        }
    }

    public List<Chapter> getTableOfContents() throws BookException{
        if(this.chapter.size() == 0){
            throw new BookException();
        }
        Collections.sort(this.chapter);
        //it will sort the chapter, methods can be found in the chapter class
        return chapter;
    }
}
