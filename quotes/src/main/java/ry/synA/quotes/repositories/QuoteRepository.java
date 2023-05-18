package ry.synA.quotes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ry.synA.quotes.models.Quote;

import java.util.Optional;

public interface QuoteRepository extends JpaRepository<Quote, Integer> {
    Optional<Quote> findByQuoteIdEquals(Integer quoteId);
    @Override
    Optional<Quote> findById(Integer integer);

}
