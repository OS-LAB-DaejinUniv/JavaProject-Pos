package View;

import Controller.Coupon;
import java.io.IOException;
import java.util.Scanner;

import static Controller.Coupon.generateCoupon;

public class Admin {
    public void adminMenu(){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("======================================");
            System.out.println("\t          관리자 모드");
            System.out.println("======================================");
            System.out.println("a. 쿠폰 생성");
            System.out.println("b. 로그아웃");

            System.out.print("Choice => ");
            String choice = sc.nextLine();

            switch (choice) {
                case "a":
                    generateCoupon();
                    break;
                case "b":
                    return; // Exit admin menu
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }

    private void generateCoupon(){
        String coupon = Coupon.generateCoupon();
        try{
            Coupon.saveCoupon(coupon);
            System.out.println("생성된 쿠폰 번호 : " + coupon);
        }
        catch(IOException e){
            System.out.println("쿠폰 번호를 저장하는 중 오류가 발생했습니다.");
        }
    }
}
