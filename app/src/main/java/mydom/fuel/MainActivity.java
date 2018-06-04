package mydom.fuel;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
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
        SeekBar FuelBalance = (SeekBar)findViewById(R.id.seekBar);
        EditText Price = (EditText) findViewById(R.id.fuelPrice);
        TextView FuelCurrentText = (TextView) findViewById(R.id.textView2);
        TextView Total = (TextView) findViewById(R.id.result);
        int textColor = ContextCompat.getColor(this, R.color.solarisWhite); //Получаем доступ в color.xml к нужному цвету



        if (Price.getText().toString().trim().isEmpty()) {  //trim() - удяляем начальные и конечные пробелы, isEmpty() - проверка на пустоту
            FuelCurrentText.setText("Введите цену бензина"); //Выводит надпись, если цена пустая
            FuelCurrentText.setTextColor(Color.parseColor("#ff4d4d")); //Назначает этой надписи красный цвет

        }
        else {
            FuelCurrentText.setTextColor(textColor); //Это делается затем, что выше, в if срабатывает изменение цвета текста и сколько в баке уже выводит красным. Так возвращаем solarisWhite.

            float Balance = FuelBalance.getProgress();
            float PriceFl = Float.parseFloat(Price.getText().toString());
            float Tank = 43f; //Объем бака у Соляриса.
            float FuelCurrent = (Balance*Tank)/12; //Сколько бензина осталось в баке.
            float Sum = (Tank-FuelCurrent)*PriceFl;

            FuelCurrentText.setText("В баке осталось "+String.format("%.1f",FuelCurrent)+" л.");
            Total.setText("До полного бака "+String.format("%.0f", Sum)+" руб.");
        }


    }
}
