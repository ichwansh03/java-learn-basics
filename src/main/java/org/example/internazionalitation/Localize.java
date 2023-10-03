package org.example.internazionalitation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Localize {

    public static void main(String[] args) {
        var lang = "in";
        var state = "IR";

        var locale = new Locale(lang, state);

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());

        getResourceBundle();

        dateFormat();
    }

    static void getResourceBundle(){
        var locale = new Locale("ir","IR");
        var bundle = ResourceBundle.getBundle("message", locale);

        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good_morning"));
    }

    static void dateFormat(){
        var dateFormat = new SimpleDateFormat("EEEE, dd MMMM yyyy", new Locale("id","ID"));
        var format = dateFormat.format(new Date());
        System.out.println(format);

        try {
            var dateParse = dateFormat.parse("Selasa, 3 Oktober 2023");
            System.out.println(dateParse);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
