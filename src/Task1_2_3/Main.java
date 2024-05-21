import Task1.MyClassTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        MyClassTask myClassTask1 = new MyClassTask();
        String encode = myClassTask1.encode(input);
       String decode = myClassTask1.decode(input);
        getResult(encode, decode);
        String sss = myClassTask1.characterCode(input);
        System.out.println(sss);


    }

    private static void getResult(String encode, String decode) {
        System.out.println("Зашифровка");
        System.out.println(encode);
        System.out.println("Расшифровка ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(decode);
    }


}