package newSpaceShipProject;

public interface SpaceShip {
    boolean launch();

    boolean land();

    boolean  canCarry(Item item,int maxWeightOfCargo);

    boolean  carry(Item item,int maxWeightOfCargo);
}
