package com.maroti.util;

import com.maroti.model.Register;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelDataReader {
    public static List<Register> getData(String fileName, int index) throws IOException {
        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\" + fileName; // find root directory using user.dir
        File file = new File(path);
        FileInputStream stream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(stream);
        List<Register> list = new ArrayList<>();
        XSSFSheet sheet = workbook.getSheetAt(index);
        int rowLength = sheet.getLastRowNum();
            Register reg = new Register();
            XSSFRow row = sheet.getRow(0);
            reg.setFirstName(row.getCell(0).toString());
            reg.setLastName(row.getCell(1).toString());
            reg.setPhone(row.getCell(2).toString());
            reg.setEmail(row.getCell(3).toString());
            reg.setAddress(row.getCell(4).toString());
            reg.setCity(row.getCell(5).toString());
            reg.setState(row.getCell(6).toString());
            reg.setCountry(row.getCell(7).toString());
            reg.setUsername(row.getCell(8).toString());
            reg.setPassword(row.getCell(9).toString());
            reg.setCnfPassword(row.getCell(10).toString());
            list.add(reg);
        return list;
    }

}
