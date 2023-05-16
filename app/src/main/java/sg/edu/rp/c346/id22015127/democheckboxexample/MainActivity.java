package sg.edu.rp.c346.id22015127.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;

    private double calcPay(double price, double discount){
        double pay = price * (1 - discount/100);
        return pay;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbEnabled = findViewById(R.id.checkBoxDiscount);
        btnCheck = findViewById(R.id.buttonCheck);
        tvShow = findViewById(R.id.showTextView);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MainActivity", "Inside onClick()");
                Toast.makeText(MainActivity.this, "Loading...", Toast.LENGTH_SHORT).show();
                if (cbEnabled.isChecked()==true){
                    double pay = calcPay(100,20);
                    tvShow.setText("The discount is given. You need to pay "+pay);
                }else{
                    double pay = calcPay(100, 0);
                    tvShow.setText("The discount is not given. You need to pay "+pay);
                }
            }
        });
    }
}