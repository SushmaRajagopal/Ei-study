
public class MainObserver {
    public static void main(String[] args) {
        ContentPublisher publisher = new ContentPublisher();
        Observer user1 = new User("Alice");
        Observer user2 = new User("Bob");

        publisher.subscribe(user1);
        publisher.subscribe(user2);
        publisher.postContent("Breaking news!");

        publisher.unsubscribe(user2);
        publisher.postContent("Alice only update.");
    }
}
