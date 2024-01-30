package JVM;

public class AllStatic {
    private AllStatic(){

    } //자바 API에서는 private 생성자를 가지고 있는 클래스도 있음
    //System , Math 등
    //생성자는 반드시 public이다? (꼭 그렇진 않음)
    public static int hap(int a, int b){
        int v = a + b;
        return v;
    }
    public static int max(int a, int b){
        return a > b ? a : b;
    }
    public static int min(int a, int b){
        return a < b ? a : b;
    }
}
