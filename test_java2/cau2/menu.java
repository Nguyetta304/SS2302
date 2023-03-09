package test_java2.cau2;

public class menu {
    private String title;
    private String url;

    public menu(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public void displayInfo() {
        System.out.println("Title: " + this.title);
        System.out.println("URL: " + this.url);
    }
}
