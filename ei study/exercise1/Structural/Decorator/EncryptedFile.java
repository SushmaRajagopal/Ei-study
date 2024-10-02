
public class EncryptedFile extends FileDecorator {
    public EncryptedFile(File file) {
        super(file);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("Decrypting file...");
    }
}
