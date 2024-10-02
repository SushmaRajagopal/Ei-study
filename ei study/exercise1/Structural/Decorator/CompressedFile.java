
public class CompressedFile extends FileDecorator {
    public CompressedFile(File file) {
        super(file);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("Decompressing file...");
    }
}
