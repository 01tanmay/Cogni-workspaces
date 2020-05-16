package prc03;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class demo {

	public static void main(String[] args) {
		String dateString = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

		System.out.println(dateString);
		LocalDate date = LocalDate.parse("2017-01-08");
	}

}
