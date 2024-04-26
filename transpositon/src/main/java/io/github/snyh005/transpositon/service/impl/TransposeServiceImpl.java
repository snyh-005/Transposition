package io.github.snyh005.transpositon.service.impl;

import io.github.snyh005.transpositon.dto.Note;
import io.github.snyh005.transpositon.service.TransposeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransposeServiceImpl implements TransposeService {

    public List<Note> transpose(List<Note> notes, int semitones) {
        List<Note> transposedNotes = new ArrayList<>();
        for (Note note : notes) {
            int newOctave = note.getOctave() + semitones / 12;
            transposedNotes.add(new Note(newOctave, note.adjustNoteNumber(semitones)));
        }
        return transposedNotes;
    }
}