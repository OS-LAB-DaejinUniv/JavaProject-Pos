package Controller;

import java.util.Scanner;

public class Login {
    private String ID;
    private String Password;
    private boolean isAdmin;

    public Login() {
        isAdmin = false; // 기본적으로는 관리자가 아님
    }

    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("로그인을 하세요");
        while (true) {
            System.out.print("아이디를 입력하세요 : ");
            ID = sc.next();
            System.out.print("비밀번호를 입력하세요 : ");
            Password = sc.next();
            if (ID.equals("admin") && Password.equals("1234")) {
                System.out.println("Login Success");
                isAdmin = true; // 관리자로 설정
                break;
            } else {
                System.out.println("Login Fail");
            }
        }
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
