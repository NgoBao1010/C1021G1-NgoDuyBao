package ss23_Behavioral_Design_Pattern.Thuc_hanh.Observer;

public class OctObserver extends Observer{
    public OctObserver(Subject subject){
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.print(" " + Integer.toOctalString(subject.getState()));
    }
}
