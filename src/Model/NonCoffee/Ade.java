package Model.NonCoffee;

import Model.Menu;

import java.util.*;

public class Ade extends Menu {

    private LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
    private String[][] menus;

    public Ade(String name,int price){
        super(name, price);
    }

    @Override
    public void putMenu(){
        Map<String,Integer> ademenu = new LinkedHashMap<>();
        ademenu.put("GrapeFruit", 6500);
        ademenu.put("PassionFruit", 6500);
        ademenu.put("AppleCinnamon", 6500);

        map.putAll(ademenu);
    }

    public String[][] getMenus(){
        String[][] menus = new String[map.size()][2];
        int index = 0;
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            menus[index][0] = entry.getKey();
            menus[index][1] = String.valueOf(entry.getValue());
            index++;
        }
        return menus;
    }

    public Map<String ,Integer> getMap(){
        return map;
    }
}
