package study.db.sample.v2;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertDateUtill {

	// Timestamp -> LocalDateTime 변환
	public static LocalDateTime convertTimestampToLocalDateTime(Timestamp ts) {
		return ts.toLocalDateTime();
	}

	// LocalDateTime -> Timestamp변환
	public static Timestamp convertLocalDateTimeToTimestamp(LocalDateTime ldt) {
		return Timestamp.valueOf(ldt);
	}

	// Strimg -> LocalDateTime
	public static LocalDateTime convertStringToLocalDateTime(String str) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate.parse(str, dtf);
		LocalDateTime.parse(str, dtf);
		LocalDate ld = LocalDate.parse(str, dtf);

		return ld.atStartOfDay();
	}

	// Strimg -> LocalDateTime
	public static LocalDateTime convertStringToLocalDateTime2(String str) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//		LocalDate.parse(str, dtf);
//		LocalDateTime.parse(str, dtf);
		LocalDate ld = LocalDate.parse(str, dtf);

		return ld.atStartOfDay();
	}

	// Strimg -> LocalDateTime
	public static LocalDateTime convertStringToLocalDateTime3(String str) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
//	LocalDate.parse(str, dtf);
//	LocalDateTime.parse(str, dtf);
		LocalDate ld = LocalDate.parse(str, dtf);

		return ld.atStartOfDay();
	}

	// Strimg -> LocalDateTime
	public static String convertLocalDateTimeToString (LocalDateTime ldt) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		return ldt.format(dtf);
	}
	
	public static String convertLocalDateTimeToString2 (LocalDateTime ldt) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		return ldt.format(dtf);
	}
	
	public static String convertLocalDateTimeToString3(LocalDateTime ldt) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return ldt.format(dtf);
	}

}
