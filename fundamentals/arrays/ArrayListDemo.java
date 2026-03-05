package Arrays;
import java.util.random
import java.util.ArrayList;

class Class {

}
public class ArrayListDemo {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(list);
        System.out.println(list.size());


       //  ArrayList<Integer> list2 = new ArrayList<Double>();

      ///  ArrayList<> list3  = new ArrayList<Integer>(); 


      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      System.out.println(list);
      System.out.println(list.size());


      list.add(1, 5);
      System.out.println(list);


      System.out.println(list.get(1));


      list.remove(1);
      System.out.println(list);

     list.add(1, 5);
     list.add(2, 5);

     list.remove(Integer.valueOf(5));

    }
    
}


// Challenges

//Challenge 1
public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Random r = new Random();

        for(int i = 0; i < 10; i++) {
            nums.add(r.nextInt(100));
        }

        for(int i = nums.size() - 1; i >= 0; i--) {
            if(nums.get(i) % 2 != 0) {
                nums.remove(i);
            }
        }

        System.out.println(nums);
    }
}


//Challenge 2
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> guests = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String name = "";

        while(!name.equals("exit")) {
            name = sc.nextLine();
            if(name.equals("exit")) {
                break;
            }

            if(guests.contains(name)) {
                System.out.println("this person is invited!");
            } else {
                guests.add(name);
            }
        }
    }
}


//Challenges 3
public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String food = "";

        while(!food.equals("exit")) {
            food = sc.nextLine();
            if(food.equals("exit")) {
                break;
            }

            if(groceries.contains(food)) {
                System.out.println(groceries.indexOf(food));
            } else {
                System.out.println("Not Found");
                groceries.add(food);
            }
        }
    }
}