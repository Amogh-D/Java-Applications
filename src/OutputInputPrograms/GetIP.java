package OutputInputPrograms;

import java.net.InetAddress;

public class GetIP
{
    public static void main(String args[]) throws Exception
    {
        InetAddress address = InetAddress.getLocalHost();

        System.out.println("My IP Address is: ");
        System.out.println(address.getHostAddress());
    }
}