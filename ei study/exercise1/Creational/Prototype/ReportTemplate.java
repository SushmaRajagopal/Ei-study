
public class ReportTemplate implements Document {
    @Override
    public Document cloneDocument() {
        return new ReportTemplate();
    }

    @Override
    public void display() {
        System.out.println("This is a report template.");
    }
}
