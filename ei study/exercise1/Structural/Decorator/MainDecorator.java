
public class MainDecorator {
    public static void main(String[] args) {
        File basicFile = new BasicFile("example.txt");
        File encryptedFile = new EncryptedFile(basicFile);
        File compressedFile = new CompressedFile(encryptedFile);

        compressedFile.open();
    }
}
