/*
선택된 메뉴들 총합 계산 로직
 */
package Controller;

import Model.Menu;

public class Calc {
    private Menu[][] menus;// Menu 객체 참조 배열
    private String name;
    private int price;
    private int total;
    private int size, cnt; // 배열 크기, 배열에 들어가 있는 메뉴 개수

    public Calc(){
        menus = new Menu[size][size];
        cnt = 0;
    }

    public void showName(){
        for(int i=0; i<cnt; i++){
            System.out.println(menus[i][0]);
        }
    }

    //선택된 메뉴들의 가격을 한 번 더 보여주는 메소드
    public void showPrice(){
        for(int i=0; i<cnt; i++){
            for(int j=0; j<cnt; j++){

            }
            System.out.println(menus[i]);
        }
    }

    //선택된 메뉴들의 값을 추출하고 총합을 계산하는 메소드
    public void totalPrice(){
        System.out.println("합계:" );
    }
}
