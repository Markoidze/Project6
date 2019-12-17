import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Project6 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\manuchar.markoidze.PCSST\\Desktop\\MySelenium\\Chrom driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");


                WebElement firstname = driver.findElement(By.name("firstname"));
                firstname.sendKeys("Mark");
                WebElement lastName = driver.findElement(By.name("lastname"));
                lastName.sendKeys("Markoidze");
                List<WebElement> gender = driver.findElements(By.name("sex"));
                WebElement Gender = gender.get(0);
                Gender.click();
                List<WebElement> experience = driver.findElements(By.name("exp"));
                experience.get(0).click();
                WebElement datepicker = driver.findElement(By.id("datepicker"));
                datepicker.sendKeys("7/20/1983");
                List<WebElement> profession = driver.findElements(By.name("profession"));
                WebElement Pro = profession.get(0);
                Pro.click();
                List<WebElement> tool = driver.findElements(By.name("tool"));
                WebElement To = tool.get(2);
                To.click();
                WebElement continent = driver.findElement(By.name("continents"));
                Select dropdown = new Select(continent);
                dropdown.selectByIndex(5);

                Select select = new Select(driver.findElement(By.id("selenium_commands")));
                List<WebElement> select31Options = select.getOptions();
                for (WebElement option : select31Options) {
                    select.selectByVisibleText(option.getText());
                }
            }

        }
