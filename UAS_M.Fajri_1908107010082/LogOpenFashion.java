import java.io.File;

//method mengimplementasikan sebuab obsever dari EventFashion
//pelanggan akan bereaksi ke sebuah perubahan yang baru dari pembelanjaan yang meraka pesan
public class LogOpenFashion implements EventFashion {
    private File log;

    public LogOpenFashion(String fileName) {
        this.log = new File(fileName);
    }

    // iplementasi sebuah overide dari sebuah method update yang menampil string
    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + " \n=> Seseorang telah melakukan pembelian " + eventType + " operasi beli dengan file berikut: " + file.getName());
    }
}
