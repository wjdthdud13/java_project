package phoneinfoproject;

public class MenuChoiceException extends Exception {
    public MenuChoiceException(int menu) {
        super(menu +"에 해당하는 메뉴가 없습니다."
                +"메뉴 선택을 처음부터 다시 시작합니다.");
    }
}