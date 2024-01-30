package JVM;

public class NoneStaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        MyUtil my = new MyUtil();
        int sum = my.hap(a,b);
        System.out.println(sum);


        //Method Area : 메서드의 바이트코드가 할당
        //Heap Area : 객체가 생성되는 메모리 공간(가비지 컬렉터에 의해서 메모리가 수집)
        //Thread(Stack Area , PC register) : 메서드가 호출되면 메서드의 기계어코드를 할당 받고 메서드가 실행되는 공간
        //Runtime Constant Pool : 상수 값 할당이 되는 메모리 공간

    }
}
