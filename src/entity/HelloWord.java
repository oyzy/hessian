package entity;

import java.io.Serializable;

/**
 * Created by oyzy on 2017/5/4.
 */
public class HelloWord implements Serializable {

    private String name;

    public HelloWord() {
        super();
    }

    public HelloWord(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
