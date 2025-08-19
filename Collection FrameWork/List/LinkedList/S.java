package LinkedList;

import java.util.Scanner;

public class S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cenima [] cn = new Cenima[4];

        for(int i =0;i<cn.length;i++){

            int a =sc.nextInt();sc.nextLine();
            String b =sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d= sc.nextInt();sc.nextLine();

            cn[i] = new Cenima(a,b,c,d);
        }

        String dir = sc.nextLine();
        int rate = sc.nextInt();
        int bud = sc.nextInt();

        int ans1 = findAvgByDirctor(cn ,dir);

        if(ans1!=0)

                System.out.println(ans1);

        else
            System.out.println("Sory dir not found");


        int ans12 = getMovieByRatingBudget(cn ,rate,bud);

        if(ans12!=0)

            System.out.println(ans12);

        else
            System.out.println("Sory movie not found");
    }

    private static int getMovieByRatingBudget(Cenima[] cn, int rate, int bud) {

        for (int i =0; i<cn.length;i++){
            if(cn[i].getBudget()==bud && cn[i].getRating() ==rate && bud%rate==0)
                  return cn[i].getMovieId();

        }
     return 0;
    }

    public static int findAvgByDirctor(Cenima [] cn ,String dir){

        int sum =0; int count =0;

        for(int i =0;i<cn.length;i++){
            if(cn[i].getDirector().equalsIgnoreCase(dir)){
                sum+=cn[i].getBudget();
                count++;
            }
        }

        if(count>0)
            return  sum/count;
        else return 0;
    }

}

 class Cenima{

    private int movieId ,rating ,budget;
    private String director;

    public Cenima (int movieId,String director ,int rating ,int budget ){
        this.budget =budget;
        this.movieId =movieId;
        this.director=director;
        this.rating =rating;
    }

     public int getMovieId() {
         return movieId;
     }

     public void setMovieId(int movieId) {
         this.movieId = movieId;
     }

     public int getRating() {
         return rating;
     }

     public void setRating(int rating) {
         this.rating = rating;
     }

     public int getBudget() {
         return budget;
     }

     public void setBudget(int budget) {
         this.budget = budget;
     }

     public String getDirector() {
         return director;
     }

     public void setDirector(String director) {
         this.director = director;
     }
 }
