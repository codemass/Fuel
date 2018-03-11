package mydom.fuel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick (View v) {
        SeekBar FuelBalance = (SeekBar)findViewById(R.id.seekBarFuel);
        EditText Price = (EditText) findViewById(R.id.fuelPrice);
        TextView Total = (TextView) findViewById(R.id.result);

        int Balance = FuelBalance.getProgress();
        int PriceFl = Integer.parseInt(Price.getText().toString());
        int Sum = (43-((Balance*43)/12))*PriceFl;
        Total.setText(Sum);
    }
}
