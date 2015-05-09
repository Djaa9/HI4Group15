package djaa9.dk.thepage.hi4group15;

import com.google.inject.Binder;
import com.google.inject.Module;

public class RoboModule implements Module {

    @Override
    public void configure(Binder binder) {
    binder.bind(IFoo.class).toInstance(new Foo());
    }
}
