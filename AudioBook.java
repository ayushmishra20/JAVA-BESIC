public class AudioBook extends Book {
    private int runTime;

    AudioBook(int runTime,String title, String author) {
        super(runTime, title, author);
        this.runTime = runTime;
        
    }
}
