package Model;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        //자동차 정보를 키보드로 부터 입력받아서 DB에 저장 ㄱㄱ
        Scanner sc = new Scanner(System.in);
        System.out.print("자동차 일련 번호 :");
        int carSn = sc.nextInt();

        sc.nextLine();

        System.out.print("자동차 이름 :");
        String carName = sc.nextLine();

        System.out.print("자동차 가격 :");
        int carPrice = sc.nextInt();

        sc.nextLine();

        System.out.print("자동차 소유자 이름 :");
        String carOwner = sc.nextLine();

        System.out.print("자동차 연식 :");
        int carYear = sc.nextInt();

        sc.nextLine();

        System.out.print("자동차 타입 :");  //G(휘발유) , D(경유)
        String carType = sc.nextLine();

        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;

        CarDAO dao = new CarDAO();
        dao.carInsert(car);
        dao.carSelect();
    }
}
