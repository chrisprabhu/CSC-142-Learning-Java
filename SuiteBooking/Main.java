
/**
 * Write a description of class Main here.
 *
 * @author Chris Prabhu
 * @version 2023-09-10
 */
public class Main
{
    public static void main(String[] args) {

        // Create the array to hold the status
        Status[][] suiteStatus = new Status[12][31]; 

        // Set initial status
        for (int month = 0; month < 12; month++) {
            for (int day = 0; day < 31; day++) {
                suiteStatus[month][day] = Status.OPEN;
            }
        }
        setNaDays(suiteStatus, 2016);
        
        // set a booking
        setBooking(suiteStatus, 2, 14, Status.BOOKED);
        
        // check some statuses
        System.out.println("status for 2/13: " + checkBooking(suiteStatus,2,13));
        System.out.println("status for 2/14: " + checkBooking(suiteStatus,2,14));
        System.out.println("status for 2/31: " + checkBooking(suiteStatus,2,31));
        

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param   statusArray     the two-dimensional status array containing bookings  
     * @param   month           the month of the booking
     * @param   day             the day of the booking
     * @param   status          the Status to set to the booking
     * @throws  IllegalArgumentException if the day or month is out of range
     */
    public static void setBooking(Status[][] statusArray, int month, int day, Status status)
    {
        if (month < 1 || month > 12 || day < 1 || day > 31 || statusArray[month-1][day-1] == Status.NA) {
            throw new IllegalArgumentException("Invalid month or day specified");
        }
        statusArray[month-1][day-1] = status; 
    }
    
        /**
     * An example of a method - replace this comment with your own
     *
     * @param   statusArray     the two-dimensional status array containing bookings  
     * @param   month           the month of the booking
     * @param   day             the day of the booking
     * @param   status          the Status to set to the booking
     * @throws  IllegalArgumentException if the day or month is out of range
     */
    public static Status checkBooking(Status[][] statusArray, int month, int day)
    {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            throw new IllegalArgumentException("Invalid month or day specified");
        }
        return statusArray[month-1][day-1];
    }

    /**
     * Sets to NA all days that aren't real calendar days
     *
     * @param  statusArray  the two-dimensional array containing bookings
     * @return      year    the year for bookings (important for leap year considerations)
     */
    public static void setNaDays(Status[][] statusArray, int year)
    {
        // set for all years
        setBooking(statusArray,  2, 30, Status.NA);
        setBooking(statusArray,  2, 31, Status.NA);
        setBooking(statusArray,  4, 31, Status.NA);
        setBooking(statusArray,  6, 31, Status.NA);
        setBooking(statusArray,  9, 31, Status.NA);
        setBooking(statusArray, 11, 31, Status.NA);
        
        // handle leap year specifics
        if (year % 4 != 0) {
            setBooking(statusArray,  2, 29, Status.NA);
        }
    }
    


}
