public class MeowAdapter implements Bebek {
    private Kucing kucing;

    public MeowAdapter(Kucing kucing) {
        this.kucing = kucing;
    }

    @Override
    public void kwek() {
        kucing.meow();
    }
}