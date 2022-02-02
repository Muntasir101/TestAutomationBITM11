package Rough;

public class Mixed {
    public static void main(String[] args) {
        sum();
       sum2(20,10); //Argument
       sum2(100,50);
    }

    public static void sum(){
        int a=10;
        int b=5;
        int result=a+b;
        System.out.println(result);
    }
    //Parameter
    public static void sum2(int a, int b){
        int result=a+b;
        System.out.println(result);
    }


}
