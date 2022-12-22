package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
public class Main {
    SoftAssert softasserProcess = new SoftAssert();
    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeTest
    public void Login_Page() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PSI\\Documents\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://dev.psi-crm.com/account/login");
        //User name
        driver.findElement(By.xpath("//*[@id=\"identityRef\"]")).sendKeys("");
        //PassWord
        driver.findElement(By.xpath("//*[@id=\"passwordRef\"]")).sendKeys("");
        //Submit
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/form/div[4]/div/button")).click();
        Thread.sleep(2000);
        driver.manage().window().maximize();
    }

//    @Test(groups = "fill in mandatory only")
//    public void fill_in_mandatory_only()throws InterruptedException {
//        String LeadName = "Salah Amjad";
//        String LeadOprations = "Buyer";
//        String LeadID = "ID : 1057523";
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        driver.get("https://dev.psi-crm.com/home/lead-sales/add?formType=2");
//        Thread.sleep(4000);
//          //Main Information
//        driver.findElement(By.xpath("//*[@id=\"propertyunit_type\"]")).sendKeys("Apartment" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("United Arab Emirates" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Dubai" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"bathrooms\"]")).sendKeys("3" + Keys.ARROW_DOWN + Keys.ENTER);
//        driver.findElement(By.xpath("//*[@id=\"bedrooms\"]")).sendKeys("4" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"contact_name\"]")).sendKeys("Sa");
//        Thread.sleep(4000);
//        Actions keyDown = new Actions(driver);
//        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
//        driver.findElement(By.xpath("//*[@id=\"operation_type\"]")).sendKeys("Buy");
//        Thread.sleep(3000);
//        Actions keyDownoperation_type = new Actions(driver);
//        keyDownoperation_type.sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER)).perform();
//        //Next
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div/div/div[5]/div/div[2]/button")).click();
//        Thread.sleep(3000);
//          //Listing Details
//        driver.findElement(By.xpath("//*[@id=\"status\"]")).sendKeys("Open" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"method_of-contact\"]")).sendKeys("Call Center" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"lead_stage\"]")).sendKeys("Contacted" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("//*[@id=\"media_detail\"]")).sendKeys("Newspaper" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"referredby\"]")).sendKeys("zu3bi");
//        Thread.sleep(3000);
//        Actions keyDownreferredby = new Actions(driver);
//        keyDownreferredby.sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER)).perform();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div/div/div[5]/div/div[2]/button[2]")).click();
//        driver.get("https://dev.psi-crm.com/home/lead-sales/view");
//        WebElement id = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div/div[1]/a/div[1]/div[2]/div/div[1]/div/span[1]"));
//        WebElement leadname = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div/div[1]/a/div[1]/div[2]/div/span[1]"));
//        WebElement leadopration =  driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div/div[1]/a/div[1]/div[2]/div/div[1]/span"));
//        String ActualName = leadname.getText();
//        String Expectedname = LeadName;
//
//        String Actualid = id.getText();
//        String Expectedid = LeadID;
//
//        String ActualLO = leadopration.getText();
//        String ExpectedLO = LeadOprations;
//
//        System.out.println("Lead Name = "+ActualName);
//        System.out.println("Lead id = " + Actualid);
//        System.out.println("Lead Oprations = " + ActualLO);
//        softasserProcess.assertEquals(Expectedid, Actualid);
//        softasserProcess.assertEquals(Expectedname, ActualName);
//        softasserProcess.assertEquals(ExpectedLO, ActualLO);
//
//        softasserProcess.assertAll();
//
//    }


