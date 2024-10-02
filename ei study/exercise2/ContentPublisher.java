
public class ContentPublisher extends Subject {
    @Override
    public void postContent(String content) {
        System.out.println("New content published: " + content);
        notifyObservers(content);
    }
}
