package DTO;

public class Person {
    //객체지향 측면 : 현실세계에 있는 객체를 객체지향 프로그램에서 사용하기 위해
    //객체의 상태정보(멤버변수)와 행위정보(멤버메서드)를 뽑아서 설계하는 도구
    public String name;
    public int age;
    public String phone;  // 여기까지가 상태정보(멤버변수)

    //객체를 메모리에 생성하는 역할을 하는 것을 생성자(Construclor)라고 함
    public Person(){  //생성자가 없어도 생략되어 있기에 오류가 안남(기본 생성자)
                        //생성자는 return 값을 가지지 않아 void x

    }

    public void play(){
        System.out.println("운동을 한다");
    }
    public void eat(){
        System.out.println("음식을 먹는다");
    }
    public void walk(){
        System.out.println("걷다");
    }  //여기까지가 행위정보(멤버메서드)


}
