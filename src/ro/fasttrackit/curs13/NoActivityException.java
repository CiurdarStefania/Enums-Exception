package ro.fasttrackit.curs13;

import java.util.List;

public class NoActivityException extends Throwable {
     private final List<String> activities;
    public NoActivityException(List<String> activities) {
        this.activities=activities;

    }
}
