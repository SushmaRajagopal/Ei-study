
public class ContentPublisher extends Subject {
    @Override
    public void postContent(String content) {
        System.out.println("Content Published: " + content);
        notifyObservers(content);
    }
}
