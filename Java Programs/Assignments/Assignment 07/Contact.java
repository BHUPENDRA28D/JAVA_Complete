class Contact {
    private int id ;
    private String mobileNo, firstName, lastName,emailld;

    public void setContactInfo(int id , String phone, String firstName,String lastName,String email){
        this.id = id ;
        this.mobileNo = phone;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailld= email;
    }
  public void getContactInfo(){
    System.out.println(
        "ID : "+id+ "\n"
       + "Phone Number : "+mobileNo+"\n"
       + "Name : "+firstName+" "+ lastName+"\n"
       + "Email : "+emailld+"\n");
  }
  public static void main(String [] args){
    Contact c1 = new Contact();
    c1.setContactInfo(12,"7869449495","Ravi","Shukla","ravishukla123@gmail.com");
    c1.getContactInfo();
  }
}