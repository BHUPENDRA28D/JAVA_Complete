class Question{
    private int quesNo;
    private String question,optionA,optionB,optionC,optionD;
    private char ans;

    public void setQuestion(int quesNo ,String question,String optionA,String optionB,String optionC,String optionD,char ans){
        this.quesNo =quesNo;
        this.question = question;
        this.optionA= optionA;
        this.optionB= optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.ans =ans;

    
    }
    public void display(){
    System.out.println("Question No: "+quesNo+"---> "+question+"\n"
    + "A) "+optionA+"\n"
    + "B) "+optionB+"\n"
    + "C) "+optionC+"\n"
    + "D) "+optionD+"\n"
    +"Answer : "+ans+"\n"
    );
    }
    public static void main(String []args){
        Question q1 = new Question();
        q1.setQuestion(11, "What is capital of United States ?","NewYork","Chicago","Captown","Washington Dc",'D');
        q1.display();
    }
}