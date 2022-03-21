package TestTasks;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

/*User should be asked to enter any date.
1 method checks if input date is earlier to present date.
1 method checks if input date is after to present date.
1 method converts given date into "yyyy-MM-dd HH:mm:ssZ" pattern.*/
class Checks {
	DateTimeFormatter obj= DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");
	LocalDateTime today=LocalDateTime.now();
	public void earlierOrNot(String userDate) {
		LocalDateTime myDate = LocalDateTime.parse(userDate, obj);
		if (myDate.isBefore(today)) {
			System.out.println(userDate + " is in the past.");
		}
	}
	public void AfterOrNot(String userDate) {
		LocalDateTime myDate = LocalDateTime.parse(userDate, obj);
		if (myDate.isAfter(today)) {
			System.out.println(userDate + " is in the future.");
		}
	}
	public void converter(String userDate) {
		DateTimeFormatter obj1= DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ssZ");
		LocalDateTime myDate = LocalDateTime.parse(userDate, obj1);
		System.out.println(obj.toString());
	}
}

