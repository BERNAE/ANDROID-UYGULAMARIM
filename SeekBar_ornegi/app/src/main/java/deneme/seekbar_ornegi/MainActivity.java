package deneme.seekbar_ornegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar volumeSeekBar;
    private TextView showSeekBarValueTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nesneler();



        volumeSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            int progress = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                progress = progressValue;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                showSeekBarValueTextView.setText("Ses: " + progress + "/" + seekBar.getMax());



            }
        });


    }

    private void nesneler() {
        volumeSeekBar = (SeekBar) findViewById(R.id.seekbar_volume);
        showSeekBarValueTextView = (TextView) findViewById(R.id.tv_show_seekbar_value);
        showSeekBarValueTextView.setText("Ses: " + volumeSeekBar.getProgress() + "/" + volumeSeekBar.getMax());

    }
}
