public class ExposingImmutableFields {
    // While it’s never a good idea for a public class to expose fields directly, it is
    //less harmful if the fields are immutable. You can’t change the representation of
    //such a class without changing its API, and you can’t take auxiliary actions when
    //a field is read, but you can enforce invariants. For example, this class guarantees
    //that each instance represents a valid time:
    // Public class with exposed immutable fields - questionable
    public final class Time {
        private static final int HOURS_PER_DAY = 24;
        private static final int MINUTES_PER_HOUR = 60;
        public final int hour;
        public final int minute;
        public Time(int hour, int minute) {
            if (hour < 0 || hour >= HOURS_PER_DAY)
                throw new IllegalArgumentException("Hour: " + hour);
            if (minute < 0 || minute >= MINUTES_PER_HOUR)
                throw new IllegalArgumentException("Min: " + minute);
            this.hour = hour;
            this.minute = minute;
        } // Remainder omitted
    }
}