
public class Room implements HouseComponent {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Room: " + name);
    }
}
