package Extend;

public class EmployeeInitTest {
    public static void main(String[] args) {
        RempVO vo = new RempVO("홍길동" , 33, "010-1111-111" , "2022-10-10" , "홍보부" , true);
        System.out.println(vo.toString()); //나이가 500이여도 제약조건이 없음 정보은닉 x


    }
}
