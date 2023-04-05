//package weather;

import java.util.*;
public class weather {

public static void main(String[] args) {

int number,day;

double highTemp,lowTemp,amtRain,amtSnow;

Scanner in = new Scanner(System.in);        //for input

WeatherReport[] arr = new WeatherReport[20];        //array named WeatherReport of size 20

WeatherReport obj = new WeatherReport();         //object as obj of class WeatherReport

System.out.println("Enter the number of days : ");

number = in.nextInt();           

for(int i=0;i<number;i++)

{

System.out.println("Enter the day number : ");

day = in.nextInt();       

System.out.println("Enter the high temperature : ");

highTemp = in.nextDouble();

System.out.println("Enter the low temperature : ");

lowTemp = in.nextDouble();

System.out.println("Enter the amount of rain : ");

amtRain = in.nextDouble();

System.out.println("Enter the amount of snow : ");

amtSnow = in.nextDouble();

arr[i] = new WeatherReport(day,highTemp,lowTemp,amtRain,amtSnow);

}

obj.avgH(arr,number);              //method for calculating average of high temperature

obj.avgL(arr,number);       //method for calculating average of low temperature

obj.avgAr(arr,number);      //method for calculating average of amount of rain

obj.avgS(arr,number);          //method for calculating average of amount of snow

in.close();                  //taking input has closed now

}

}

class WeatherReport{

double d,high,low,rain,snow;                   //variables of class

WeatherReport()      //default constructor

{

d=0;

high=0;

low=0;

rain=0;

snow=0;

}

WeatherReport(int day,double highTemp,double lowTemp,double amtRain,double amtSnow)     //parameterised constructor

{

d=day;

high=highTemp;

low=lowTemp;

rain=amtRain;

snow=amtSnow;

}

public void avgH(WeatherReport[] arr,int number) {

double sum=0;

for(int i=0;i<number;i++)

{

sum=sum+arr[i].high;

}

double avg = sum/number;

System.out.println("Average high temperature is : " + avg);

}

public void avgL(WeatherReport[] arr,int number) {

double sum=0;

for(int i=0;i<number;i++)

{

sum=sum+arr[i].low;

}

double avg = sum/number;

System.out.println("Average low temperature is : " + avg);

}

public void avgAr(WeatherReport[] arr,int number) {

double sum=0;

for(int i=0;i<number;i++)

{

sum=sum+arr[i].rain;

}

double avg = sum/number;

System.out.println("Average amount rain is : " + avg);

}

public void avgS(WeatherReport[] arr,int number) {

double sum=0;

for(int i=0;i<number;i++)

{

sum=sum+arr[i].snow;

}

double avg = sum/number;

System.out.println("Average amount snow is : " + avg);

}

}
