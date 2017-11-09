package com.example.temperatureconverter;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;

public class ConverterUtil {
    // converts to celsius
    public static float convertFahrenheitToCelsius(float fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9);
    }

    // converts to fahrenheit
    public static float convertCelsiusToFahrenheit(float celsius) {
        return ((celsius * 9) / 5) + 32;
    }

    public static Intent getIntentWithExtra(Context context, String key, String value) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra(key, value);
        return intent;
    }



}
