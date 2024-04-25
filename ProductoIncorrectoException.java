package org.example;

public class ProductoIncorrectoException extends Exception{
    public ProductoIncorrectoException(String errorMessage){
        super(errorMessage);
    }
}