import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit; 
import  java.lang.Math;

public class Main{

    public static void main(String[] args){
        
        // Pluralize Function
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
        
        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
        
        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        // Flip Heads Function
        flipNHeads(3);

        // Command line Clock
       //clockTick();
       compSpeed();
    }

    public static String pluralize(String word, int Count) {
        String pluralWord = word;
        if(Count == 0 | Count > 1){
            pluralWord = pluralWord + 's';
        }
        return pluralWord;
    }

    public static void flipNHeads(int headsNeeded){
        int actualHeads = 0;
        int totalFlips = 0;
        
        while (actualHeads < headsNeeded )
        {
            double randomNumber = Math.random();
            if(randomNumber < 0.5){
                actualHeads = actualHeads + 1;
                System.out.println("It is a Head: Number is - " + randomNumber);
            } else{
                System.out.println("It is a Tail: Number is - " + randomNumber );
                actualHeads = 0;
            };
            totalFlips = totalFlips + 1;
        };
            System.out.println("It took " + totalFlips + " flips to flip "+ headsNeeded +" heads in a row");
    }

    public static void clockTick(){
        int i = 0;
        while(i<4){
            try{
                Thread.sleep(1000);
            } catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
            LocalDateTime now = LocalDateTime.now();
            System.out.println(now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
            i = i + 1;
        }
    }

    public static void compSpeed(){
        while(true) {
            LocalDateTime start = LocalDateTime.now();
            LocalDateTime end = start.plusSeconds(1);
            double loops = 0;
                while(!LocalDateTime.now().equals(end)) {
                    loops = loops + 1;
                } 
            System.out.println("Time:" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + "; Speed:" + loops/1_000_000 + "MHz");
            }
        }
}
