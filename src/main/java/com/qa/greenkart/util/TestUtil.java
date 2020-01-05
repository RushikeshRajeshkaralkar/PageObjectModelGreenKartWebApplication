package com.qa.greenkart.util;

import java.io.FileInputStream;
import java.util.ArrayList;

public class TestUtil {
	public static final long PAGE_LOAD_TIME_OUT=30000;
	public static final long IMPLICIT_WAIT=300000;
	
	
	
	public static Xls_Reader reader;

	public static ArrayList<Object[]> productNames() {

		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		try {
			String file = "A:\\JavaPrograms\\GREENKART.COM\\src\\main\\java\\com\\qa\\greenkart\\testdata\\Data.xlsx";
			FileInputStream fis = new FileInputStream(file);
			reader = new Xls_Reader(file);

		} catch (Exception e) {
			e.printStackTrace();

		}

		for (int i = 2; i < reader.getRowCount("product"); i++) {
			String name = reader.getCellData("product", "VEGETABLE", i);

			Object[] obj = { name };
			mydata.add(obj);

		}

		return mydata;

	}

}
