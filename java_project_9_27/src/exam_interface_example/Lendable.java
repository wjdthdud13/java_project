package exam_interface_example;

public interface Lendable {
    public abstract void checkOut(String borrower, String date); //대출(대여) 관련 메서드
    /*public abstract*/ void checkIn(); //반납 관련 메서드
}
