package View;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.util.Set;

import Controller.Calc;
import Controller.Cart;
import Controller.Coupon;
import Controller.Login;
import Model.Coffee;
import Model.NonCoffee.Ade;
import Model.Menu;
import Model.NonCoffee.Latte;
import Model.NonCoffee.Tea;
import Model.Signature;
import Model.Cake;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 커피 메뉴 객체 생성
        Coffee coffee = new Coffee("Coffee", 0);

        // NonCoffee 메뉴 배열 생성
        ArrayList<Menu> nonCoffeeMenus = new ArrayList<>();

        // 각각의 NonCoffee 메뉴 객체 생성
        Ade ade = new Ade("Ade", 0);
        Tea tea = new Tea("Tea", 0);
        Latte latte = new Latte("Latte", 0);

        // 메뉴 초기화
        ade.putMenu();
        tea.putMenu();
        latte.putMenu();

        // 리스트에 추가
        nonCoffeeMenus.add(ade);
        nonCoffeeMenus.add(tea);
        nonCoffeeMenus.add(latte);

        Signature signature = new Signature("Signature", 0);

        Cake cake = new Cake("Cake", 0);

        System.out.println("안녕하세요 예원하다입니다");
        Login login = new Login(); // 로그인 객체
        login.login();

        ArrayList<String[]> allSelectedMenus = new ArrayList<>(); // 선택된 모든 메뉴 가격을 저장할 리스트
        ArrayList<String[]> allMenusName = new ArrayList<>(); // 선택된 모든 메뉴 이름을 저장할 리스트

        while (true) {
            System.out.print("\n기능 선택\n" +
                    "1.Coffee\n" +
                    "2.Non-Coffee\n" +
                    "3.Signature\n" +
                    "4.Cake\n" +
                    "5.Cart\n" +
                    "6.Calc\n" +
                    "7.Generate Coupon\n" +
                    "logout\n" +
                    "Choice => ");
            String num = sc.nextLine();
            switch (num) {
                case "1" -> {
                    System.out.println("--Coffee Menu--");
                    coffee.putMenu();
                    String[][] menus = coffee.getMenus();
                    ArrayList<String> selectMenus = new ArrayList<>();

                    for (int i = 0; i < menus.length; i++) {
                        System.out.println((i + 1) + "." + menus[i][0] + " " + menus[i][1]);
                    }
                    System.out.println("0.선택 완료");
                    System.out.print("Choice-->");
                    String input = sc.nextLine();

                    if (!input.equals("0")) {
                        String[] choices = input.split(","); // 쉼표로 구분해서 입력
                        for (String choice : choices) {
                            try {
                                int index = Integer.parseInt(choice.trim());
                                if (index > 0 && index <= menus.length) {
                                    selectMenus.add(menus[index - 1][0]); // 리스트에 선택된 메뉴 추가
                                    allSelectedMenus.add(menus[index - 1]); // 선택된 메뉴와 가격을 모두 저장
                                    allMenusName.add(menus[index - 1]); // 선택된 메뉴와 이름을 모두 저장
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("입력 방식이 잘못되었습니다.");
                            }
                        }
                    }
                    System.out.println("선택된 메뉴");
                    for (String menu : selectMenus) {
                        System.out.println(menu);
                    }
                }
                case "2" -> {
                    System.out.println("--NonCoffee Menu--");
                    ArrayList<String> selectMenus = new ArrayList<>();

                    int menuIndex = 1;
                    ArrayList<String[]> allMenus = new ArrayList<>();

                    for (Menu menu : nonCoffeeMenus) {
                        String[][] menus = menu.getMenus();
                        for (String[] menuItem : menus) {
                            System.out.println(menuIndex + "." + menuItem[0] + " " + menuItem[1]);
                            menuIndex++;
                            allMenus.add(menuItem); // 모든 메뉴 항목을 리스트에 추가
                        }
                    }
                    System.out.println("0. 선택 완료");
                    System.out.print("Choice-->");
                    String input = sc.nextLine();

                    if (!input.equals("0")) {
                        String[] choices = input.split(",");
                        for (String choice : choices) {
                            try {
                                int index = Integer.parseInt(choice.trim());
                                if (index > 0 && index <= allMenus.size()) {
                                    selectMenus.add(allMenus.get(index - 1)[0]); // 리스트에 선택된 메뉴 추가
                                    allSelectedMenus.add(allMenus.get(index - 1)); // 선택된 메뉴와 가격을 모두 저장
                                    allMenusName.add(allMenus.get(index - 1)); // 선택된 메뉴와 이름을 모두 저장
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("입력 방식이 잘못되었습니다.");
                            }
                        }
                    }
                    System.out.println("선택된 메뉴");
                    for (String menu : selectMenus) {
                        System.out.println(menu);
                    }

                }

                case "3" -> {
                    System.out.println("--Signature--");
                    signature.putMenu();
                    String[][] menus = signature.getMenus();
                    ArrayList<String> selectMenus = new ArrayList<>();

                    for (int i = 0; i < menus.length; i++) {
                        System.out.println((i + 1) + "." + menus[i][0] + " " + menus[i][1]);
                    }
                    System.out.println("0.나가기");
                    System.out.print("Choice-->");
                    String input = sc.nextLine();

                    if (!input.equals("0")) {
                        String[] choices = input.split(",");
                        for (String choice : choices) {
                            try {
                                int index = Integer.parseInt(choice.trim());
                                if (index > 0 && index <= menus.length) {
                                    selectMenus.add(menus[index - 1][0]);
                                    allSelectedMenus.add(menus[index - 1]); // 선택된 메뉴와 가격을 모두 저장
                                    allMenusName.add(menus[index - 1]); // 선택된 메뉴와 이름을 모두 저장
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("입력 방식이 잘못되었습니다.");
                            }
                        }
                    }
                    System.out.println("선택된 메뉴");
                    for (String menu : selectMenus) {
                        System.out.println(menu);
                    }
                }
                case "4" -> {
                    System.out.println("--Cake--");
                    cake.putMenu();
                    String[][] menus = cake.getMenus();
                    ArrayList<String> selectMenus = new ArrayList<>();

                    for (int i = 0; i < menus.length; i++) {
                        System.out.println((i + 1) + "." + menus[i][0] + " " + menus[i][1]);
                    }
                    System.out.println("0.나가기");
                    System.out.print("Choice-->");
                    String input = sc.nextLine();

                    if (!input.equals("0")) {
                        String[] choices = input.split(",");
                        for (String choice : choices) {
                            try {
                                int index = Integer.parseInt(choice.trim());
                                if (index > 0 && index <= menus.length) {
                                    selectMenus.add(menus[index - 1][0]);
                                    allSelectedMenus.add(menus[index - 1]);
                                    allMenusName.add(menus[index - 1]); // 선택된 메뉴와 이름을 모두 저장
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("입력 방식이 잘 못 되었습니다.");
                            }
                        }
                    }
                    System.out.println("선택된 메뉴");
                    for (String menu : selectMenus) {
                        System.out.println(menu);
                    }
                }
                case "5" -> {
                    Cart cart = new Cart();
                    cart.showMenu(allMenusName);
                    System.out.print("계산하시겠어요? (Yes/No): ");
                    String confirm = sc.nextLine();
                    if (confirm.equalsIgnoreCase("Yes")) {
                        Calc calc = new Calc();
                        double totalPrice = calc.totalPrice(allSelectedMenus);

                        System.out.print("쿠폰을 사용하시겠습니까? (Yes/No): ");
                        String useCoupon = sc.nextLine();
                        if (useCoupon.equalsIgnoreCase("Yes")) {
                            System.out.print("쿠폰 번호를 입력하세요: ");
                            String coupon = sc.nextLine();
                            try {
                                Set<String> coupons = Coupon.loadCoupons();
                                if (coupons.contains(coupon)) {
                                    totalPrice = (int) (totalPrice * 0.9); // 10% 할인
                                    Coupon.deleteCoupon(coupon);
                                    System.out.println("쿠폰이 적용되었습니다.");
                                } else {
                                    System.out.println("유효하지 않은 쿠폰 번호입니다.");
                                }
                            } catch (IOException e) {
                                System.out.println("쿠폰 파일을 읽는 중 오류가 발생했습니다.");
                            }
                        }

                        System.out.println("총 금액: " + totalPrice + "원");
                        allSelectedMenus.clear();
                        allMenusName.clear();
                    }
                }
                case "6" -> {
                    Calc calc = new Calc();
                    calc.totalPrice(allSelectedMenus);
                }
                case "7" -> {
                    String coupon = Coupon.generateCoupon();
                    try {
                        Coupon.saveCoupon(coupon);
                        System.out.println("생성된 쿠폰 번호: " + coupon);
                    } catch (IOException e) {
                        System.out.println("쿠폰 번호를 저장하는 중 오류가 발생했습니다.");
                    }
                }
                case "logout" -> System.exit(0);
            }
        }
    }
}
