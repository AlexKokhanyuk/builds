package com.kokhanyuk.thread.prime;


import org.apache.log4j.Logger;

/**
 * ToRunPrimes
 *
 * @author Olexandr Kokhanyuk
 * @version 1.0
 */
public class ToRunPrimes {

    private static Logger log = Logger.getLogger(Primes.class);

    private ToRunPrimes() {
    }

    public static void main(String[] args) {
        Primes prime = new Primes();
        try {
            prime.calculate();
        } catch (InterruptedException e) {
            log.warn(e.getMessage(), e);
            Thread.currentThread().interrupt();
        }
    }
}
