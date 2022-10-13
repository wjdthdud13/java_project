package phoneinfoproject;

import java.util.Scanner;

class PhoneBookManager {
    Scanner sc = new Scanner(System.in);
    int year=0, num =0;
    int cnt=0;
    String name, phoneNumber, major, company = null;
    int size=100;
    PhoneInfo[] array = new PhoneInfo[size];


    public void intro()
    {
        System.out.println();
        System.out.println("선택하세요...");
        System.out.println("1. 데이터 입력");
        System.out.println("2. 데이터 검색");
        System.out.println("3. 데이터 삭제");
        System.out.println("4. 프로그램 종료");
    }

    public void input()
    {
        System.out.println("데이터 입력을 시작합니다.");
        System.out.println("1. 일반, 2. 대학, 3. 회사");
        System.out.print("선택>>");
        num = sc.nextInt();
        sc.nextLine();

        switch(num)
        {
            case 1 :
                System.out.println("이름 :");
                name = sc.nextLine();
                System.out.println("전화번호 :");
                phoneNumber = sc.nextLine();
                array[cnt++] = new PhoneInfo(name, phoneNumber);
                System.out.println("데이터 입력이 완료되었습니다.");
                break;

            case 2 :
                System.out.println("이름 :");
                name = sc.nextLine();
                System.out.println("전화번호 :");
                phoneNumber = sc.nextLine();
                System.out.println("전공 :");
                major = sc.nextLine();
                System.out.println("학년 :");
                year = sc.nextInt();
                sc.nextLine();
                array[cnt++] = new PhoneUnivInfo(name, phoneNumber, major, year);
                System.out.println("데이터 입력이 완료되었습니다.");
                break;

            case 3 :
                System.out.println("이름 :");
                name = sc.nextLine();
                System.out.println("전화번호 :");
                phoneNumber = sc.nextLine();
                System.out.println("회사 :");
                company = sc.nextLine();
                array[cnt++] = new PhoneCompanyInfo(name, phoneNumber, company);
                System.out.println("데이터 입력이 완료되었습니다.");
                break;

            default :
                System.out.println("잘못 입력하셨습니다.");
                return;
        }
    }

    public void search()
    {
        System.out.println("데이터 검색을 시작합니다.");
        System.out.print("이름 : ");
        name = sc.nextLine();
        for(int i=0;i<cnt;i++)
        {
            if(array[i].getName().equals(name))
            {
                array[i].showPhoneInfo();
                System.out.println("데이터 검색이 완료되었습니다.");
                return;
            }
        }
        System.out.println("데이터가 존재하지 않습니다.");
    }

    public void delete()
    {
        System.out.println("데이터 삭제를 시작합니다.");
        System.out.print("이름 : ");
        name = sc.nextLine();

        control1 :
        do{
            for(int i=0;i<cnt;i++)
            {
                if((array[i].getName()).equals(name))
                {
                    for(int j=i; j<cnt-1;j++)
                    {
                        array[j]=array[j+1];
                    }
                    array[cnt-1] = null;
                    cnt--;
                    System.out.println("데이터 삭제가 완료되었습니다.");
                    break control1;
                }
            }
            for(int i=0;i<cnt;i++)
                if(!(array[i].getName()).equals(name)){
                    System.out.println("삭제할 데이터가 존재하지 않습니다.");
                    break control1;
                }
        } while(true);
    }
}