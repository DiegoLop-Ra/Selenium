package dropdown;

import Pages.DropDownPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        var DropDownPage = homePage.clickDropDown();
        String option = "Option 1";
        DropDownPage.selectFromDropDown( "Option 1");
        var selectedOptions = DropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option),"Option not selected");
    }
}
