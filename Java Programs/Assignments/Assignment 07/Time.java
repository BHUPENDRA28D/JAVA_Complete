class Time{
    int hr,min, sec;

    void setTime(int h, int m, int s){
        hr =h;
        min =m;
        sec =s;
    }
    void dispalyTime(){
        System.out.println("Time ----  " +hr+":"+min+":"+sec);
    }

 public static void main(String []args){
    Time t1 = new Time();
    t1.setTime(23,59,5);
    t1.dispalyTime();
 }
}