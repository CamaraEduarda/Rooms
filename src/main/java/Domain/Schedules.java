package Domain;

import Enum.DayOFTheWeek;

public class Schedules {
  
  private int id;
  private DayOFTheWeek day_of_the_week;
  private int star_time;
  private int end_time;

  public Schedules(int id, DayOFTheWeek day_of_the_week, int star_time, int end_time){
    this.id = id;
    this.day_of_the_week = day_of_the_week;
    this.star_time = star_time;
  }

  public int getId() {
    return this.id;
  }
  public DayOFTheWeek getDay_of_the_week() {
    return this.day_of_the_week;
  }
  public int getStar_time() {
    return this.star_time;
  }

  public int getEnd_time() {
    return end_time;
  }
  
  
}