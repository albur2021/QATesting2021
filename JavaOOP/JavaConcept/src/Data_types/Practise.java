package Data_types;

public class Practise {

    //Instancies, variables, properties
    private String name = "";
    private int age = 0;
    private boolean bul;

    //Constructor:

    public Practise(String name, int age, boolean bul) {
        this.name = name;
        this.age = age;
        this.bul = bul;
    }


    //Methods : Setters and Getters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBul() {
        return this.bul;
    }

    public boolean getBul() {
        return this.bul;
    }

    public void setBul(boolean bul) {
        this.bul = bul;
    }




}
