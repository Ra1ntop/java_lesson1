package ua.com.alevel;
public class hello {
    public static void main(String[] args){
        Message m = new Message();

        byte b = Byte.MAX_VALUE;
        short s = Short.MAX_VALUE;
        int a = Integer.MAX_VALUE;
        long l = Long.MAX_VALUE;
        m.print(String.valueOf(b));
        m.print(String.valueOf(s));
        m.print(String.valueOf(a));
        m.print(String.valueOf(l));
    }
}