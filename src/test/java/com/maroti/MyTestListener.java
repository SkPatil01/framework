package com.maroti;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.maroti.util.MyExtentReport;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class MyTestListener implements ITestListener {

    private MyExtentReport report;
    private ExtentReports reports;
    private ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {
        report = new MyExtentReport();
        reports = report.generateReport();
        test = reports.createTest(result.getTestName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, result.getMethod().getMethodName());

    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.log(Status.PASS, result.getMethod().getMethodName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) {
    }

    @Override
    public void onFinish(ITestContext context) {
        reports.flush();
    }
}
