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
        TextView FuelCurrentText = (TextView) findViewById(R.id.textView2);
        TextView Total = (TextView) findViewById(R.id.result);

        int Balance = FuelBalance.getProgress();
        int PriceFl = Integer.parseInt(Price.getText().toString());
        int Tank = 43; //Объем бака у Соляриса.
        int FuelCurrent = (Balance*Tank)/12; //Сколько бензина осталось в баке.
        int Sum = (Tank-FuelCurrent)*PriceFl;

        FuelCurrentText.setText("В баке осталось "+String.valueOf(FuelCurrent)+" л.");
        Total.setText("До полного бака "+String.valueOf(Sum)+" руб.");
    }
}