//    @Test(groups = "fill all mandatory only")
//    public void fill_all_mandatory_only()throws InterruptedException {
//        String LeadName = "Salah Amjad";
//        String LeadOprations = "Buyer";
//        String LeadID = "ID : 1057523";
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        driver.get("https://dev.psi-crm.com/home/lead-sales/add?formType=2");
//        Thread.sleep(4000);
//
//        //Main Information
//        driver.findElement(By.xpath("//*[@id=\"propertyunit_type\"]")).sendKeys("Apartment" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"is_mortgage\"]")).sendKeys("Yes" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("United Arab Emirates" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Dubai" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"district\"]")).sendKeys("Dubai Marina" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"community\"]")).sendKeys("Dubai Marina" + Keys.ARROW_DOWN + Keys.ENTER);
//        driver.findElement(By.xpath("//*[@id=\"sub_community\"]")).sendKeys("Jumeirah Beach Residence" + Keys.ARROW_DOWN + Keys.ENTER);
//        driver.findElement(By.xpath("//*[@id=\"property_name\"]")).sendKeys("V3 TOWER" + Keys.ARROW_DOWN + Keys.ENTER);
//        driver.findElement(By.xpath("//*[@id=\"unit_ref-number\"]")).sendKeys("");
//        Thread.sleep(2000);
//        Actions keyDownunit_ref = new Actions(driver);
//        keyDownunit_ref.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
//        driver.findElement(By.xpath("//*[@id=\"developer\"]")).sendKeys("saf");
//        Thread.sleep(3000);
//        Actions keyDowndeveloper = new Actions(driver);
//        keyDowndeveloper.sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER)).perform();
//        driver.findElement(By.xpath("//*[@id=\"view\"]")).sendKeys("Garden View" + Keys.ARROW_DOWN + Keys.ENTER);
//        driver.findElement(By.xpath("//*[@id=\"bathrooms\"]")).sendKeys("3" + Keys.ARROW_DOWN + Keys.ENTER);
//        driver.findElement(By.xpath("//*[@id=\"bedrooms\"]")).sendKeys("4" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"contact_name\"]")).sendKeys("Sa");
//        Thread.sleep(4000);
//        Actions keyDown = new Actions(driver);
//        keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
//        driver.findElement(By.xpath("//*[@id=\"operation_type\"]")).sendKeys("Buy");
//        Thread.sleep(3000);
//        Actions keyDownoperation_type = new Actions(driver);
//        keyDownoperation_type.sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER)).perform();
//        //Next
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div/div/div[5]/div/div[2]/button")).click();
//        Thread.sleep(3000);
//
//        //Listing Details
//        driver.findElement(By.xpath("//*[@id=\"rating\"]")).sendKeys("Cold" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"need_advice\"]")).sendKeys("Yes" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"is_shared\"]")).sendKeys("No" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"is_urgent\"]")).sendKeys("No" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"referredto\"]")).sendKeys("zu3bi");
//        Thread.sleep(3000);
//        Actions keyDownreferredto = new Actions(driver);
//        keyDownreferredto.sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER)).perform();
//        driver.findElement(By.xpath("//*[@id=\"status\"]")).sendKeys("Open" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"method_of-contact\"]")).sendKeys("Call Center" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"lead_stage\"]")).sendKeys("Contacted" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("//*[@id=\"media_detail\"]")).sendKeys("Newspaper" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"referredby\"]")).sendKeys("zu3bi");
//        Thread.sleep(3000);
//        Actions keyDownreferredby = new Actions(driver);
//        keyDownreferredby.sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER)).perform();
//        Thread.sleep(3000);
//        //Next
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div/div/div[5]/div/div[2]/button[2]")).click();
//        Thread.sleep(3000);
//        //Mortgage Details
//        driver.findElement(By.xpath("//*[@id=\"mortgage_type\"]")).sendKeys("Mortgage" + Keys.ARROW_DOWN + Keys.ENTER);
//        driver.findElement(By.xpath("//*[@id=\"mortgage_bank\"]")).sendKeys("Emirates Bank International" + Keys.ARROW_DOWN + Keys.ENTER);
//        driver.findElement(By.xpath("//*[@id=\"mortgage_segment\"]")).sendKeys("Conventical Finance" + Keys.ARROW_DOWN + Keys.ENTER);
//        driver.findElement(By.xpath("//*[@id=\"customer_profile\"]")).sendKeys("Salaried" + Keys.ARROW_DOWN + Keys.ENTER);
//        driver.findElement(By.xpath("//*[@id=\"confirmed_employee\"]")).sendKeys("No" + Keys.ARROW_DOWN + Keys.ENTER);
//        driver.findElement(By.xpath("//*[@id=\"allowance\"]")).sendKeys("test");
//        driver.findElement(By.xpath("//*[@id=\"liability_from-company\"]")).sendKeys("No" + Keys.ARROW_DOWN + Keys.ENTER);
//        driver.findElement(By.xpath("//*[@id=\"monthly_income\"]")).sendKeys("10000");
//        //Next
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div/div/div[5]/div/div[2]/button[2]")).click();
//        Thread.sleep(3000);
//
//       //Financial Status Details
//        driver.findElement(By.xpath("//*[@id=\"has_auto-loan\"]")).sendKeys("Yes" + Keys.ARROW_DOWN + Keys.ENTER);
//        driver.findElement(By.xpath("//*[@id=\"auto_loan-outstanding-balance\"]")).sendKeys("10000");
//        driver.findElement(By.xpath("//*[@id=\"auto_loan-monthly-installment\"]")).sendKeys("10000");
//
//        driver.findElement(By.xpath("//*[@id=\"has_personal-loan\"]")).sendKeys("Yes" + Keys.ARROW_DOWN + Keys.ENTER);
//        driver.findElement(By.xpath("//*[@id=\"personal_loan-outstanding-balance\"]")).sendKeys("10000");
//        driver.findElement(By.xpath("//*[@id=\"personal_loan-monthly-installment\"]")).sendKeys("10000");
//
//        driver.findElement(By.xpath("//*[@id=\"has_home-loan\"]")).sendKeys("Yes" + Keys.ARROW_DOWN + Keys.ENTER);
//        driver.findElement(By.xpath("//*[@id=\"home_loan-outstanding-balance\"]")).sendKeys("10000");
//        driver.findElement(By.xpath("//*[@id=\"home_loan-monthly-installment\"]")).sendKeys("10000");
//
//        driver.findElement(By.xpath("//*[@id=\"has_credit-card\"]")).sendKeys("Yes" + Keys.ARROW_DOWN + Keys.ENTER);
//        driver.findElement(By.xpath("//*[@id=\"credit_card-outstanding-balance\"]")).sendKeys("10000");
//        driver.findElement(By.xpath("//*[@id=\"credit_card-monthly-installment\"]")).sendKeys("1");
//
//        driver.findElement(By.xpath("//*[@id=\"has_other-liabilities\"]")).sendKeys("Yes" + Keys.ARROW_DOWN + Keys.ENTER);
//        driver.findElement(By.xpath("//*[@id=\"other_liabilities-outstanding-balance\"]")).sendKeys("Test");
//        driver.findElement(By.xpath("//*[@id=\"other_liabilities-monthly-installment\"]")).sendKeys("10000");
//
//        WebElement Liability_Amount =  driver.findElement(By.xpath("//*[@id=\"liability_amount\"]"));
//
//        System.out.println("Liability Amount= "+Liability_Amount);
//        Thread.sleep(3000);
//        //Finish
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div/div/div[5]/div/div[2]/button[2]")).click();
//
//       //Lead Sale Page
//        driver.get("https://dev.psi-crm.com/home/lead-sales/view");
//
//
//        WebElement id = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div/div[1]/a/div[1]/div[2]/div/div[1]/div/span[1]"));
//        WebElement leadname = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div/div[1]/a/div[1]/div[2]/div/span[1]"));
//        WebElement leadopration =  driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div/div[1]/a/div[1]/div[2]/div/div[1]/span"));
//        String ActualName = leadname.getText();
//        String Expectedname = LeadName;
//
//        String Actualid = id.getText();
//        String Expectedid = LeadID;
//
//        String ActualLO = leadopration.getText();
//        String ExpectedLO = LeadOprations;
//
//        System.out.println("Lead Name = "+ActualName);
//        System.out.println("Lead id = " + Actualid);
//        System.out.println("Lead Oprations = " + ActualLO);
//        softasserProcess.assertEquals(Expectedid, Actualid);
//        softasserProcess.assertEquals(Expectedname, ActualName);
//        softasserProcess.assertEquals(ExpectedLO, ActualLO);
//
//        softasserProcess.assertAll();
//
//    }


