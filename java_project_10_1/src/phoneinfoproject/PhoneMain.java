package phoneinfoproject;

public class PhoneMain {
    public static void main(String[] args) {
        PhoneBookManager pbm = new PhoneBookManager();
        int menu = 0;

        while (true) {
            pbm.intro();
            menu = pbm.sc.nextInt();
            pbm.sc.nextLine();

            switch (menu) {
                case 1:
                    pbm.input();
                    break;
                case 2:
                    pbm.search();
                    break;
                case 3:
                    pbm.delete();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력 하셨습니다.");
                    return;
            }
        }
    }
}