package WeekOne;
public class Mesfin{
    //fields, variables, properties, instantcies
    private String name = "";
    private String lastName = "";
    private int age = 0;


    //set up Setters and Getters;
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //Methods_1_String_Return
    public String personInfo(String name, String lastName, int age){
        return "Person's name is " + name + " and his last name " + lastName + " and his age " + age;
    }

    //Methods_2_Return_Everything
    public void personInfo1(){
        System.out.println("Mesfin from Ethopia");
    }


}