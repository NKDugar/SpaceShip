package newSpaceShipProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    private ArrayList<Item> itemList =new ArrayList<>();
    private File file;
    public Simulation(String filePath){
        file=new File(filePath);
    }

    public ArrayList<Item> loadItem() throws FileNotFoundException {
        Scanner sc=new Scanner(file);
        while(sc.hasNext()){
            String array[]=sc.nextLine().split("=");
            Item item=new Item();
            item.name=array[0];
            item.weight=Integer.parseInt(array[1]);
            itemList.add(item);
        }
        sc.close();
//        System.out.println(itemList.toString());
        return itemList;
    }

    public ArrayList<U1> loadU1(ArrayList<Item> items){
        ArrayList<U1> rocketsOfU1=new ArrayList<>();
        // list to store the rockets of u1.
        Rocket objOfRocket = new Rocket();
        U1 rocket=new U1("rocket1",objOfRocket.currentWeight);
        int j=1;
        for(Item item : items){
            if(rocket.canCarry(item,U1.maxWeightOfCargo)){
                if(!rocket.carry(item,U1.maxWeightOfCargo)){
//                    System.out.println("creating a new rocket");
                    rocket=new U1("rocket"+j,objOfRocket.currentWeight);
                    rocketsOfU1.add(rocket);
//                    rocket=new U1("rocket"+j,objOfRocket.currentWeight);
                    j++;
                    objOfRocket.currentWeight=0;
                    rocket.carry(item,U1.maxWeightOfCargo);
                }
                else{
                    rocket.carry(item,U1.maxWeightOfCargo);
                }
            }
        }

        return rocketsOfU1;
    }

    public ArrayList<U2> loadU2(ArrayList<Item> items){
        ArrayList<U2> rocketsOfU2=new ArrayList<>();
        // list to store the rockets of u1.
        Rocket objOfRocket = new Rocket();
        U2 rocket=new U2("rocket1",objOfRocket.currentWeight);
        int j=1;
        for(Item item : items){
            if(rocket.canCarry(item,U2.maxWeightOfCargo)){
                if(!rocket.carry(item,U2.maxWeightOfCargo)){
//
                    rocket=new U2("rocket"+j,objOfRocket.currentWeight);
                    rocketsOfU2.add(rocket);
//
                    j++;
                    objOfRocket.currentWeight=0;
                    rocket.carry(item,U2.maxWeightOfCargo);
                }
                else{
                    rocket.carry(item,U2.maxWeightOfCargo);
                }
            }
        }
        return rocketsOfU2;
    }
}
