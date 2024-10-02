
public abstract class FileDecorator implements File {
    protected File file;

    public FileDecorator(File file) {
        this.file = file;
    }

    @Override
    public void open() {
        file.open();
    }
}
