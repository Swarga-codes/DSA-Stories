public class ValidateIPAddress {
    public static void main(String[] args) {
        String queryIP = "172.16.254.1";
        System.out.println(validIPAddress(queryIP));
    }
    public static String validIPAddress(String queryIP) {
        if(queryIP.endsWith(".") || queryIP.endsWith(":")) return "Neither";
        String[] ipv4=queryIP.split("\\.");
        if(ipv4.length==4){
           return validateIpv4(ipv4);
        }
        String[] ipv6=queryIP.split(":");
       
        if(ipv6.length==8){
            
            return validateIpv6(ipv6);
        }
        return "Neither";
    }
    public static String validateIpv4(String[] ipv4){
        try{
        for(int i=0;i<ipv4.length;i++){
            if(ipv4[i].length()>1 && ipv4[i].startsWith("0")) return "Neither";
           int x=Integer.parseInt(ipv4[i]);
           if(!(x>=0 && x<=255)) {
            return "Neither";
           }
        }
        }
        catch(Exception e){
            return "Neither";
        }
        return "IPv4";
    }
     public static String validateIpv6(String[] ipv6){
       for(int i=0;i<ipv6.length;i++){
        if(ipv6[i].length()>4 || ipv6[i].equals("")) return "Neither";
        for(int j=0;j<ipv6[i].length();j++){
            char curr=ipv6[i].charAt(j);
            if(!((curr >= '0' && curr <= '9') || (curr >= 'a' && curr <= 'f') || (curr >= 'A' && curr <= 'F'))){
                return "Neither";
            }
        }
       } 
       return "IPv6";
    }
}
