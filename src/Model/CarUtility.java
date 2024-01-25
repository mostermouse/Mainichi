package Model;

public class CarUtility {
    //Utility 클래스 필요 이유
    //반복 동작을 별도의 클래스로 만들어 놓고 필요할 때 사용
    //꼭 필요한 것은 아니고 필요할 때 만들어 사용
    //자바에서도 java.util패키지에 이러한 utility 클래스가 많음
    //ex) 도움을 주는 클래스 : utility , helper , Facade(거실에 놔두긴 불편한 것을 다른 곳에 놔둠)
    public static void main(String[] args) {
        int carSn =1110;
        String carName = "BMW828i";
        int carPrice = 90000000;
        String carOwner = "홍길동";
        int carYear = 2015;
        String carType = "G";
        //묶어야 이동이 편함
        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carType = carType;
        car.carYear = carYear;
        car.carOwner = carOwner;
        car.carName = carName;
        car.carPrice = carPrice;
        //carPrint(car);
        CarUtil carUt = new CarUtil();
        carUt.carPrint(car);


    }
    // Q.매개변수로 자동차의 정보를 입력받아서 출력하는 메서드 정의 ㄱㄱ
   // public static void carPrint(CarDTO car){ //다른곳에서 쓰기 불편하니 별도로 클래스 만들어줌
     //   System.out.println(car.carSn + "\t" +car.carName +"\t"+ car.carPrice +"\t"+ car.carOwner +"\t"+car.carYear +"\t"+ car.carType);
    //}

}
