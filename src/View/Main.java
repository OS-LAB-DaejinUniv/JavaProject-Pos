package View;

import java.util.Scanner;
import Controller.Login;
import Model.Coffee;

public class Main{
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        Login login = new Login(); // 로그인 객체
        login.login(); // 로그인 로직 실행

        while(true) {
            System.out.print("\n기능 선택\n" +
                    "1.Coffee\n" +
                    "2.Non-Coffee\n" +
                    "3.Signature\n" +
                    "4.Cake\n" +
                    "Choice => ");
            String num = sc.nextLine();
            switch (num) {
                case "1" -> System.out.print("coffee menu");// Coffee 메뉴 주르륵
                case "logout" -> System.exit(0);

            }
        }
    }
}

