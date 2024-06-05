package View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import Controller.Calc;
import Controller.Login;
import Model.Coffee;
import Model.NonCoffee.Ade;
import Model.Menu;
import Model.NonCoffee.Latte;
import Model.NonCoffee.Tea;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Coffee coffee = new Coffee("Coffee",0);

        ArrayList<Menu> nonCoffeeMenus = new ArrayList<>();

        //각각의 NonCoffee 메뉴 객체 생성
        Ade ade = new Ade("Ade",0);
        Tea tea = new Tea("Tea",0);
        Latte latte = new Latte("Latte",0);

        //메뉴 초기화
        ade.putMenu();
        tea.putMenu();
        latte.putMenu();

        //리스트에 추가
        nonCoffeeMenus.add(ade);
        nonCoffeeMenus.add(tea);
        nonCoffeeMenus.add(latte);

        System.out.println("안녕하세요 예원하다입니다");
        Login login = new Login(); // 로그인 객체
        login.login();

        while(true) {
            System.out.print("\n기능 선택\n" +
                    "1.Coffee\n" +
                    "2.Non-Coffee\n" +
                    "3.Signature\n" +
                    "4.Cake\n" +
                    "5.Calc\n" +
                    "Choice => ");
            String num = sc.nextLine();
            switch (num) {
                case "1" -> {
                    coffee.putMenu();
                    String[][] menus = coffee.getMenus();
                    ArrayList<String> selectMenus = new ArrayList<>();
                    System.out.println("--Coffee Menu--");
                    for(int i=0; i<menus.length; i++){
                        System.out.println((i+1) + "." + menus[i][0] + " " + menus[i][1]);
                    }
                    System.out.println("0.선택 완료");
                    while(true){
                        System.out.print("Choice-->");
                        int choice = Integer.parseInt(sc.nextLine());

                        if (choice == 0) {
                            break; // 0을 입력하면 반복문을 종료하고 선택 완료
                        } else if (choice > 0 && choice <= menus.length) {
                            selectMenus.add(menus[choice - 1][0]); // 리스트에 선택된 메뉴 추가
                        } else {
                            System.out.println("잘못된 선택입니다. 다시 선택해주세요");
                        }
                    }
                    System.out.println("선택된 커피");
                    for(String menu : selectMenus){
                        System.out.println(menu);
                    }
                }
                case "2" -> {
                    System.out.println("--NonCoffee Menu--");
                    ArrayList<String> selectMenus = new ArrayList<>();

                    int menuIndex = 1;
                    for (Menu menu : nonCoffeeMenus) {
                        String[][] menus = menu.getMenus();
                        for (String[] menuItem : menus) {
                            System.out.println(menuIndex + "." + menuItem[0] + " " + menuItem[1]);
                            menuIndex++;
                        }
                    }
                    System.out.println("0. 선택 완료");

                    while (true) {
                        System.out.print("Choice-->");
                        int choice = Integer.parseInt(sc.nextLine());

                        if (choice == 0) {
                            break; // 0 입력 시 루프 종료
                        } else {
                            int currentIndex = 1;
                            boolean validChoice = false;
                            for (Menu menu : nonCoffeeMenus) {
                                String[][] menus = menu.getMenus();
                                for (String[] menuItem : menus) {
                                    if (currentIndex == choice) {
                                        selectMenus.add(menuItem[0]); // 선택한 메뉴를 리스트에 추가
                                        validChoice = true;
                                        break;
                                    }
                                    currentIndex++;
                                }
                                if (validChoice) {
                                    break;
                                }
                            }
                            if (!validChoice) {
                                System.out.println("잘못된 선택입니다. 다시 선택해주세");
                            }
                        }
                    }

                    System.out.println("선택된 커피");
                    for (String menu : selectMenus) {
                        System.out.println(menu);
                    }

                }
                case "Calc" -> {
                    Calc calc = new Calc();
                    calc.totalPrice();

                }

                case "logout" -> System.exit(0);
            }
        }
    }
}

