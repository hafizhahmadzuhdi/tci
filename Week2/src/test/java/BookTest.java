import org.junit.Test;
import static org.junit.Assert.*;
import Exception.*;

import java.util.ArrayList;
import java.util.List;


public class BookTest {

    //Should throw an exception while adding a new chapter
    @Test(expected = DuplicateException.class)
    public void shouldHaveAnExceptionDuplicateChapter() throws DuplicateException {
        String bookName = "Alice in Wonderland";
        String bookAuthor = "Alex Max";
        Book x = new Book(bookName, bookAuthor);
        String chapterName = "Alice got lost";
        String chapterNum = "1.1";
        String chapterName2 = "Alice eats";
        String chapterNum2 = "1.1";
        Chapter chapter = new Chapter(chapterName, chapterNum);
        Chapter chapter2 = new Chapter(chapterName2, chapterNum2);
        boolean y = x.addChapterToBook(chapter);
        boolean z = x.addChapterToBook(chapter2);
    }

    @Test
    public void shouldNotBeNull(){
        //Arrange
        Book x = new Book();
        //Act
        boolean check = x.violateBookRules();
        //Assert
        assertTrue(check);
    }

    @Test
    public void shouldAddChapterToBooks() throws DuplicateException{
        Chapter one = new Chapter("The way you think", "1.1");
        Book book = new Book("How to follow success person habbits", "Hafizh");
        boolean check = book.addChapterToBook(one);
        assertTrue(check);
    }

    //Naming convention still be a matter for me
    @Test
    public void shouldGetTableOfContentsOfUnsortedChapters() throws DuplicateException, BookException{
        //Arrannge
        String bookName = "Alice in Wonderland";
        String bookAuthor = "Alex Max";
        Book x = new Book(bookName, bookAuthor);
        String chapterName = "Alice got lost";
        String chapterNum = "1.1";
        String chapterName2 = "Alice in the jungle";
        String chapterNum2 = "1.3";
        String chapterName3 = "Alice's family";
        String chapterNum3 = "1.2";
        Chapter chapter = new Chapter(chapterName, chapterNum);
        Chapter chapter2 = new Chapter(chapterName2, chapterNum2);
        Chapter chapter3 = new Chapter(chapterName3, chapterNum3);
        //Act
        x.addChapterToBook(chapter);
        x.addChapterToBook(chapter2);
        x.addChapterToBook(chapter3);
        List<Chapter> myArrList = x.getTableOfContents();
        List<Chapter> expectedArrList = new ArrayList<>();
        expectedArrList.add(chapter);
        expectedArrList.add(chapter3);
        expectedArrList.add(chapter2);
        //Assert
        assertEquals(expectedArrList, myArrList);

    }
}