//    @Test(groups = "Update")
//    public void update()throws InterruptedException {
//
//        driver.get("https://dev.psi-crm.com/home/lead-sales/lead-profile-edit?formType=2&id=1057627");
//        Thread.sleep(3000);
//        //Main Info
//        driver.findElement(By.xpath("//*[@id=\"propertyunit_type\"]")).sendKeys("Villa" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[3]/div[1]/div[2]/div/button[2]")).click();
//
//        Thread.sleep(2000);
//
//
//        driver.findElement(By.xpath("//*[@id=\"referredto\"]")).click();
//        Actions keyClean = new Actions(driver);
//        keyClean.sendKeys(Keys.chord(Keys.BACK_SPACE)).perform();
//
//
////        driver.findElement(By.xpath("//*[@id=\"referredby\"]")).click();
////        Thread.sleep(2000);
////        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[3]/div[2]/div[9]/div/div/div/div/div/div/div/div/button[1]")).click();
////        Thread.sleep(2000);
////        driver.findElement(By.xpath("//*[@id=\"referredto\"]")).click();
////        Thread.sleep(2000);
////        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[3]/div[2]/div[10]/div/div/div/div/div/div/div/div/button[1]")).click();
////        Thread.sleep(2000);
////
////
//        driver.findElement(By.xpath("//*[@id=\"referredto\"]")).sendKeys("zaid");
//        Thread.sleep(3000);
//        Actions keyDownreferredto = new Actions(driver);
//        keyDownreferredto.sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER)).perform();
//        driver.findElement(By.xpath("//*[@id=\"referredby\"]")).sendKeys("zaid");
//        Thread.sleep(3000);
//        Actions keyDownreferredby = new Actions(driver);
//        keyDownreferredby.sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER)).perform();
//        Thread.sleep(2000);
//
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div/div/button[2]")).click();
//        Thread.sleep(2000);
//
//
//
//    }
//    @Test(groups = "Create Activity Lead File")
//    public void update()throws InterruptedException {
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//
//        driver.get("https://dev.psi-crm.com/home/lead-sales/lead-profile-edit?formType=2&id=1057627");
//        Thread.sleep(3000);
//
//        //Activity Tab
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div/button[2]")).click();
//        Thread.sleep(4000);
//        //Add Buttons
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/button")).click();
//        Thread.sleep(2000);
//        //Activity Type
//        driver.findElement(By.xpath("//*[@id=\"activityTypeIdRef\"]")).sendKeys("Lead Reassign - CRM" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(3000);
//        //Assign Agent + Navi to Lead & unit base on type
//        driver.findElement(By.xpath("//*[@id=\"assignAgentIdRef\"]")).sendKeys("zaidd" + Keys.ARROW_DOWN + Keys.ENTER+Keys.TAB+Keys.ARROW_DOWN+Keys.ARROW_DOWN+ Keys.ENTER +Keys.TAB+Keys.ARROW_DOWN+Keys.ARROW_DOWN+ Keys.ENTER);
//        Thread.sleep(2000);
////        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/form/div[2]/div/div[3]/fieldset/div")).click();
////        Thread.sleep(4000);
////        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/form/div[2]/div/div[3]/fieldset/div/div/div/div/div/div/div/div/button[2]")).click();
////        Thread.sleep(2000);
////
////
////        WebElement aaa =   driver.findElement(By.xpath("//*[@id=\"RelatedToRef\"]"));
////
////
////        String multiSelect = Keys.chord(Keys.ARROW_DOWN, Keys.ENTER);
////
////        aaa.sendKeys(multiSelect);
//
//
//
//        //Save
//        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/form/div[3]/button[2]")).click();
//
//
//
//
//
//        }


