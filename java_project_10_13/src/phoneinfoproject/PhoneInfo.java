package phoneinfoproject;

    public class PhoneInfo {
        private String name;
        private String phoneNumber;

        public PhoneInfo(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public void showPhoneInfo() {
            System.out.println("이름 : " + name);
            System.out.println("전화번호 : " + phoneNumber);
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }
    }

        class PhoneUnivInfo extends PhoneInfo {
            private String major;
            private int year;

            PhoneUnivInfo(String name, String phoneNumber, String major, int year) {
                super(name, phoneNumber);
                this.major = major;
                this.year = year;
            }

            public void showPhoneInfo() {
                super.showPhoneInfo();
                System.out.println("전공 :" + major);
                System.out.println("학년 :" + year);
            }
        }

        class PhoneCompanyInfo extends PhoneInfo {
            private String company;

            PhoneCompanyInfo(String name, String phoneNumber, String company) {
                super(name, phoneNumber);
                this.company = company;
            }

            public void showPhoneInfo() {
                super.showPhoneInfo();
                System.out.println("회사 :" + company);
            }
        }