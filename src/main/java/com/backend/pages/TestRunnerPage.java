import com.backend.utils.ElementUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

public class TestRunnerPage {

    private WebDriver driver;
    private ElementUtils elementUtils;

    public TestRunnerPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver); // Initialize ElementUtils
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "vehicleLookupButton")
    private WebElement vehicleLookupButton;

    @FindBy(id = "someDropdown")
    private WebElement someDropdown;

    @FindBy(id = "alertButton")
    private WebElement alertButton;

    @FindBy(id = "headerName")
    private WebElement headerName;





}