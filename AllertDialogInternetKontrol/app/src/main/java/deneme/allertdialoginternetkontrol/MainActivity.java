package deneme.allertdialoginternetkontrol;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.audiofx.BassBoost;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnWeb=(Button) findViewById(R.id.btn_web);
        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!Utility.hasInternetConnection(getApplicationContext())){

                    AlertDialog.Builder alertOlustur=new AlertDialog.Builder(MainActivity.this);

                    alertOlustur.setTitle("Uyarı")
                            .setMessage("İnternet Bağlantınız Yok ")
                            .setNegativeButton("Uygulamadan Çık", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                    finish();
                                }
                            })
                            .setPositiveButton("Ayarlara Git", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    startActivity(new Intent(Settings.ACTION_SETTINGS));
                                }
                            });

                    alertOlustur.create().show();
                    }
                    else{
                    Toast.makeText(getApplicationContext(),"İnternet Var",Toast.LENGTH_SHORT).show();
                }
                }


        });
    }
}
