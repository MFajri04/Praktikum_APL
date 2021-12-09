import java.io.File;

//sebuah class untuk iplementasi EmailNotificationFashion ke dalam  EventFashion
public class EmailNotificationFashion implements EventFashion {
    private String email;

    public EmailNotificationFashion(String email) {
        this.email = email;
    }

    // iplementasi sebuah overide dari sebuah method update yang menampil string
    @Override
    public void update(String eventType, File file) {
        System.out.println("------------------------\nEmail to " + email + "\n=>: manajer telah melakukan penyimpanan Data" + eventType + " operasi dengan file berikut:" + file.getName());
    }
}