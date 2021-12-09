import java.io.File;

// konkret berisi logika bisnis nyata yang
// menarik untuk beberapa pelanggan. Kita bisa menurunkan kelas ini
// dari penerbit dasar, tapi itu tidak selalu memungkinkan di
// kehidupan nyata karena penerbit konkret mungkin sudah menjadi
// subkelas. Dalam hal ini, pada kasus ini menambal logika berlangganan
// dengan komposisi, seperti yang kita lakukan di sini.

public class ObseverFashion {
    public EventManager events;
    private File file;

    public ObseverFashion() {
        this.events = new EventManager("open", "save");
    }

    // Method kita memberi tahu pelanggan tentang perubahan.
    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}