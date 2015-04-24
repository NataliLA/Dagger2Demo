package dagger2test.nataliprograms.blogspot.com.dagger2demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import javax.inject.Inject;


public class MainActivity extends Activity {

    @Inject
    LocationManager1 locationManager1;

    @Inject
    LocationManager2 locationManager2;

    private TextView textViewHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LocationComponent.Inintializer.init().inject(this);
        textViewHello = (TextView) findViewById(R.id.text_view_hello);
        textViewHello.setText(String.format("manager1 X= %1$s ; manager2 X= %2$s",locationManager1.getXCoordinate(),locationManager2.getXCoordinate() ));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
