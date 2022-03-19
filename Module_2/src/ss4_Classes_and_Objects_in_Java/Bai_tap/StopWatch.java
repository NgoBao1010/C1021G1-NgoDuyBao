package ss4_Classes_and_Objects_in_Java.Bai_tap;

import java.time.LocalTime;

public class StopWatch {
    private long startTime,endTime;

    public void setStartTime(){
        startTime = System.currentTimeMillis();
    }
    public long getStartTime(){
        return startTime;
    }
    public void setEndTime(){
       endTime = System.currentTimeMillis();
    }
    public long getEndTime(){
        return endTime;
    }
    public long getElapsedTime(){
        long miliSecond = endTime - startTime;
        return miliSecond;
    }

    public static void main(String[] args) {
        int [] a = new int [1000000];
        StopWatch sw = new StopWatch();
        sw.setStartTime();
        for (int i = 0; i < 1000000; i++) {
            a[i]=(int)(Math.random()*1000);
        }
        sw.setEndTime();
        System.out.print("Thời gian bắt đầu: " + sw.startTime + "\n");
        System.out.print("Thời gian kết thúc: " + sw.endTime + "\n");
        System.out.print("Thời gian chênh lệch: " + sw.getElapsedTime());
    }
}
