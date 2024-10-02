
public class MainComposite {
    public static void main(String[] args) {
        House house = new House();

        Room livingRoom = new Room("Living Room");
        Room kitchen = new Room("Kitchen");
        Room bedroom = new Room("Bedroom");

        house.addComponent(livingRoom);
        house.addComponent(kitchen);
        house.addComponent(bedroom);

        house.showDetails();
    }
}
