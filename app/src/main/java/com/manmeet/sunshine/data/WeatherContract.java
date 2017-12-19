package com.manmeet.sunshine.data;

import android.provider.BaseColumns;

/**
 * Defines table and column names for the weather database. This class is not necessary, but keeps
 * the code organized.
 */
public class WeatherContract {

    public final static class WeatherEntry implements BaseColumns {

        public static final String TABLE_NAME= "weather";
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_WEATHER_ID = "weather_id";
        /* Min and max temperatures in °C for the day (stored as floats in the database) */
        public static final String COLUMN_MIN_TEMP = "min";
        public static final String COLUMN_MAX_TEMP = "max";
        /* Humidity is stored as a float representing percentage */
        public static final String COLUMN_HUMIDITY = "humidity";
        /* Pressure is stored as a float representing percentage */
        public static final String COLUMN_PRESSURE = "pressure";
        /* Wind speed is stored as a float representing wind speed in mph */
        public static final String COLUMN_WIND_SPEED = "wind";
        /*
         * Degrees are meteorological degrees (e.g, 0 is north, 180 is south).
         * Stored as floats in the database.
         *
         * Note: These degrees are not to be confused with temperature degrees of the weather.
         */
        public static final String COLUMN_DEGREES = "degrees";
        }
}