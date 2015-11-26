package activities;


import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.example.alexandergodeke.signals.R;
import com.example.alexandergodeke.faltung.Signal;

/**
 * @autohr Alexander Gödeke
 */
public class MainActivity extends AppCompatActivity {

    private Button signal1button = null;
    private Button signal2button = null;
    private Button gobutton = null;
    private TextView signal1label = null;
    private TextView signal2label = null;
    private Signal signal1view = null;
    private Signal signal2view = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //signal1view = (Signal) this.findViewById(R.id.signal1view);
        //signal2view = (Signal) this.findViewById(R.id.signal2view);

        signal1label = (TextView) this.findViewById(R.id.signal1label);
        signal2label = (TextView) this.findViewById(R.id.signal2label);

        signal1button = (Button) this.findViewById(R.id.signal1button);
        signal2button = (Button) this.findViewById(R.id.signal2button);
        gobutton = (Button) this.findViewById(R.id.gobutton);


        //gobutton.setTextColor(Color.red(1));

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/


        /*GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6)
        });
        graph.addSeries(series);*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);


        signal1button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent nextScreen = new Intent(getApplicationContext(), AudioSignalActivity.class);
                startActivity(nextScreen);
            }
        });

        signal2button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent nextScreen = new Intent(getApplicationContext(), SignalActivity.class);
                startActivity(nextScreen);
            }
        });

        gobutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent nextScreen = new Intent(getApplicationContext(), AudioSignalActivity.class);
                startActivity(nextScreen);
            }
        });


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
