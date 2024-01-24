package DTO;  //클래스의 풀네임 DTO.DTO

public class DTO {
    public static void main(String[] args) {
        //객체  = 이질적인 구조 = 모델(Model) = 덩어리(Value Object) = 바구니 = 이동(Data Transfer Object)
        //배열은 자료형이 같아야 하지만 객체는 이질적인 구조이기에 다른 타입도 들어감
        //클래스 : 객체를 설계 = 모델링하는 도구 (새로운 자로형을 만드는 도구)


        // Q. 한 사람의 데이터를 저장할 변수를 선언하시오.
        Person p = new Person(); //new Person()은 호출이기에 생성자 필요
        p.name = "jojeongin";

        System.out.println(p.name);



    }
}
