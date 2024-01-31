package Extend;

public class Employee{ //extends Object생략됨{ //부모 클래스
    //클래스를 계층화 하는것을 상속이라고 함(is a kind of)
    //장점 : 코드 중복 최소화 , 요구사항 반영 편함 , 확장성이 좋아짐

    private String name; //프로텍트는 상속관계에서 하위클래스가 상위클래스에 접근을 허용함
    private int age;
    private String phone;  // 프로텍트보단 프라이빗으로 정보은닉을 해주는게 바람직 함
    private String empDate;  //초기화도 자기 자신의 클래스가 해주는게 좋음
    private String dept;
    private boolean marriage;
    public Employee(){
        super(); // 생략되어 있음 상위클래스를 호출
    }
    public Employee(String name, int age, String phone, String empDate, String dept, boolean marriage) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.empDate = empDate;
        this.dept = dept;
        this.marriage = marriage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", empDate='" + empDate + '\'' +
                ", dept='" + dept + '\'' +
                ", marriage=" + marriage +
                '}';
    }



}
