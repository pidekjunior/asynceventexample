package cz.cvut.fel.czm.zidek;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.ObservesAsync;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class Test2Bean implements Serializable {

    private String testField = "initial value";

    public Test2Bean() {
        System.out.println("Test2Bean constructor call. Instance: " + this);
    }

    public String getTestString() {
        return "Test string to activate Test2Bean.";
    }

    public void listen(@ObservesAsync String s) {
        System.out.println("Received fired event with message: \"" + s + "\", in instance: " + this);
        this.testField = "async event triggered";
    }

    public String getTestField() {
        return this.testField;
    }

}