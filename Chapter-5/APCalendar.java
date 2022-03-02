public class APCalendar {
  private static boolean isLeapYear(int year) {
    return year > 1582 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
  }
  
  public static int numberOfLeapYears(int year1, int year2) {
    int leapYears = 0;
    for (int year = year1; year <= year2; year++) {
      if (isLeapYear(year)) {
        leapYears++;
      }
    }
    return leapYears;
  }
  
  private static int firstDayOfYear(int year) {
    return (5 + year - 1582 + numberOfLeapYears(1582, year - 1)) % 7;
  }
  
  private static int dayOfYear(int month, int day, int year) {
    int totalDays = 0;
    int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    if (isLeapYear(year)) {
      daysInMonths[1] = 29;
    }
    for (int i = 0; i < month - 1; i++) {
      totalDays += daysInMonths[i];
    }
    totalDays += day;
    return totalDays;    
  }
  
  public static int dayOfWeek(int month, int day, int year) {    int firstDay = firstDayOfYear(year);
    int currentDay = dayOfYear(month, day, year) - 1;
    return (currentDay + firstDay) % 7;
  }
}