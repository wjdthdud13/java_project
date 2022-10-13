package phoneinfoproject;

import java.util.Scanner;

public class PhoneInfoUI {
    Scanner sc = new Scanner(System.in);
    PhoneBook pb = new PhoneBook();
    int insertChoice=0;
    String name = null, phone = null;


    public void intro(){
        System.out.println("선택하세요...");
        System.out.println("1. 데이터 입력");
        System.out.println("2. 데이터 검색");
        System.out.println("3. 데이터 삭제");
        System.out.println("4. 모든 데이터 보기");
        System.out.println("5. 프로그램 종료");
        System.out.print("선택 :");
    }

    public void insert(){
        System.out.println("데이터 입력을 시작합니다.");
        System.out.println("1. 일반 2. 대학 3. 회사");
        System.out.println("선택 >>");
        insertChoice = sc.nextInt();
        sc.nextLine();

        if(pb.insert(insertChoice)) {
            System.out.println("입력이 완료되었습니다.");
        } else {
            System.out.println("이미 입력된 데이터 입니다.");
        }
    }

    public void search() {
        System.out.println("데이터 검색을 시작합니다.");
        System.out.println("검색하실 이름을 입력하세요.");
        name = sc.nextLine();

        if(pb.search(name)) {
            System.out.println("검색이 완료되었습니다.");
        } else {
            System.out.println("검색 결과가 없습니다.");
        }
    }

    public void delete() {
        System.out.println("데이터 삭제를 시작합니다.");
        System.out.println("삭제하실 전화번호를 입력해주세요.");
        phone = sc.nextLine();

        if(pb.delete(phone)) {
            System.out.println("삭제가 완료되었습니다.");
        } else {
            System.out.println("삭제할 데이터가 존재하지 않습니다.");
        }
    }

    public void showAllPhoneInfo() {
        System.out.println("모든 데이터를 출력합니다.");
        pb.showAllPhoneInfo();
    }

    public void quitProgram() {
        System.out.println("프로그램을 종료합니다.");
    }
}
