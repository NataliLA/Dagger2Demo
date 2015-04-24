package dagger2test.nataliprograms.blogspot.com.dagger2demo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by NataliLapshina on 24.04.2015.
 */
@Module
public class LocationModule {

    @Provides @Singleton
    LocationManager1 provideLocationManager1(){
        return new LocationManager1();
    }

    @Provides @Singleton
    LocationManager2 provideLocationManager2(){
        return new LocationManager2();
    }
}
