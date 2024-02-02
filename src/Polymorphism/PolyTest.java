package Polymorphism;

import Model.Animal;
import Model.Cat;
import Model.Dog;

public class PolyTest {
    public static void main(String[] args) {
        //Upcasting으로 객체를 생성
        //상속관계, 재정의(Override) , 동적바인딩 ,업캐스팅
        //다형성(message polymorphism)
        //상위 클래스가 동일한 메세지로 하위클래스를 서로 다르게 동작시키는 객체지향 원리
        Animal ani = new Dog();
        ani.eat(); //실행시점에서 사용될 메서드가 결정되는 바인딩(동적 바인딩)

        ani = new Cat();
        ani.eat();
        ((Cat)ani).night();
        //Overloading : 정적바인딩(컴파일시점) 프로그램 실행 속도와 무관
        //OVerridding : 동적바인딩 (실행시점) 프로그램 실행 속도 관련 있음


    }
}
