/*
선택된 메뉴들 총합 계산 로직
 */
package Controller;

import java.util.ArrayList;

public class Calc {

    //선택된 메뉴들의 값을 추출하고 총합을 계산하는 메소드
    public void totalPrice(ArrayList<String[]> selectedMenus){
        int total = 0;

        for(String[] menu : selectedMenus){
            int price = Integer.parseInt(menu[1]);
            total += price;
        }
        System.out.println("합계:" + total + "원");
    }
}
