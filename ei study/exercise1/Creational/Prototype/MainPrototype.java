
public class MainPrototype {
    public static void main(String[] args) {
        Document letterTemplate = new LetterTemplate();
        Document clonedLetter = letterTemplate.cloneDocument();

        Document reportTemplate = new ReportTemplate();
        Document clonedReport = reportTemplate.cloneDocument();

        clonedLetter.display();
        clonedReport.display();
    }
}
