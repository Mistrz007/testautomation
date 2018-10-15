package pl.mig.junit;

public class GamePlay {
    public static String play(int i){
        if( i == 0 ) {
            throw new IllegalArgumentException("Number must not be '0'");
        }
        if( i % 3 == 0 ) {
            return "OK";
        }
        else return "not OK";
        //return String.valueOf(i);
    }
}
