class Book{
    private String title, author;
    private int id , price;
    
    public Book(int bookId, String name, int cost , String writter){
        this.id = bookId;
        this.title=name;
        this.price=cost;
        this.author=writter;
    }
    public void display(){
        System.out.println("Book Id : "+id+"\n"
        + "Title: "+title+"\n"
        + "Author: "+author+"\n"
        + "Price: "+price+"\n");

    }

    public static void main(String []arg){
        Book b1 = new Book(123,"Java for Beginners",947,"Jack Crowly");
        b1.display();
    }
}

