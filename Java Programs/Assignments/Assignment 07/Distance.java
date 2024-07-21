class Distance {
    private int km,m,cm;
    public void setDistance(int km ,int m, int cm){
        this.km = km ;
        this.m = m ;
        this.cm = cm;
    }
    public void getDistance(){
        System.out.println("Kilometer : " +km+"\n"
        +"Meter     : "+m+"\n"
        + "Centimeter: "+cm+"\n");
    }
    public Distance addDistance(Distance d ){
        Distance temp=new Distance();
         temp.cm = cm +d.cm;
         temp.m = temp.cm /100+m+d.m;

         temp.cm = temp.cm%100;

         temp.km = temp.m/1000+km+d.km;
         temp.m = temp.m%1000;

        return temp;
    }
    public static void main(String []args){
        Distance dist1 = new Distance();
        Distance dist2 = new Distance();
        Distance dist3 ;
        dist1.setDistance(5,23,134);

        dist1.getDistance();
        dist2.setDistance(4,976,0);
        dist2.getDistance();
        dist3 = dist1.addDistance(dist2);         
        System.out.println("\nAfter adding two distance : ");
        dist3.getDistance();
    }
}