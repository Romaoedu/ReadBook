package br.meplis.ReadBook.controller;
import br.meplis.ReadBook.entities.Reader;
import br.meplis.ReadBook.repository.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ReaderController  {

    private final ReaderRepository readerRepo;

    @Autowired
    public ReaderController(ReaderRepository readerRepo){
        this.readerRepo = readerRepo;
    }

    @GetMapping
    public List<Reader>getAllReaders(){
         return readerRepo.findAll();

    }
    @GetMapping("/byID")
    public Optional<Reader> searchReaderByID(Long id){
       return readerRepo.findById(id);

    }

    @PostMapping
    public void createReader(@RequestBody Reader reader){
        readerRepo.save(reader);
    }
    @PutMapping
    public void updateReader(@RequestBody Reader reader){readerRepo.save(reader);}
    @DeleteMapping
    public void deleteReader(Long id){
        readerRepo.deleteById(id);
    }

}
