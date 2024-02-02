package Polymorphism;

import Model.Animal;
import Model.Cat;
import Model.Dog;

public class PolyArrayTest {
    public static void main(String[] args) {
        //다형성 배열(상위 타입배열)
        //배열은 동일한 자료형만 저장 하지만 부모타입의 배열은 자식타입을 저장 가능(서로 다른 타입 저장 가능)
        Dog d = new Dog();
        Cat c = new Cat();
        Animal[] ani = new Animal[2]; //서로 다른 타입을 배열로 저장할 때 사용
        //Animal[] ani = {new Dog(), new Cat()};
        ani[0] = d;
        ani[1] = c;
        display(ani);

    }
    public static void display(Animal[] ani){
        for(int i = 0; i < ani.length; i++){
            ani[i].eat();
            //((Cat)ani[i]).night()
        }
    }
}
