package tcss450.uw.edu.gvtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class OverviewActivity extends AppCompatActivity implements View.OnLongClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                                     //not sure if this should be run here, or below setContentView
        setContentView(R.layout.activity_overview);
        setProgressLabel();
        init();
    }

    private void init() {
        TableLayout table = (TableLayout) findViewById(R.id.table);
        for (int i = 1; i < 100; i++) {
            TableRow t = new TableRow(this);
            TextView text = new TextView(this);
            text.setText("test");
            t.addView(text);
            t.setClickable(true);
            t.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewEntry(v);
                }
            });
            table.addView(t);
        }
    }

    private void setProgressLabel() {
        ProgressBar p = (ProgressBar) this.findViewById(R.id.progressBar3);
        TextView t = (TextView) this.findViewById(R.id.progressLabel);
        t.setText(p.getProgress() + "\\" + p.getMax());
    } //This *should* make the TextView over the progress bar be "current progress/maximum value"

    @Override
    public boolean onLongClick(View v) { //This is the start of trying to make a fragment show up when an item in the overview is tapped and held
        return false;
    }

    public void viewEntry(View view) {
        Log.d("print", "clicked");
    }
}
