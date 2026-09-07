package codewars.java.int32.to.ipv4;

public class Kata {
	public static String longToIP(long ip) {
		return String.format("%d.%d.%d.%d",
				(ip >> 24) & 0xFF,
				(ip >> 16) & 0xFF,
				(ip >>8) & 0xFF,
				ip & 0xFF);
	}
}
