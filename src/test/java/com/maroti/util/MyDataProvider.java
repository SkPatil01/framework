package com.maroti.util;

import com.maroti.model.Register;
import com.maroti.util.ExcelDataReader;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.List;

public class MyDataProvider {

    @DataProvider
    public static Object[][] data() throws IOException {
        List<Register> reg = ExcelDataReader.getData("data.xlsx", 0);

        return new Object[][]{
                new Object[]{
                        reg.get(0)
                }
        };
    }
}
