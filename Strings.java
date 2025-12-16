public class Strings {
    public static void main(String[] args){

        String nameObj = new String("Didi");

        //0 1 2 3
        //D i d i

        String name1 = "Didi";
        String name2 = "Gogo";
        String name3 = "Gogo";

        System.out.println("name1 and nameObj:" + (name1 == nameObj));
        System.out.println("name1 and nameObj:" + name1.equals(nameObj));
        System.out.println("name1.equals(name2): " + name1.equals(name2));
        System.out.println("name2 and name3:" + (name2 == name3));



    }
    
}
