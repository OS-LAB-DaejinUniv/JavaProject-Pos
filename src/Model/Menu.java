/*
카페 메뉴
Coffee, Non-Coffee(Ade,Tea,Latte),Signature, Cake
 */
package Model;

import java.util.ArrayList;

public abstract class Menu implements AllMenu {
    private String name;
    private int price;

    public Menu(String name,int price){
        this.name = name;
        this.price = price;
    }
    @Override
    public String[][] getMenus(){

        return new String[0][1];
    }

    @Override
    public void putMenu(){

    }

}
