package deneme.radiobutton_ornegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioGroup cinsiyetRadioGroup;
    private RadioButton cinsiyetRadioButton;
    private Button secimiGosterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeVariables();
    }

    private void initializeVariables() {

        cinsiyetRadioGroup=(RadioGroup) findViewById(R.id.rg_cinsiyet);
        secimiGosterButton=(Button) findViewById(R.id.btn_secimi_goster);
        secimiGosterButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn_secimi_goster){

            int selectedId = cinsiyetRadioGroup.getCheckedRadioButtonId();

            cinsiyetRadioButton = (RadioButton) findViewById(selectedId);

            Toast.makeText(MainActivity.this,
                    cinsiyetRadioButton.getText(), Toast.LENGTH_SHORT).show();
        }
    }
}
