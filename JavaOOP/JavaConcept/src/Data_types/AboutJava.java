package Data_types;

public class AboutJava {
    

    public int [] arrnum = {1,2,3,5,6};
    static String [] arrString = {"Mesfin", "Mulatu", "Ethopia"};

    public static void main(String[] args) {
        AboutJava a = new AboutJava();
        System.out.println(a.arrnum.length);
        System.out.println(arrString);

        for(int i=0;i<a.arrnum.length;i++){
            if(a.arrnum[i] == 2){
                System.out.println("Number 2 is found!");
            }
        }
    }
}
