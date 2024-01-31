package Extend;
//일반사원
public class RempVO extends Employee{
    public RempVO(){
        super();
    }
    public RempVO(String name , int age, String phone , String empDate, String dept , boolean marriage){
        //초기화(자식이 부모의 기억공간에 초기화를 하는 경우)
        super(name, age , phone , empDate , dept , marriage); //부모에게 대신 초기화 해달라고 부탁


        //this.name = name; 이 방법으론 바람직하지 않다.
        //this.age = age;
        //this.phone = phone;
        //this.empDate = empDate;
        //this.dept = dept;
        //this.marriage= marriage;
    }
}
