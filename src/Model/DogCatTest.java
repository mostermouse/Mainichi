package Model;

public class DogCatTest {
    public static void main(String[] args) {

        //업캐스팅 : 부모가 자식을 가리키는 객체생성방법
        //상속 체이닝 : 나를 기준으로 부모의 부모가 이어지고 최초의 부모(상속 라인)이어진 것
        //조상부터 메모리 적재
        Animal ani = new Dog();
        ani.eat(); //동물처럼먹다  -> 개처럼먹다
        ani = new Cat();
        ani.eat();  //동물처럼먹다 - > 고양이처럼 먹다
        //컴파일 시점에서는 Animal이지만 실행시점에선 오버라이딩이 되어있다면 자식을 탐(동적바인딩)


        //Override : 상속관계에서 하위클래스가 상위클래스의 동작을 재정의 하는것
        //동적바인딩 : 실행시점에서 사용될 메서드가 결정되는 바인딩

        Cat c = new Cat();  //애니멀을 사용을 안하므로 좋은 방식은 아님
        Dog d = new Dog();


    }
}
