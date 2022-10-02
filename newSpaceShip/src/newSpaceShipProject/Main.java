package newSpaceShipProject;

import java.util.ArrayList;

public class Main {
    private static final String filePath="C:\\Users\\NKdugar\\Desktop\\text files\\U1.txt";
    private static final String filePath2="C:\\Users\\NKdugar\\Desktop\\text files\\U2.txt";
    public static void main(String[] args) throws Exception {
	// write your code here
        Simulation simulation =new Simulation(filePath);
        ArrayList<Item> items=simulation.loadItem();
        ArrayList<U1>rocketsOfU1=simulation.loadU1(items);
//        System.out.println(rocketsOfU1);
//      System.out.println("total budget required"+U1.totalBudget1(rocketsOfU1));


        Simulation simulation2 =new Simulation(filePath2);
        ArrayList<Item> items2=simulation2.loadItem();
        ArrayList<U2> rocketsOfU2 = simulation2.loadU2(items2);
//        System.out.println(rocketsOfU2);
//      System.out.println("total budget required"+U2.totalBudget2(rocketsOfU2));

//        checking if we can launch or land these rockets or not.
//        /*

//         int i=0;
//         while(i<rocketsOfU1.size()){
//            U1 line=rocketsOfU1.get(i);
//            System.out.println(line.launch()+" "+ line.land());
//            i++;
//        }

//        */

//        /*
//        System.out.println("printing U2");
//        int j=0;
//        while(j<rocketsOfU2.size()){
//            U2 line=rocketsOfU2.get(j);
//            System.out.println(line.launch()+" "+ line.land());
//            j++;
//        }

//        */


    }
}
