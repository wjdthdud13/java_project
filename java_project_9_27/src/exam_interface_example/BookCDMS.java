package exam_interface_example;

public class BookCDMS {
    public static void main(String[] args){
        SeparateVolume sv = new SeparateVolume("863774", "엄마를 부탁해", "신경숙");
        sv.checkOut("홍길동", "20220125");
        sv.checkIn();
    }
}
