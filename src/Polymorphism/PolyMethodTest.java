package Polymorphism;

import Model.Animal;
import Model.Cat;
import Model.Dog;

public class PolyMethodTest {
    //다형성 인수로 활용하기(부모를 활용)
    public static void main(String[] args) {
        Dog d = new Dog();
        display(d);
        Cat c = new Cat();
        display(c);


    }
   //다형성 인수
    private static void display(Animal ani){ //하나의 타입으로 여러 가지 타입을 받을수 있음(부모이기 때문에)
        ani.eat();
        //ani.night(); ->업캐스팅되어있어 에러남(다운 캐스팅하면 가능)
        //((Cat)ani).night(); Cat타입으로 받은 경우에만 실행 ->if문 사용하면 해결 됨
        if(ani instanceof Cat){ //instanceof : 객체 타입 확인 형 변환 가능한지 여부 확인
            ((Cat) ani).night();
        }
    }
}
