package main.java.com.company;

public class YouHaventChosenTestoException extends Throwable {
    public YouHaventChosenTestoException(){
        super("You havent chosen the type of dough, and trying to choose ingredients??? Dont do like this anymore!!");
    }
}
