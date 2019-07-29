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

    public String testFireAsync() {
        stringEvent.fireAsync("Fired message!");
        return "test output string";
    }

}