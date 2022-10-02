package newSpaceShipProject;

import java.util.ArrayList;
import java.util.Random;

 class U2 extends Rocket {

    double weight=18000;
    static int maxWeightOfCargo = 11000;
    String name;
    int currentWeight;

    public U2(String name,int currentWeight){
        this.name=name;
        this.currentWeight=currentWeight;
    }

    public boolean launch(){
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        double factor=(double)(0.04*(weight/maxWeightOfCargo));
//        System.out.println("random number : "+rand);
//        System.out.println("factor number : "+factor);
        return factor>=rand;
    }

    public boolean land(){
        Random randomNumber = new Random();
        double rand = randomNumber.nextDouble();
        double factor=(0.08*(weight/maxWeightOfCargo));
//        System.out.println(currentWeight);
//        System.out.println(maxWeightOfCargo);
//        System.out.println("random number : "+rand);
//        System.out.println("factor number : "+factor);
        return factor>=rand;
    }

    protected static int totalBudget2(ArrayList<U2> list){
        int totalBudgetRequired = list.size()*1200000000;
        return totalBudgetRequired ;
    }

    public String toString(){
        return this.name+" "+currentWeight;
    }
}
