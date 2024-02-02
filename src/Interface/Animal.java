package Interface;
//추상 클래스(불완전한 클래스)
public abstract class Animal{
    public abstract void eat(); //추상메서드(불완전한 메서드) : 메서드의 구현부가 없다

    public void move(){
        System.out.println("무리지어 이동한다.");
    }
}
