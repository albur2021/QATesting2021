package WeekOne;
public class Mesfin1{
    public static void main(String[] args) {
        Mesfin m = new Mesfin();
        m.setName("Mesfin");
        m.setLastName("Mulatu");
        m.setAge(35);
      
        // System.out.println("Person's name is "  + m.getName() + " and his last Name " + m.getLastName() + " and his age " + m.getAge());
        
        
        System.out.println(m.personInfo("Mesfin", "Mulatu", 35));
        m.personInfo1();
    }
}