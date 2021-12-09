public class Main {

       // method pemangilan data obseverFashion dan decuratorfashion pada ouput
    public static void main(String[] args) {
		Fashion edgyFashion = new EdgyFashion(new FashinDasar());
		edgyFashion.assemble();
        System.out.println("\n*****");

        ObseverFashion obseverFashion = new ObseverFashion();
        obseverFashion.events.subscribe("open", new LogOpenFashion("tipe style pembelanjaan Fashion: Style EDgy"));
        obseverFashion.events.subscribe("save", new EmailNotificationFashion("FajriFashion@gmail.com"));
		
		Fashion edgyFashionMewah = new EdgyFashion(new FashionMewah(new FashinDasar()));
        edgyFashionMewah.assemble();
        System.out.println("\n\n=============================================================================");

        // pemangilan data obseverFashion untuk menampilkan data pada ouput
        try {
            obseverFashion.openFile("Data.txt");
            obseverFashion.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   

}