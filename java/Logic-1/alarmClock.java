public String alarmClock(int day, boolean vacation) {

  if (day>=1 && day<=5 && vacation==false)
  {
  return "7:00";
  }
  else if ((day==0 || day==6)&&vacation==false)
  {
  return "10:00";
  }
  else if (day>=1 && day<=5 && vacation==true)
  {
  return "10:00";
  }
  else
  {
  return "off";
  }
  
}
