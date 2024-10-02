
public class BasicFile implements File {
    private String fileName;

    public BasicFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void open() {
        System.out.println("Opening file: " + fileName);
    }
}
