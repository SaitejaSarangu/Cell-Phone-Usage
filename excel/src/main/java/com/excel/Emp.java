package com.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Emp {

	public static void man(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(
				new File("/Users/SaiSarangu/Desktop/java-developer-cell-phone-usage-master/CellPhone.csv"));
		List<String> values = new ArrayList<String>();

		sc.useDelimiter(","); // delimiter

		while (sc.hasNext()) {
			values.add(sc.next());
		}

		sc.close();

		Scanner scanner = new Scanner(
				new File("/Users/SaiSarangu/Desktop/java-developer-cell-phone-usage-master/CellPhoneUsageByMonth.csv"));
		List<String> values1 = new ArrayList<String>();

		sc.useDelimiter(","); // delimiter

		while (scanner.hasNext()) {
			values1.add(scanner.next());
		}

		sc.close();

		HashMap<String, List<String>> employees = new HashMap<String, List<String>>();
		employees.put("employeeId", Arrays.asList(values));
		employees.put("CellPhone", Arrays.asList(values1));

	}

}
