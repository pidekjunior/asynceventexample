package cz.cvut.fel.czm.zidek;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class TestBean implements Serializable {

    @Inject
    private Event<String> stringEvent;

    public TestBean() {
        System.out.println("TestBean constructor call. Instance: " + this);
    }

    public String getTestString() {
        return "Test string to activate TestBean.";
    }

    public String testFireAsync() {
        stringEvent.fireAsync("Fired message!");
        return "test output string";
    }


}