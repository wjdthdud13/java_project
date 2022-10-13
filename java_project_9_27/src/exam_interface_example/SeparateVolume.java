package exam_interface_example;

//단행본 클래스
public class SeparateVolume implements Lendable{
    private String requestNo; //청구번호
    private String bookTitle; //제목
    private String writer; //저자
    private String borrower; //대출인
    private String checkOutDate; //대출일
    private int state; //대출상태

    public SeparateVolume(String requestNo, String bookTitle, String writer){
        this.requestNo = requestNo;
        this.bookTitle = bookTitle;
        this.writer = writer;
    }

    public void checkOut(String borrower, String date){//대출 메서드
        if(state != 0) //대여중이라면
            return; //return 값; return; -메서드를 강제로 종료하겠다는 의미.
        this.borrower = borrower;
        this.checkOutDate = date;
        this.state = 1; //대출상태
        System.out.println("*" + bookTitle + "(" + writer + ") 이(가) 대출되었습니다");
        System.out.println("대출인 : " + this.borrower);
        System.out.println("대출일 : " +this.checkOutDate + "\n");
    }

    public void checkIn(){ //반납 메서드
        if(state == 0){//이미 반납처리가 되었다면
            System.out.println("이미 반납 처리가 완료되었습니다.");
            return;
        }
        this.borrower = null;
        this.checkOutDate = null;
        this.state = 0;//반납상태
        System.out.println("*" + bookTitle + "이(가) 반납되었습니다.\n");
    }

    public String toString(){
        return "단행본 정보[ 청구번호 : " + requestNo + ", 책제목 : " + bookTitle + ", 저자 : " + writer + "]";
    }

    public String getRequestNo(){
        return requestNo;
    }

    public void setRequestNo(String requestNo){
        this.requestNo = requestNo;
    }

    public String getBookTitle(){
        return bookTitle;
    }

    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }

    public String getWriter(){
        return writer;
    }

    public void setWriter(String writer){
        this.writer = writer;
    }

    public String getBorrower(){
        return borrower;
    }

    public void setBorrower(String borrower){
        this.borrower = borrower;
    }

    public String getCheckOutDate(){
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate){
        this.checkOutDate = checkOutDate;
    }

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state = state;
    }
}
