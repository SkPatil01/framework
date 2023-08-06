package com.maroti.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class MyExtentReport {

    public static ExtentReports generateReport(){
        ExtentSparkReporter reporter = new ExtentSparkReporter(System.getProperty("user.dir")+"\\target\\extents\\guru.html");
        reporter.getConf().setReportName("Guru99 Application");
        ExtentReports reports = new ExtentReports();
        reports.attachReporter(reporter);
        return reports;

    }
}
