public class BatteryCharger
{
  /** rateTable has 24 entries representing the charging costs for hours 0 through 23. */
  private int[] rateTable = new int[24];
  
  /* Constructs a BatteryCharger object and instantiates rateTable.
   * @param rateTable the array of charging costs for hour 0 through 23.
   */
  public BatteryCharger(int[] rateTable) {
     this.rateTable = rateTable;
  }
  
  /** Determines the total cost to charge the battery staring at the beginning of startHour.
    * @param startHour the hour at which the charge period begins.
    *        Precondition: 0 <= startHour <= 23
    * @param chargeTime the number of hours the battery needs to be charged
    *        Precondition: chargeTime > 0
    * @return the total cost to charge the battery.
    */
  private int getChargingCost(int startHour, int chargeTime) {
    int cost = 0;
    for (int hour = 0; hour < chargeTime; hour++) {
      int time = hour + startHour;
      cost += rateTable[time % rateTable.length];
    }
    return cost;
  }
  
  
  /** Determines start time to charge the battery at the lowest cost for the given charge time.
    * @param chargeTime the number of hours the battery needs to be charged
    *        Precondition: chargeTime > 0
    * @return an optimal start time, with 0 <= returned value <= 23
    */
  public int getChargeStartTime(int chargeTime) {
    int lowestCostHour = 0;
    int lowestCost =  getChargingCost(lowestCostHour, chargeTime);
    for (int hour = 1; hour < rateTable.length; hour++) {
      int cost = getChargingCost(hour, chargeTime);
      if (cost < lowestCost) {
        lowestCost = cost;
        lowestCostHour = hour;
      }
    }
    return lowestCostHour;
  }
  
  
}