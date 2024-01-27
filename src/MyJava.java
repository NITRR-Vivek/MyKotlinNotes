/***** Calling Java from Kotlin (Ch18)*****/
/***** Calling Kotlin from Java (Ch18)*****/
public class MyJava {
    private int a;

    public int getValue(){
        return a;
    }
    public void setValue(int value){
        this.a = value;
    }

    public static void main(String[] args) {
        System.out.println("Addition is: "+ Ch18Kt.addition(5,2));
    }
}
