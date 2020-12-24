package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyg(){
        var editorPage = homePage.clickWysiwygEditor();
        editorPage.clearTextArea();

        String text1 = "Hello World";


        editorPage.setTextArea(text1);



        assertEquals(editorPage.getTextFromEditor(), text1, "Text from editor is incorrect");
    }

}
