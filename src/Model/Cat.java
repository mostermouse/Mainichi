package Model;

public class Cat extends Animal {
    public Cat() {
        super(); //new Animal()
    }

    public void night() {  //Cat만 가지는 고유한 기능

        System.out.println("밤에 눈에서 빛이 난다");
    }

    public void eat() {
        System.out.println("고양이처럼 먹다");
    }
}
