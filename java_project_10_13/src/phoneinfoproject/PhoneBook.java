package phoneinfoproject;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PhoneBook {
    Scanner sc = new Scanner(System.in);
    private HashSet<GeneralPhoneInfo> set = new HashSet<GeneralPhoneInfo>();
    private Iterator<GeneralPhoneInfo> itr;

    public boolean insert(int insertChoice) {

        GeneralPhoneInfo pi = null;
        String name = null, phone = null, major =null, company = null;
        int year = 0;

        switch(insertChoice) {
            case Menu.GENERAL_INSERT_PHONE_INFO :
                System.out.println("이름을 입력해주세요.");
                name = sc.nextLine();
                System.out.println("전화번호를 입력해주세요.");
                phone = sc.nextLine();
                pi = new GeneralPhoneInfo(name, phone);
                System.out.println("입력이 완료되었습니다.");
                break;
            case Menu.UNIVERSITY_INSERT_PHONE_INFO :
                System.out.println("이름을 입력해주세요.");
                name = sc.nextLine();
                System.out.println("전화번호를 입력해주세요.");
                phone = sc.nextLine();
                System.out.println("전공을 입력해주세요.");
                major = sc.nextLine();
                System.out.println("학년을 입력해주세요.");
                year = sc.nextInt();
                pi = new UnivPhoneInfo(name, phone, major, year);
                System.out.println("입력이 완료되었습니다.");
                break;
            case Menu.COMPANY_INSERT_PHONE_INFO:
                System.out.println("이름을 입력해주세요.");
                name = sc.nextLine();
                System.out.println("전화번호를 입력해주세요.");
                phone = sc.nextLine();
                System.out.println("회사를 입력해주세요.");
                company = sc.nextLine();
                pi = new CompanyPhoneInfo(name, phone, company);
                System.out.println("입력이 완료되었습니다.");
                break;
        }
        return set.add(pi);
    }

    public boolean search(String name) {
        GeneralPhoneInfo pInfo = null;
        itr = set.iterator();
        boolean result = false;

        while(itr.hasNext()) {
            pInfo = itr.next();
            if(pInfo.getName().equals(name)) {
                pInfo.showPhoneInfo();
                result = true;
            }
        }
        return result;
    }

    public boolean delete(String phone) {
        GeneralPhoneInfo pInfo = null;
        itr = set.iterator();
        boolean result = false;

        while(itr.hasNext()) {
            pInfo = itr.next();
            if(pInfo.getPhone().equals(phone)) {
                itr.remove();
                result = true;
            }
        }
        return result;
    }

    public void showAllPhoneInfo() {
        itr = set.iterator();
        while(itr.hasNext()) {
            itr.next().showPhoneInfo();
        }
    }
}
