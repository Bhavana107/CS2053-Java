class Books{
public String Bname;
public int pages;
public String author;
public String Gerne;

public Books (String Bname, int pages, String author, String Gerne){
this.Bname= Bname;
this.pages=pages;
this.author=author;
this.Gerne=Gerne;
}

public void display(){
System.out.println("Book name is:" + Bname);
System.out.println("Number of pages:" + pages);
System.out.println("Author name is:" + author);
System.out.println("Gerne of the book is:" + Gerne);
}}

public class Prog1{
public static void main(String [] args){
Books book= new Books("Jungle book",300, "JK", "Kids");
book.display();
}}
