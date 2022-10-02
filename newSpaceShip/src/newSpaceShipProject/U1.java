package newSpaceShipProject;

import java.util.ArrayList;
import java.util.Random;

public class U1 extends Rocket {

    double weight=10000;
    static int maxWeightOfCargo = 8000;
    String name;
    int currentWeight;

    public U1(String name,int currentWeight){
        this.name=name;
        this.currentWeight=currentWeight;
    }

    public boolean launch(){
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
       double factor=(0.05*currentWeight/maxWeightOfCargo)*10;
//        System.out.println(currentWeight);
//        System.out.println(maxWeightOfCargo);
//        System.out.println("factor : "+factor);
//        System.out.println("random numer : "+rand);
        return factor>=rand;
    }

    public boolean land(){
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        int factor=(int)(0.01*(currentWeight/maxWeightOfCargo));
        return factor>=rand;
    }

    public static int totalBudget1(ArrayList<U1> list){
        int totalBudgetRequired = list.size()*1000000000;
        return totalBudgetRequired ;
    }

    public String toString(){
        return this.name+" "+currentWeight;
    }
}
