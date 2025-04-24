// Vererbung
public class DigitalBook extends Book{

    private String downloadlink;

    public DigitalBook(String title, int pages, String author, String downloadLink) {
        super(title, pages, author);
        this.downloadlink = downloadLink;
    }

    public String getDownloadlink() {
        return downloadlink;
    }
    public void setDownloadlink(String downloadlink) {
        this.downloadlink = downloadlink;
    }

    //Polymorphismus
    @Override
    public void overview() {
        System.out.printf("%-20s %-10d %-20s %-20s\n", getTitle(), getPages(), getAuthor(), downloadlink);
    }

}
