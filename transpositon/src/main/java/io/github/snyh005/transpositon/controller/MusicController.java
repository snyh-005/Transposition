package io.github.snyh005.transpositon.controller;

import io.github.snyh005.transpositon.dto.Note;
import io.github.snyh005.transpositon.service.TransposeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/music")
public class MusicController {

        private final TransposeService transposeService;

        public MusicController(TransposeService transposeService) {
            this.transposeService = transposeService;
        }

        @PostMapping("/transpose")
        public ResponseEntity<List<Note>> transposeMusic(@RequestBody List<Note> notes,
                                                         @RequestParam int semitones) {
            List<Note> transposedNotes = transposeService.transpose(notes, semitones);
            return ResponseEntity.ok(transposedNotes);
        }
}
