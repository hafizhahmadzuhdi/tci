import org.junit.Test;
import static org.junit.Assert.*;
import Exception.*;

public class ChapterTest {

    @Test (expected = ChapterException.class)
    public void ShouldThrowChapterException() throws ChapterException {
        //Arange
        //Act
        //Asseert
        String chapterName = "Alice childhood";
        String chapterNum = "1.1.1";
        Chapter chapter = new Chapter(chapterName, chapterNum);
        boolean checkChap = chapter.violateChapterRules(chapterNum);
        //Return an exception
        assertTrue(checkChap);
    }

    @Test
    public void ShoulcCreateChapterNormally() throws ChapterException {
        //Arange
        //Act
        //Asseert
        String chapterName = "Alice childhood";
        String chapterNum = "1.1";
        Chapter chapter = new Chapter(chapterName, chapterNum);
        boolean checkChap = chapter.violateChapterRules(chapterNum);
        assertEquals(false, checkChap);
    }
}
