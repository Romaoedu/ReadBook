package br.meplis.ReadBook.repository;

import br.meplis.ReadBook.entities.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ReaderRepository extends JpaRepository<Reader, Long> {
}
