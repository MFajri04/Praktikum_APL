class Main {
    public static void main (String[] args) {
        Kucing kucing = new Meow();

        Bebek meowAdapter = new MeowAdapter(kucing);
        System.out.println("kwek kwek kwek kwek  wek wkw !!!!");
        meowAdapter.kwek();
    }
}