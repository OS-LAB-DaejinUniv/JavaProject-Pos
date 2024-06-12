package Model;

public interface AllMenu {
    String getName(); // 메뉴 이름 return

    int getPrice(); // 메뉴 가격 return

    void putMenu(); // 메뉴 입력 메소드

    String[][] getMenus(); // 메뉴 이름, 가격 2차원 배열 형태로 가져옴
}
