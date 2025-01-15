import java.util.Scanner;

public class Taking_Input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // String input
        String s = input.nextLine();
        System.out.println(s);
        String ss = input.nextLine();
        System.out.println(ss);

        // integer input
        int num = input.nextInt();
        short nums = input.nextShort();
        long numl =input.nextLong();
        byte numb = input.nextByte();
        System.out.println(num+"-"+nums+"-"+numl+"-"+numb);

        // Decimal input
        float fnum = input.nextFloat();
        double dnum = input.nextDouble();
        System.out.println(fnum+"-=-"+dnum);

        //  Boolean input
        boolean bool = input.nextBoolean();
        System.out.println(bool);

        // Reading a string after an integer
        int numa = input.nextInt();
        input.nextLine();
        String sa = input.nextLine();
        System.out.println(numa+"-=-"+sa);

        //Reading character
        String sas = "Hello to the world";
        char cas = sas.charAt(0);
        System.out.println(cas);



    }
}
