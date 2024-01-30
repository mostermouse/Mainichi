package JVM;

public class Memory {
    //메인 시작 클래스는 왜 객체생성 없이 실행이 되나?
    //1.JVM이 실행할 클래스를 찾는다 찾았다면
    //2.static 키워드가 붙어있는 멤버들을 정해진 메모리(static-zone)위치에 한번 자동으로 로딩함
    //static 멤버들은 클래스를 사용하는 시점에서 딱 한번 메모리에 로딩
    //여기서는 main() 메서드가 static 이기 때문에 메모리에 자동으로 로딩
    //3.JVM이 static-zone에서 main()메서드를 호출한다.
    //4.호출된 메서드를 Call Stack Frame Area(Stack Area)에 push한뒤 동작 시작
    //Call Stack Frame Area는 메서드가 호출되면 호출된 기계어코드가 push되고 실행되는 메모리 공간
    //현재 프로그램이 실행되고 있는 상태를 파악 가능 LIFO구조


    //ex
    public static void main(String[] args) { //static이 붙은것은 method area에 static zone에 저장
        int a = 10;
        int b = 20;
        int sum = Memory.hap(a,b);  //클래스를 쓰는 이유 메서드 에어리어에 라벨을 가리킴(생략은 가능)
        System.out.println(sum); //

    }
    public static int hap(int a, int b){
        int v = a +b;
        return v;
    }
        //모든 것이 실행되면 stack에는 아무것도 없으므로 프로그램 종료함
}
