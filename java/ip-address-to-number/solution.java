package codewars.java.ip.address.to.number;

public class IpTranslator {
    public static long ipToNum(String ip) {
        String[] ipList = ip.trim().split("\\.");
        StringBuilder binaryIp = new StringBuilder();
        for (String ipn : ipList) {
            binaryIp.append(String.format("%8s", Long.toBinaryString(Long.parseLong(ipn))).replace(' ', '0'));
        }
        return Long.parseLong(String.valueOf(binaryIp), 2);
    }
    
    public static String numToIp(long num) {
        return String.format("%d.%d.%d.%d",
                (num >> 24) & 0xFF,
                (num >> 16) & 0xFF,
                (num >> 8) & 0xFF,
                num & 0xFF
                );
    }
}
