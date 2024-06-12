package Model;

import java.util.*;

public class Signature extends Menu{

    private LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
    private String[][] menus;

    public Signature(String name, int price){
        super(name,price);
    }

    public void putMenu(){
       Map<String,Integer> signaturemenu = new LinkedHashMap<>();
       signaturemenu.put("SherekLatte",6800);
       signaturemenu.put("FionaLatte", 6800);

       map.putAll(signaturemenu);
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
