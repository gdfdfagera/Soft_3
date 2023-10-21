public class MomAdapter implements IFeed{
    Mom mom;
    public MomAdapter(){
        this.mom = new Mom();
    }
    @Override
    public void feedTheBaby() {
        mom.cookTheFood();
    }
}
