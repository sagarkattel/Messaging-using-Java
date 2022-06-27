import java.io.*;
import java.net.*;
public class MyClient{
    public static void main(String[] args){
        try{
            Socket sos=new Socket("localhost",6666);
            ObjectOutputStream out=new ObjectOutputStream(sos.getOutputStream());
            out.writeUTF("Welcome To Networking");
            out.flush();
            out.close();
            sos.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

        }
    }
