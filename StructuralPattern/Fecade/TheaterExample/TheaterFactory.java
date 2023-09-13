package StructuralPattern.Fecade.TheaterExample;

import javax.xml.crypto.dsig.dom.DOMValidateContext;

public class TheaterFactory
{

    private static Amplifier amp;
    private static Tuner tuner;
    private static DvdPlayer dvdPlayer;
    private static CdPlayer cdPlayer;

    private static PopcornPopper popcornPopper;
    private static Projector projector;
    private static TheaterLights theaterLights;
    private static Screen screen;




    public TheaterFactory()
    {
        //emtpy constructor
    }

    public Amplifier getAmplifier(String description)
    {
        if(amp==null)
            amp = new Amplifier(description);
        return amp;
    }

    public Tuner getTuner(String description)
    {
        if(tuner==null)
            tuner = new Tuner(description,amp);
        return tuner;
    }

    public DvdPlayer getDvdPlayer(String description) {
        if(dvdPlayer==null)
            dvdPlayer = new DvdPlayer(description,amp);
        return dvdPlayer;
    }

    public CdPlayer getCdPlayer(String description) {
        if(cdPlayer==null)
            cdPlayer = new CdPlayer(description,amp);
        return cdPlayer;
    }

    public PopcornPopper getPopcornPopper(String description)
    {
        if(popcornPopper==null)
            popcornPopper = new PopcornPopper(description);
        return popcornPopper;
    }

    public Projector getProjector(String description)
    {
        if(projector==null)
            projector = new Projector(description,dvdPlayer);
        return projector;
    }

    public TheaterLights getTheaterLights(String description) {
        if(theaterLights==null)
            theaterLights = new TheaterLights(description);
        return theaterLights;
    }

    public Screen getScreen(String description) {
        if(screen==null)
            screen = new Screen(description);
        return screen;
    }
}
