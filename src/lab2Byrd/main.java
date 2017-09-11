package lab2Byrd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("C:\\Users\\slstr\\eclipse-workspace\\Project1\\src\\parts.txt"));
		int lineNum = in.nextInt();
		bikePart[] bp = new bikePart[lineNum];
		in.nextLine();
		for (int i = 0; i < lineNum; i++) {
			String line = in.nextLine();
			// System.out.println(line);
			String[] elements = line.split(",");
			bp[i] = new bikePart(elements[0], Integer.parseInt(elements[1]), Double.parseDouble(elements[2]),
					Double.parseDouble(elements[3]), Boolean.parseBoolean(elements[4]));
			double temp = Double.parseDouble(elements[3]);
			if ((temp < 20 && bp[i].isOnSale() == true) || (bp[i].getListPrice() < 20 && bp[i].isOnSale() == false)) {
				System.out.println(line);
			}
			/*
			 * for (String splitter : elements) { System.out.println(splitter); }
			 */}

	}

}
