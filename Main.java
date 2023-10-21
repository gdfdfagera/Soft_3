public class Main {
    public static void main(String[] args) {
        System.out.println("Baby is hungry");
        IFeed mom = new MomAdapter();
        mom.feedTheBaby();
    }
}
