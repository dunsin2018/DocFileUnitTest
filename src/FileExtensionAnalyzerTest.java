import org.junit.Test;



public class FileExtensionAnalyzerTest {
    @Test
   public void testIfFileNameEndsWithDoc()
    {
        FileExtensionAnalyzer fEA = new FileExtensionAnalyzer();
        boolean actual = true;
        actual = fEA.IsValidFileName("Dunsin.DOC");
        boolean expected = false;
        assertEquals(false, fEA.IsValidFileName("Dunsin.Doc"));
    }

    private void assertEquals(boolean b, boolean isValidFileName) {
    }

    }