//    @Test(groups = "Close Lead From Lead File")
//    public void Close_Lead_File()throws InterruptedException {
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//      //  driver.get("https://dev.psi-crm.com/home/lead-sales/lead-profile-edit?formType=2&id=1057627");
//
//
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[3]/div[1]/div[2]/div/button[2]")).click();
//     driver.findElement(By.xpath("//*[@id=\"status\"]")).click();
//        Thread.sleep(2000);
//     driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[3]/div[2]/div[3]/div/div/div/div/div/div/div/div/button[1]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"status\"]")).sendKeys("Close" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"closing_remarks\"]")).sendKeys("Test Close");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"close_reason\"]")).sendKeys("Client Close Lead" + Keys.ARROW_DOWN + Keys.ENTER);
//        Thread.sleep(2000);
//
//
//
//
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div/div/button[2]")).click();
//
//
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3) );
//        WebElement msg =  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]"));
//
//        System.out.println(wait.until((ExpectedConditions.textToBePresentInElement(msg, "Lead Updated"))));
//
//        System.out.println( "Toast Msg = " +msg.getText());
//
//        SoftAssert myAssert = new SoftAssert();
//
//        myAssert.assertAll();
//
//
//
//
//    }


//        @Test(groups = "Close Lead From Activity File")
//    public void Close_Lead_File()throws InterruptedException {
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        driver.get("https://dev.psi-crm.com/home/lead-sales/lead-profile-edit?formType=2&id=1057635");
//        Thread.sleep(3000);
//        //Activity Tab
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div/button[2]")).click();
//            Thread.sleep(4000);
////            //Add Buttons
////        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/button")).click();
////        Thread.sleep(4000);
////        //Activity Type
////        driver.findElement(By.xpath("//*[@id=\"activityTypeIdRef\"]")).sendKeys("Close the Lead" + Keys.ARROW_DOWN + Keys.ENTER);
////        Thread.sleep(3000);
////        //Assign Agent + Navi to Lead & unit base on type
////        driver.findElement(By.xpath("//*[@id=\"assignAgentIdRef\"]")).sendKeys("zu3bi" + Keys.ARROW_DOWN + Keys.ENTER+Keys.TAB+Keys.ARROW_DOWN+Keys.ARROW_DOWN+ Keys.ENTER );
////        Thread.sleep(2000);
////
////        driver.findElement(By.xpath("//*[@id=\"isOpenStatusRef\"]/span[1]")).click();
////            Thread.sleep(2000);
////            //Save
////        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/form/div[3]/button[2]")).click();
////            Thread.sleep(2000);
//            //Lead info
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div/button[1]")).click();
//        //Listing Details
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[3]/div[1]/div[2]/div/button[2]")).click();
//            Thread.sleep(2000);
//        String ExpectedcloseReason = "Lead Close by Activity \"Close the Lead\"";
//        WebElement closeReason = driver.findElement(By.xpath("//*[@id=\"close_reason\"]"));
//            String ActualName = closeReason.getAttribute("value");
//            String Expectedname = ExpectedcloseReason;
//
//
//
//        System.out.println("close Reason = "+ ActualName);
//        softasserProcess.assertEquals(Expectedname, ActualName);
//
//
//        softasserProcess.assertAll();
//
//}

