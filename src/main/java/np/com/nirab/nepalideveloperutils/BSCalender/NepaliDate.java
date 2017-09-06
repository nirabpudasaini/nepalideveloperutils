package np.com.nirab.nepalideveloperutils.BSCalender;

import android.content.Context;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;

import java.util.Date;
import java.util.HashMap;

import np.com.nirab.nepalideveloperutils.R;

public class NepaliDate {

    private int mYear, mMonth, mDayOfMonth, mDayofWeek, mHourOfDay, mMinute, mSecond, mMillisecond;
    private String mMonthString, mDayString;
    private Context mContext;

    HashMap<Integer, int[]> daysInMonths = new HashMap<>();


    public NepaliDate(Context c) {
        this.mContext = c;
        DateTime date = new DateTime();
        init(date);
    }

    public NepaliDate(Context c, Date date){
        this.mContext = c;
        DateTime dateTime = new DateTime(date);
        init(dateTime);
    }

    public NepaliDate(Context c, int enYear, int enMonth, int enDay){
        this.mContext = c;
        DateTime date = new DateTime(enYear,enMonth,enDay,0,0);
        init(date);

    }

    public void init(DateTime date){
        daysInMonths.put(2000, new int[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        daysInMonths.put(2001, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2002, new int[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2003, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonths.put(2004, new int[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        daysInMonths.put(2005, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2006, new int[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2007, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonths.put(2008, new int[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31});
        daysInMonths.put(2009, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2010, new int[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2011, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonths.put(2012, new int[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});
        daysInMonths.put(2013, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2014, new int[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2015, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonths.put(2016, new int[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});
        daysInMonths.put(2017, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2018, new int[]{31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2019, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        daysInMonths.put(2020, new int[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2021, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2022, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30});
        daysInMonths.put(2023, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        daysInMonths.put(2024, new int[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2025, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2026, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonths.put(2027, new int[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        daysInMonths.put(2028, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2029, new int[]{31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2030, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonths.put(2031, new int[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        daysInMonths.put(2032, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2033, new int[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2034, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonths.put(2035, new int[]{30, 32, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31});
        daysInMonths.put(2036, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2037, new int[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2038, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonths.put(2039, new int[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});
        daysInMonths.put(2040, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2041, new int[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2042, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonths.put(2043, new int[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});
        daysInMonths.put(2044, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2045, new int[]{31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2046, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonths.put(2047, new int[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2048, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2049, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30});
        daysInMonths.put(2050, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        daysInMonths.put(2051, new int[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2052, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2053, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30});
        daysInMonths.put(2054, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        daysInMonths.put(2055, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2056, new int[]{31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2057, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonths.put(2058, new int[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        daysInMonths.put(2059, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2060, new int[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2061, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonths.put(2062, new int[]{30, 32, 31, 32, 31, 31, 29, 30, 29, 30, 29, 31});
        daysInMonths.put(2063, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2064, new int[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2065, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonths.put(2066, new int[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31});
        daysInMonths.put(2067, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2068, new int[]{31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2069, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonths.put(2070, new int[]{31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30});
        daysInMonths.put(2071, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2072, new int[]{31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2073, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31});
        daysInMonths.put(2074, new int[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2075, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2076, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30});
        daysInMonths.put(2077, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31});
        daysInMonths.put(2078, new int[]{31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2079, new int[]{31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30});
        daysInMonths.put(2080, new int[]{31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30});
        daysInMonths.put(2081, new int[]{31, 31, 32, 32, 31, 30, 30, 30, 29, 30, 30, 30});
        daysInMonths.put(2082, new int[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30});
        daysInMonths.put(2083, new int[]{31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30});
        daysInMonths.put(2084, new int[]{31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30});
        daysInMonths.put(2085, new int[]{31, 32, 31, 32, 30, 31, 30, 30, 29, 30, 30, 30});
        daysInMonths.put(2086, new int[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30});
        daysInMonths.put(2087, new int[]{31, 31, 32, 31, 31, 31, 30, 30, 29, 30, 30, 30});
        daysInMonths.put(2088, new int[]{30, 31, 32, 32, 30, 31, 30, 30, 29, 30, 30, 30});
        daysInMonths.put(2089, new int[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30});
        daysInMonths.put(2090, new int[]{30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30});

        DateTime base = new DateTime(1944,1,1,0,0);

        long daysBetween = Days.daysBetween(base,date).getDays();

        int nepaliYear = 2000;
        int nepaliMonth = 9;
        int nepaliDay = 17;

        int dayOfWeek = 7; //Base date is Saturday, which is 7

        while (daysBetween != 0) {
            int daysInMonth = daysInMonths.get(nepaliYear)[nepaliMonth - 1];
            nepaliDay++;
            if (nepaliDay > daysInMonth) {
                nepaliMonth++;
                nepaliDay = 1;
            }
            if (nepaliMonth > 12) {
                nepaliYear++;
                nepaliMonth = 1;
            }
            dayOfWeek++;
            if (dayOfWeek > 7) {
                dayOfWeek = 1;
            }
            daysBetween--;
        }
        this.mYear = nepaliYear;
        this.mMonth = nepaliMonth;
        this.mMonthString = getMonthString(nepaliMonth);
        this.mDayOfMonth = nepaliDay;
        this.mDayofWeek = dayOfWeek;
        this.mDayString = getDayString(dayOfWeek);
        this.mHourOfDay = date.getHourOfDay();
        this.mMinute = date.getMinuteOfHour();
        this.mSecond = date.getSecondOfMinute();
        this.mMillisecond = date.getMillisOfSecond();
    }

    public String getMonthString(int month){
        switch (month){
            case 1:
                return mContext.getString(R.string.ndu_baishakh);
            case 2:
                return mContext.getString(R.string.ndu_jestha);
            case 3:
                return mContext.getString(R.string.ndu_asar);
            case 4:
                return mContext.getString(R.string.ndu_shrawan);
            case 5:
                return mContext.getString(R.string.ndu_bhadau);
            case 6:
                return mContext.getString(R.string.ndu_aswin);
            case 7:
                return mContext.getString(R.string.ndu_kartik);
            case 8:
                return mContext.getString(R.string.ndu_mansir);
            case 9:
                return mContext.getString(R.string.ndu_poush);
            case 10:
                return mContext.getString(R.string.ndu_magh);
            case 11:
                return mContext.getString(R.string.ndu_falgun);
            case 12:
                return mContext.getString(R.string.ndu_chaitra);
            default:
                return "Error";
        }
    }

    public String getDayString(int day){
        switch (day){
            case 1:
                return mContext.getString(R.string.ndu_sunday);
            case 2:
                return mContext.getString(R.string.ndu_monday);
            case 3:
                return mContext.getString(R.string.ndu_tuesday);
            case 4:
                return mContext.getString(R.string.ndu_wednesday);
            case 5:
                return mContext.getString(R.string.ndu_thrusday);
            case 6:
                return mContext.getString(R.string.ndu_friday);
            case 7:
                return mContext.getString(R.string.ndu_saturday);
            default:
                return "Error";
        }
    }



    public int getYear() {
        return mYear;
    }

    public void setYear(int mYear) {
        this.mYear = mYear;
    }

    public int getMonth() {
        return mMonth;
    }

    public void setMonth(int mMonth) {
        this.mMonth = mMonth;
    }

    public int getDayOfMonth() {
        return mDayOfMonth;
    }

    public void setDayOfMonth(int mDayOfMonth) {
        this.mDayOfMonth = mDayOfMonth;
    }

    public int getDayOfWeek() {
        return mDayofWeek;
    }

    public void setDayOfWeek(int mDayofWeek) {
        this.mDayofWeek = mDayofWeek;
    }

    public int getHourOfDay() {
        return mHourOfDay;
    }

    public void setHourOfDay(int mHourOfDay) {
        this.mHourOfDay = mHourOfDay;
    }

    public int getMinute() {
        return mMinute;
    }

    public void setMinute(int mMinute) {
        this.mMinute = mMinute;
    }

    public int getSecond() {
        return mSecond;
    }

    public void setSecond(int mSecond) {
        this.mSecond = mSecond;
    }

    public int getMillisecond() {
        return mMillisecond;
    }

    public void setMillisecond(int mMillisecond) {
        this.mMillisecond = mMillisecond;
    }



}