public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("MP3 Player", "Portable music player", "MP3-001", 50.99f, 180);
        System.out.println("MP3 Info:");
        mp3.showInfo();
        System.out.println();
        
        Book book = new Book("Java Programming", "Learn Java programming language", "BK-001", 29.99f, "John Doe", 400, "Programming");
        System.out.println("Book Info:");
        book.showInfo();
    }
}