//    @Test(groups = "Close Actions")
//    public void Close_Actions()throws InterruptedException {
//        driver.get("https://dev.psi-crm.com/home/lead-sales/view");
//        Thread.sleep(2000);
//        //Open Actions
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div[1]/div[1]/div/div[2]/div/div/div")).click();
//        //Close Leads
//        driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[3]")).click();
//        //Select Open Leads
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div/div[1]/div")).click();
//        driver.findElement(By.xpath("// *[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div/div[2]/div")).click();
//        //Close Button
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div[1]/div[1]/div/div[1]/button")).click();
//        Thread.sleep(2000);
//        //Close Reason
//        driver.findElement(By.xpath("//*[@id=\"closeReason\"]")).sendKeys("Negative"+Keys.ARROW_DOWN +  Keys.ENTER);
//        Thread.sleep(2000);
//        //Save
//        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[3]/div/div/div/div/div[2]/button")).click();
//        Thread.sleep(2000);
//
//    }

    //    @Test(groups = "Close Right Menu")
//    public void Close_Right_Menu()throws InterruptedException {
//        driver.get("https://dev.psi-crm.com/home/lead-sales/view");
//        Thread.sleep(2000);
//        //Lead Status
//        driver.findElement(By.xpath("//*[@id=\"Lead_Status\"]")).click();
//        //Select Status
//        driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div/div[1]/a")).click();
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div[2]/div[2]/div[2]/button")).click();
//        Thread.sleep(2000);
//        //Close Reason
//        driver.findElement(By.xpath("//*[@id=\"closeReasonRef\"]")).sendKeys("Negative"+Keys.ARROW_DOWN +  Keys.ENTER);
//        Thread.sleep(2000);
//        //Save
//        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/form/div[2]/div/div/div[2]/div[2]/button[2]")).click();
//        Thread.sleep(2000);
//
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3) );
//        WebElement msg =  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]"));
//
//        System.out.println(wait.until((ExpectedConditions.textToBePresentInElement(msg, "Closed"))));
//
//        System.out.println( "Toast Msg = " +msg.getText());
//
//        SoftAssert myAssert = new SoftAssert();
//
//        myAssert.assertAll();
//
//
//    }
//@Test(groups = "Close Inside Contact")
//public void Close_Inside_Contact()throws InterruptedException {
//    driver.get("https://dev.psi-crm.com/home/Contacts-CRM/view");
//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//
//    Thread.sleep(3000);
//    driver.get("https://dev.psi-crm.com/home/Contacts-CRM/contact-profile-edit?formType=1&id=981719");
//    Thread.sleep(3000);
//    //Lead Tab
//    driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div/button[3]")).click();
//    Thread.sleep(2000);
//    //Status
//    driver.findElement(By.xpath("//*[@id=\"filterByRef\"]")).click();
//    Thread.sleep(2000);
//    //Open
//    driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]")).click();
//    Thread.sleep(2000);
//    //Row Select
//    driver.findElement(By.xpath("//*[@id=\"bodyRowRef0\"]")).click();
//    Thread.sleep(3000);
//    //Edit
//    driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[2]/div[3]/div/div[2]/button[2]")).click();
//    //Next
//    driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div/div/div[5]/div/div[2]/button")).click();
//    //Clear And Change Status to Close
//    driver.findElement(By.xpath("//*[@id=\"status\"]")).click();
//    Actions keyClean = new Actions(driver);
//    keyClean.sendKeys(Keys.chord(Keys.BACK_SPACE)).perform();
//    Thread.sleep(3000);
//    driver.findElement(By.xpath("//*[@id=\"status\"]")).sendKeys("Close" + Keys.ARROW_DOWN + Keys.ENTER);
//    Thread.sleep(3000);
//    //Remark Close
//    driver.findElement(By.xpath("//*[@id=\"closing_remarks\"]")).sendKeys("Test Close");
//    Thread.sleep(2000);
//    //Save
//    driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div/div/div[5]/div/div[2]/button[2]")).click();
//
//
//}
    @Test(groups = "Close In Transaction")
    public void Close_In_Transaction()throws InterruptedException {
        driver.get("https://dev.psi-crm.com/home/sales-transactions/view");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//
//        Thread.sleep(3000);
//        driver.get("");
//        Thread.sleep(3000);
//        //Lead Tab
//        driver.findElement(By.xpath("")).click();


    }

}
