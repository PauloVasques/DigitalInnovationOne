package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockInsufficientException extends Exception {

    public BeerStockInsufficientException(Long id, int quantityToDecrement) {
        super(String.format("Beers with %s ID informed is has insufficient quantity to decrement %s", id, quantityToDecrement));
    }
}
