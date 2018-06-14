package mydom.fuel;

import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;

public class ColorText {
    public static SpannableStringBuilder txtColorFuelResult (String sFuelCurrent) {
        //Результаты первой строки (литры)
        SpannableStringBuilder txtInTank = new SpannableStringBuilder("В баке осталось ");
        SpannableStringBuilder txtresultL = new SpannableStringBuilder(sFuelCurrent);
        SpannableStringBuilder txtliters = new SpannableStringBuilder(" л.");
        SpannableStringBuilder resultLitersLeft = new SpannableStringBuilder();

        txtresultL.setSpan(new ForegroundColorSpan(Color.YELLOW), 0, sFuelCurrent.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); //Желтый цвет литров. Start 0 - откуда, sFuelCurrent.length() - до куда пометить цветом
        txtresultL.setSpan(new StyleSpan(android.graphics.Typeface.BOLD), 0, sFuelCurrent.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);  //Толстый стиль текста литров

        return resultLitersLeft.append(txtInTank).append(txtresultL).append(txtliters); //Собираем все строки в единую переменную
    }

    public static SpannableStringBuilder txtColorPriceResult (String sSum) { //Метод в качесте параметра принимает переменую sSum из MainActivity, т.к. тут эта непеменая не доступна
        //Результаты второй строки (цена, руб.)
        SpannableStringBuilder txtForFullTank = new SpannableStringBuilder("До полного бака ");
        SpannableStringBuilder txtSum = new SpannableStringBuilder(sSum);
        SpannableStringBuilder txtRub = new SpannableStringBuilder(" руб.");
        SpannableStringBuilder resultForFullTankRub = new SpannableStringBuilder();

        txtSum.setSpan(new ForegroundColorSpan(Color.YELLOW), 0, sSum.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        txtSum.setSpan(new StyleSpan(android.graphics.Typeface.BOLD), 0, sSum.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        return resultForFullTankRub.append(txtForFullTank).append(txtSum).append(txtRub); //Собираем все строки в единую переменную
    }
}
