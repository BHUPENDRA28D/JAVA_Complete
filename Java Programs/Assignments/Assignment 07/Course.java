class Course{
    private String courseName,courseDuration;
    private int courseId,course_fee;

public void setCourseDetail(int courseId,String courseName,String courseDuration,int course_fee)
{ 
    this.courseName=courseName;
    this.courseDuration = courseDuration;
    this.courseId = courseId;
    this.course_fee = course_fee;

}
 
   public void getDetail(){
    System.out.println("CourseId : " +courseId+"\n"
    +"Course Name : "+courseName+"\n"
    +"Duration of the Course : "+courseDuration+"\n"
    +"Fee for the Course : "+course_fee+"\n");
    
   }
   public static void main(String []args){
    Course c1 = new Course();
    c1.setCourseDetail(87,"Full Stack Development with JavaScript","8 Months",12499);
    c1.getDetail();
   }
}