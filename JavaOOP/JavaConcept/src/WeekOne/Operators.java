package WeekOne;

public class Operators{
public static void main(String[] args) {
    Operators o = new Operators();
    // o.oper();
    // o.oper1();
    oper2();
}
    static int num = 23;
    static int num1 = 3;



    // public int oper(){
    //     if(num == num1){
    //         System.out.println("it's equalent");
    //         return 1;
    //     }else{
    //         System.out.println("they are not equlent");
    //         return -1;
    //     }
    // }


    // public int oper1(){
    //     if(num > num1){
    //         System.out.println("the first num is larger than second one");
    //         return 1;
    //     }else{
    //         System.out.println("they are  equlent!");
    //         return -1;
    //     }
    // }

    public static int oper2(){
        if(num %2==0 && num1 %2==0){
            System.out.println("These numbers are even");
            return 1;
        }else{
            System.out.println("These numbers are odd");
            return -1;
        }
        
    }
}