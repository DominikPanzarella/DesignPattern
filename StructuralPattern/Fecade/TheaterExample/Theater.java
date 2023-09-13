package StructuralPattern.Fecade.TheaterExample;

import java.util.ArrayList;
import java.util.Set;

//Fecade class
public class Theater
{
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    private Theater(TheaterFactory factory)
    {
        amp = factory.getAmplifier("Top-O-Line Amplifier");
        tuner = factory.getTuner("Top-O-Line AM/FM Tuner");
        dvd = factory.getDvdPlayer("Top-O-Line DVD Player");
        cd = factory.getCdPlayer("Top-O-Line CD Player");
        projector = factory.getProjector("Top-O-Line Projector");
        lights = factory.getTheaterLights("Theater Ceiling Lights");
        screen = factory.getScreen("Theater Screen");
        popper = factory.getPopcornPopper("Popcorn popper");
    }

    public static Theater getTheater()
    {
        TheaterFactory factory = new TheaterFactory();
        return new Theater(factory);
    }

    public static Theater getTheater(TheaterFactory factory)
    {
        return new Theater(factory);
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }

    public void listenToCd(String cdTitle) {
        System.out.println("Get ready for an audiopile experence...");
        lights.on();
        amp.on();
        amp.setVolume(5);
        amp.setCd(cd);
        amp.setStereoSound();
        cd.on();
        cd.play(cdTitle);
    }

    public void endCd() {
        System.out.println("Shutting down CD...");
        amp.off();
        amp.setCd(cd);
        cd.eject();
        cd.off();
    }

    public void listenToRadio(double frequency) {
        System.out.println("Tuning in the airwaves...");
        tuner.on();
        tuner.setFrequency(frequency);
        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);
    }

    public void endRadio() {
        System.out.println("Shutting down the tuner...");
        tuner.off();
        amp.off();
    }


}
