package ss23_Behavioral_Design_Pattern.Thuc_hanh.Observer;

public class HexObserver extends Observer{
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }
    @Override
    public void update() {
        System.out.print(" " + Integer.toHexString(subject.getState()));
    }
}
