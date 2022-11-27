package Lesson4HW.Task3;

public class Player implements Playable, Recordable {

    public void play(){
        System.out.println("Playing a file");
    }

    public void pause(){
        System.out.println("Playing/recording paused");
    }

    public void stop(){
        System.out.println("Stop playing/recording");
    }

    public void record(){
        System.out.println("Recording started");
    }
}
