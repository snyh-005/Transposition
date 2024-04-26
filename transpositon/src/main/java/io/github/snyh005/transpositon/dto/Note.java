package io.github.snyh005.transpositon.dto;

public class Note {
    private final int octave;
    private final int noteNumber;

    public Note(int octave, int noteNumber) {
        this.octave = octave;
        this.noteNumber = noteNumber;
    }

    public int getOctave() {
        return octave;
    }

    public int getNoteNumber() {
        return noteNumber;
    }

    public int adjustNoteNumber(int semitones) {
        int newNoteNumber = noteNumber + semitones % 12;
        if (noteNumber < 1) {
            return noteNumber + 12;
        } else if (noteNumber > 12) {
            return noteNumber - 12;
        } else {
            return noteNumber;
        }
    }
}
