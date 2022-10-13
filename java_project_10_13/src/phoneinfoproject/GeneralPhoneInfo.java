package phoneinfoproject;

public class GeneralPhoneInfo {
    private String name;
    private String phone;

    public GeneralPhoneInfo(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void showPhoneInfo() {
        System.out.println("이름 :"+name);
        System.out.println("전화번호 :"+phone);
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object obj) {
        return phone.equals(((GeneralPhoneInfo)obj).phone);
    }

    @Override
    public int hashCode() {
        return phone.hashCode();
    }
}
