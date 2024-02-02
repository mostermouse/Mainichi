package Model;

public class Dog extends Animal {
    public Dog() {
        super(); //애니멀이 먼저 생성되야 해서 무조건 맨 위에 있어야함
        int a = 10;

    }

    //override
    public void eat() {
        System.out.println("개처럼 먹다");
    }
}
