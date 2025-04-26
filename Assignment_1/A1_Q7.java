abstract class LibraryResources{
    private String title;
    private String author;
    LibraryResources(String title , String author){
        this.title = title;
        this.author = author;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return this.author;
    }
    abstract public void displayDetail();
}
class Book extends LibraryResources{
    int pageCount;
    int issueDate;
    int duration;
    Book(String title, String author){
        super(title, author);
        this.pageCount = 0;
        this.issueDate = 0;
        this.duration = 0;
    }
    public void setPageCount(int page){
        this.pageCount = this.pageCount+page;
    }
    public int getPageCount(){
        return this.pageCount;
    }
    public void setIssueDate(int date){
        this.issueDate = date;
    }
    public int getIssueDate(){
        return this.issueDate;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }
    public int getDuration(){
        return this.duration;
    }
    @Override
    public void displayDetail(){
        System.out.println("Title: "+this.getTitle());
        System.out.println("Author: "+this.getAuthor());
        System.out.println("Page Count: "+this.pageCount);
        System.out.println("Date of issue: "+this.issueDate);
        System.out.println("Duration: "+this.duration);
    }
}
public class A1_Q7 {
    public static void main(String[] args) {
        Book b1 = new Book("abc", "def");
        b1.setPageCount(4);
        b1.setIssueDate(10);
        b1.setDuration(10);
        b1.displayDetail();
    }
}
