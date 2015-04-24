package dagger2test.nataliprograms.blogspot.com.dagger2demo;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by NataliLapshina on 24.04.2015.
 */
@Singleton
@Component(modules = {LocationModule.class})
public interface LocationComponent {

    /*
    Always use concrete class name
    Param type MainActivity activity
     */
    void inject(MainActivity activity);

    public final static class Inintializer {
        public static LocationComponent init(){
            return DaggerLocationComponent.builder().locationModule(new LocationModule()).build();
        }
    }

}
