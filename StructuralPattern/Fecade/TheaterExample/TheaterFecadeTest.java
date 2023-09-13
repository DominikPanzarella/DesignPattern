package StructuralPattern.Fecade.TheaterExample;

public class TheaterFecadeTest

{

    public static void main(String[] args)
    {
        Theater homeTheater = Theater.getTheater();
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}
