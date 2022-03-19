package ss23_Behavioral_Design_Pattern.Thuc_hanh.Observer;

public class BinObserver extends Observer{
    public BinObserver(Subject subject){
        this.subject = subject;
        this.subject.add(this);
    }
    @Override
    public void update() {
        System.out.print(" " + Integer.toBinaryString(subject.getState()));
    }
}