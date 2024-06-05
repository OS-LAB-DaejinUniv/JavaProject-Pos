package Controller;
import java.util.Scanner;

public class Login {

    public Login(){

    }

    public void login(){
        String ID;
        String Password;

        Scanner sc = new Scanner(System.in);
        System.out.println("로그인을 하세요");
        while(true){
            System.out.print("아이디를 입력하세요 : ");
            ID = sc.next();
            System.out.print("비밀번호를 입력하세요 : ");
            Password = sc.next();
            if(ID.equals("admin") && Password.equals("1234")){
                System.out.println("Login Success");
                break;
            }
            else{
                System.out.println("Login Fail");
            }
        }
    }
}
