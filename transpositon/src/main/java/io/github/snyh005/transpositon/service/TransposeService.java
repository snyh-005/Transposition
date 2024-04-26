package io.github.snyh005.transpositon.service;

import io.github.snyh005.transpositon.dto.Note;

import java.util.List;

public interface TransposeService {
    List<Note> transpose(List<Note> notes, int semitones);
}
