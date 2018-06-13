package mydom.fuel;

import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;

public class ColorText {
    public static SpannableStringBuilder txtColorFuelResult (String sFuelCurrent) {
        //Первая строка (литры)
        SpannableStringBuilder txtInTank = new SpannableStringBuilder("В баке осталось ");
        SpannableStringBuilder txtresultL = new SpannableStringBuilder(sFuelCurrent);
        SpannableStringBuilder txtliters = new SpannableStringBuilder(" л.");
        SpannableStringBuilder resultLitersLeft = new SpannableStringBuilder();

        txtresultL.setSpan(new ForegroundColorSpan(Color.YELLOW), 0, sFuelCurrent.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); //Желтый цвет литров
        txtresultL.setSpan(new StyleSpan(android.graphics.Typeface.BOLD), 0, sFuelCurrent.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);  //Толстый стиль текста литров

        return resultLitersLeft.append(txtInTank).append(txtresultL).append(txtliters); //Собираем все строки в единую переменную
    }

    public SpannableStringBuilder txtColorPriceResult (String sSum) {
        //Вторая строка (цена, руб.)
        SpannableStringBuilder txtForFullTank = new SpannableStringBuilder("До полного бака ");
        SpannableStringBuilder txtSum = new SpannableStringBuilder(sSum);
        SpannableStringBuilder txtRub = new SpannableStringBuilder(" руб.");
        SpannableStringBuilder resultForFullTankRub = new SpannableStringBuilder();

        txtSum.setSpan(new ForegroundColorSpan(Color.YELLOW), 0, sSum.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        txtSum.setSpan(new StyleSpan(android.graphics.Typeface.BOLD), 0, sSum.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        return resultForFullTankRub.append(txtForFullTank).append(txtSum).append(txtRub); //Собираем все строки в единую переменную
    }
}
