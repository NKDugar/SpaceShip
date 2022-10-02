package newSpaceShipProject;

class Rocket implements SpaceShip {

    public static int currentWeight;
    private int maxWeightOfCargo;

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean carry(Item item,int maxWeightOfCargo){
//        System.out.println(item.weight);
        boolean flag=true;
        if(item.weight<maxWeightOfCargo && (currentWeight+item.weight)<maxWeightOfCargo) {
            currentWeight+=item.weight;
//            System.out.println("current weight in rocket : "+currentWeight);
        }
//        else if(currentWeight>=U1.maxWeightOfCargo){
//            flag=false;
//        }
        else{
//            System.out.println("current weight : "+currentWeight);
//            System.out.println("create a new rocket");
            flag=false;
        }
        return flag;
    }

    public boolean canCarry(Item item,int maxWeightOfCargo){
        boolean flag =false;
        if(item.weight<=maxWeightOfCargo){
            flag=true;
        }
        return flag;
    }
}

