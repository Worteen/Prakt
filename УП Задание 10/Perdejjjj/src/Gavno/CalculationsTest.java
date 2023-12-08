package Gavno;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest {

    @Test
    void availablePeridos() {
        Calculations calculations = new Calculations();
        LocalTime[] start_time = new LocalTime[]{};
        LocalTime.of(10, 0, 0, 0);
    };
    int[] durations = new int[]{60, 30, 10, 10, 40};
    String[] expected = new String[]{
            "08:00-08:30" +
                    "08:30-09:00" +
                    "09:00-09:30" +
                    "09:30-10:00" +
                    "11:30-12:00" +
                    "12:00-12:30" +
                    "12:30-13:00" +
                    "13:00-13:30" +
                    "13:30-14:00" +
                    "14:00-14:30" +
                    "14:30-15:00" +
                    "15:40-16:10" +
                    "16:10-16:40" +
                    "17:30-18:00"


    };
    LocalTime beginWorkingTime= LocalTime.of(8,0);
    LocalTime endWorkingTime=LocalTime.of(10,0);
    int consultationTime=30;{
    }
}

