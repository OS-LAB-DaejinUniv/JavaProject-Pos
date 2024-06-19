package Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    public void showMenu(ArrayList<String[]> allMenusName) {
        if (allMenusName.isEmpty()) {
            System.out.println("장바구니가 비었습니다.");
            return;
        }

        // Create a map to count occurrences of each menu item
        Map<String, Integer> menuCount = new HashMap<>();
        for (String[] menu : allMenusName) {
            String menuName = menu[0];
            menuCount.put(menuName, menuCount.getOrDefault(menuName, 0) + 1);
        }

        // Display the counted menu items
        System.out.println("주문 내역:");
        for (Map.Entry<String, Integer> entry : menuCount.entrySet()) {
            System.out.println("- " + entry.getKey() + " " + entry.getValue());
        }
    }
}
