package Assignemt;

import  java.util.Scanner;
public class A9{
    public void driver(){
        System.out.println( "Ques 1 Circle ");

        Circle c1 = new Circle();
        c1.setRadius(5.6);
        System.out.println("Radius = "+c1.getRadius());
        System.out.println("Area : "+c1.getArea());
        System.out.println("Circum : "+c1.getCircumfernce());

        System.out.println( "\n\nQues 2 Marksheet ");
        MarkSheet m1 = new MarkSheet();
        m1.setPhy(36);
        m1.setChe(41);
        m1.setMat(29);
        m1.setEng(36);
        m1.setHind(35);
        System.out.println("Marks Obtained in various Subject");
        System.out.println("Physics : "+m1.getPhy()+"\n"
        +"Chemistry : "+m1.getChe()+"\n"
        +"Mathematics : "+m1.getMat()+"\n"
        +"English : "+m1.getEng()+"\n"
        +"Hindi : "+m1.getHind()+"\n"
        );
        System.out.println("Maximum marks obtained is : "+m1.maxMarks());
        System.out.println("Avarage of  marks  is : "+m1.avgMarks());
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the avg. passing marks : ");
        Integer x = sc.nextInt();

        Boolean a = m1.passFail(x);
        if(a){
            System.out.println("Student is Pass \n");
        }else
             System.out.println("Student is Fail. \n");

    }

}

//Question 1.

class Circle {
    private Double radius;
    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }


    public  Double getArea(){ return  3.14*radius*radius;}
    public  Double getCircumfernce(){ return 2* 3.14*radius;}


}

//Question 2.


class MarkSheet {
    Integer phy,che,mat,eng,hind;

    public Integer getPhy() {
        return phy;
    }

    public void setPhy(Integer phy) {
        this.phy = phy;
    }

    public Integer getChe() {
        return che;
    }

    public void setChe(Integer che) {
        this.che = che;
    }

    public Integer getMat() {
        return mat;
    }

    public void setMat(Integer mat) {
        this.mat = mat;
    }

    public Integer getEng() {
        return eng;
    }

    public void setEng(Integer eng) {
        this.eng = eng;
    }

    public Integer getHind() {
        return hind;
    }

    public void setHind(Integer hind) {
        this.hind = hind;
    }


    public Integer maxMarks(){
        Integer max =0;

        if(max < phy)
            max = phy;

        if(max < che)
             max = che;
        if(max < mat)
             max = mat;
        if(max < eng)
            max =eng;
        if(max < hind)
             max = hind;

        return max;
    }
    public  Double avgMarks(){

        Double avg;
        avg = (phy+che+mat+eng+hind)/5.0;
        return  avg;
    }
    public Boolean passFail(Integer marks){
        if(avgMarks()>= marks)
            return  true;
        else
            return false;

    }




}
