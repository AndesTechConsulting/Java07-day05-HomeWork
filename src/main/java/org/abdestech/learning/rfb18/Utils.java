package org.abdestech.learning.rfb18;

import java.util.Calendar;

class Utils {

    static short currentYear() {
        Calendar currentMoment = Calendar.getInstance();
        short cYear = (short) currentMoment.get(Calendar.YEAR);
        return cYear;
    }
}
