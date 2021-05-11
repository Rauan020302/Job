package com.company;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;

public class MusicTest1 {

    public void play(){
        try {
            Sequence sequence = (Sequence) MidiSystem.getSequencer();
            System.out.println("Мы получили синтезатор ");
        }catch (MidiUnavailableException ex){
            System.out.println("неудача");
        }
    }

    public static void main(String[] args){
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
