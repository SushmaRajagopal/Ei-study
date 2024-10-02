
public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String content) {
        System.out.println(name + " received notification: " + content);
    }
}
