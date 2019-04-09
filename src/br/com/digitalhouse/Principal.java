package br.com.digitalhouse;

public abstract class Principal {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Bidu", "20", "Vira-lata");

        System.out.print("Esse cachorro é mamífero ?" + cachorro.ehMamifero());
            }
}