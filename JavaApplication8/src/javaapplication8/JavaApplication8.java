/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

//import statements

import com.sun.rowset.internal.Row;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javafx.scene.control.Cell;

public class NewClass
{
    public static void main(String[] args)
    {
        //Blank workbook
       XSSFSheet sheet = workbook.createSheet("Employee Data");

         
          
        //This data needs to be written (Object[])
        Map<String, Object[]> data = new TreeMap<>();
        data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
        data.put("2", new Object[] {1, "Amit", "Shukla"});
        data.put("3", new Object[] {2, "Lokesh", "Gupta"});
        data.put("4", new Object[] {3, "John", "Adwards"});
        data.put("5", new Object[] {4, "Brian", "Schultz"});
          
        //Iterate over data and write to sheet
        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset)
        {
            Row row = sheet.createRow(rownum++);
            Object [] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr)
            {
               
            }
        }
        try
        {
            try ( //Write the workbook in file system
                    FileOutputStream out = new FileOutputStream(new File("java.xlsx"))) {
                workbook.write(out);
            }
            System.out.println("java.");
        }
        catch (IOException e)
        {
        }
    }
}
/**
 *
 * @author Pieter
 */


