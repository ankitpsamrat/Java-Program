import java.net.InetAddress;

public class ip_address {
    public static void main(String args[]) throws Exception { // find ip address of any system
        InetAddress myIP = InetAddress.getLocalHost();
        System.out.print("My IP address is : ");
        System.out.println(myIP.getHostAddress());
    }
}
