import java.util.Date;

public class Hello {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello!");
        int a = 5; //declaration
        int b;
        b = 8;
        int c = -22;
        int d = a * b + c;

        /*
        System.out.print("d=");
        System.out.println(d);
         */
        System.out.println("d=" + d);
        byte bb = 127;
        byte b3 = 3;
        byte b2 = (byte)(bb + b3);
        System.out.println(b2);

        float f1 = 56463565464f;
        double d1 = 56463565464d;
        System.out.println(f1);
        System.out.println(d1);

        boolean bo1 = true;
        System.out.println(bo1);
        char c1 = 'a';
        System.out.println(c1);

        String s3;
        s3 = "abc";
        String s4 = s3;
        s4 += "def";
        System.out.println(s3);
        System.out.println(s4);

        String s5 = null;
        System.out.println(s5.indexOf("a")); // is it contained in the string

        Date da1 = new Date();
        Date da2 = da1;
        System.out.println(da1);
        System.out.println(da2);
        System.out.println("Wait 2 secs");
        Thread.sleep(2000);
        da2.setTime(System.currentTimeMillis());
        System.out.println(da1);
        System.out.println(da2);


    }


}

