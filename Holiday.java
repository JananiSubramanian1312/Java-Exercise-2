import java.io.*;
public class Holiday{
private String name;
private int day;
private String month;
public Holiday(String name, int day, String month)
{
this.name=name;
this.day=day;
this.month=month;
}
public Boolean isSameMonth(Holiday other)
{
return this.month.equals(other.month);
}
public static double avgDate(Holiday[] holidays)
{
int sum=0;
for(int i=0;i<holidays.length;i++)
{
sum+=holidays[i].day;
}
return(double) sum/holidays.length;
}
public static void main(String[] args)
{
Holiday independenceDay= new Holiday("Independence day",4,"July");
Holiday newyear=new Holiday("New Year",1,"January");
System.out.println(independenceDay.isSameMonth(newyear));
Holiday[] holidays = {independenceDay,newyear };
System.out.println(Holiday.avgDate(holidays));
}
}



