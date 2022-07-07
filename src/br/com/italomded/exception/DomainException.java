package br.com.italomded.exception;

public class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }
}
