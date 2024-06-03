/*
카페 메뉴
Coffee, Non-Coffee(Ade,Tea,Latte),Signature, Cake
 */
package Model;

public abstract class Menu {
    private String name;
    private int price;

    public Menu(String name,int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){return name;}

    public int getPrice(){return price;}

    @Override
    public String toString(){
        return name + "" + price + "원";
    }

}
