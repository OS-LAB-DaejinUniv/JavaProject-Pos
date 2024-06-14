package Controller;

import java.util.ArrayList;

public class Cart {

    //선택된 메뉴들의 이름을 추출하고 보여주는 메소드
    public void showMenu(ArrayList<String[]> showMenus){
        StringBuilder menuName = new StringBuilder();

        for(String[] menu : showMenus){
            menuName.append(menu[0]).append(",");
        }
        if(!menuName.isEmpty()){
            menuName.setLength(menuName.length()-2);
        }
        System.out.println("주문 내역 :" + menuName.toString());
    }
}
