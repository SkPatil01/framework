package com.maroti.page;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.maroti.model.Register;
import com.maroti.util.MyDataProvider;
import com.maroti.util.MyExtentReport;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class RegisterPageTest {

    private RegisterPage page;
    @BeforeTest
    public void setUp() {
        this.page = new RegisterPage();
    }

    @Test(dataProvider = "data", dataProviderClass = MyDataProvider.class)
    public void testRegister(Register register) {
        page.register(register);
        ExtentReports reports =MyExtentReport.generateReport();
        ExtentTest test =reports.createTest("guru99");
        test.log(Status.PASS, "Register");
        reports.flush();
    }
}