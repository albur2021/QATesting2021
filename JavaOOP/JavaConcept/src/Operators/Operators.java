package Operators;

public class Operators {

    //Arithmetic (+, -, *, /, %)
    //Assignment (=, +=, -=, *, /=)
    //Auto-increment Auto-decrement (++, --)
    //Logical (&&, ||, !(not))
    //Comparison (==, <=, >=, <, >)
    //Ternary (short of if-else)

    public void oper(int age, String name, String[]list, boolean qualified){
        for(int i=0;i<list.length;i++){
            String person = (list[i] == "Mesfin") ? "ther person is found ! ": "the person is not there !+";
            if(age>= 18 && age %2==0 && qualified) {
                System.out.println("Person is quilfied ! " + person + " and his name is " + name);
                System.out.println(++age);
                System.out.println(--age);
                // System.out.println(list[++i]);
                // System.out.println(list[i--]);
                // System.out.println(list[i++]);
                // System.out.println(list[i++]);
                // System.out.println(list[++i]);
                break;
            }else{
                System.out.println(" Person is not quilified");
            }
        }
    }

    public static void main(String[] args) {
        String []arrName = {"Mesfin"," James", "Adam", "Mike"};
        boolean permit = true;
        Operators o = new Operators();
   
        o.oper(18, "Mesfin", arrName, permit);
     
    }
    
}
