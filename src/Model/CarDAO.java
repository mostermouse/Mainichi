package Model;

public class CarDAO {
    //DAO 클래스는 왜 필요할까?
    //데이터베이스에 데이터(DTO,VO)를 저장 수정 검색 삭제하기 위한 모델
    //(CRUD 동작을 가지고있는 클래스 , 비즈니스 로직을 처리하는 클래스)

    //C.R.U.D
    //Create = insert(저장)
    public void carInsert(CarDTO car){
        //DB연결 , insert SQL
        System.out.println("car 정보가 DB에 저장이 되었습니다.");
    }
    public void carSelect(){
        //DB연결 select SQL
        System.out.println("car 정보가 출력이 되었습니다.");
    }

}
