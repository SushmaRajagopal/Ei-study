
public class LetterTemplate implements Document {
    @Override
    public Document cloneDocument() {
        return new LetterTemplate();
    }

    @Override
    public void display() {
        System.out.println("This is a letter template.");
    }
}
