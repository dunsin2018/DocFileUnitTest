import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FileExtensionAnalyzerTest{
    @Test
    public void isValidFileName(){
        FileExtensionAnalyzer extensionAnalyzer = new FileExtensionAnalyzer();

        //ARRANGE
        String fileName = "Dunsin.DOC";
        Boolean actual ;

        //ACT
        actual = extensionAnalyzer.IsValidFileName(fileName);

        //ASSERT
        assertEquals(false, actual);

    }

    @Test
    public void isNotValidFileName(){
        FileExtensionAnalyzer extensionAnalyzer = new FileExtensionAnalyzer();

        //ARRANGE
        String fileName = "Dunsin.ppt";
        Boolean actual ;

        //ACT
        actual = extensionAnalyzer.IsValidFileName(fileName);

        //ASSERT
        assertEquals(true, actual);

    }
}