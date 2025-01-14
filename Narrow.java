// NARROW CASTING (MANUAL)

public class Narrow{
    public static void main(String args[]){
        double MyDouble = 19.78d;
        int MyInt = (int)MyDouble;  // Manual Casting Double to Int

        System.out.println("Before Converting to Casting");
        System.out.println(MyDouble);                           // OUTPUT : 19.78

        System.out.println("After Converting to Casting");
        System.out.println(MyInt);                             // OUTPUT : 19

    } 
}