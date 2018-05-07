package com.example.mystore.utils;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by andre on 06/05/2018.
 */
@Component
public class PersonalDate {

    public String footerDate(Date data) {

        Locale en = new Locale("en");
        Locale aDefault = Locale.getDefault();

        SimpleDateFormat sdfEn = new SimpleDateFormat("EEE MMM d HH:mm:ss ", en);

        SimpleDateFormat sdfDefault = new SimpleDateFormat("z yyyy", aDefault);

        return sdfEn.format(data) + sdfDefault.format(data);

    }
}
