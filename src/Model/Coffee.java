package Model;

import java.util.*;

public class Coffee extends Menu{

    private LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
    private String[][] menus;

    public Coffee(String name,int price){
        super(name,price);
    }

    public void putMenu(){

        Map<String,Integer> coffeemenu = new LinkedHashMap<>();
        coffeemenu.put("Americano",4500);
        coffeemenu.put("CafeLatte",5000);
        coffeemenu.put("CreamCafeLatte",6500);
        coffeemenu.put("CubeLatte",6000);

        map.putAll(coffeemenu);
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

    public Map<String,Integer> getMap(){
        return map;
    }
}
