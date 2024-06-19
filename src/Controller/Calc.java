package Controller;

import java.util.ArrayList;

public class Calc {
    public double totalPrice(ArrayList<String[]> allSelectedMenus) {
        double total = 0;
        for (String[] menu : allSelectedMenus) {
            total += Double.parseDouble(menu[1]);
        }
        return total;
    }
}
