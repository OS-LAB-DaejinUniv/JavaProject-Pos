package Model;

import java.util.*;

public class Cake extends Menu{

    private LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
    private String[][] menus;

    public Cake(String name, int price){
        super(name,price);
    }

    public void putMenu(){
        Map<String,Integer> cake = new LinkedHashMap<>();
        cake.put("SweetPumpkinCake",9000);
        cake.put("OriginalCake",7500);
        cake.put("ChocoCake",8000);
        cake.put("StrawberryCake",9000);

        map.putAll(cake);
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
