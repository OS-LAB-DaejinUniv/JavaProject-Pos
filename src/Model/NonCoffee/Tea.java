package Model.NonCoffee;

import Model.Menu;

import java.util.LinkedHashMap;
import java.util.Map;

public class Tea extends Menu {

    private LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
    private String[][] menus;

    public Tea(String name,int price){
        super(name, price);
    }

    @Override
    public void putMenu(){
        Map<String,Integer> teamenu = new LinkedHashMap<>();
        teamenu.put("BlackTeaIcedTea", 5000);
        teamenu.put("Peppermint", 5000);
        teamenu.put("Chamomile", 5000);
        teamenu.put("FlowerTea", 5000);

        map.putAll(teamenu);
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
