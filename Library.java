public class Library {
    public String bookName;
    public String authorName;
    public int quantity;

    public Library(String bookName, String authorName, int quantity) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("Book Name: "+bookName);
        System.out.println("Author name: "+authorName);
        System.out.println("Quantity's: "+quantity);
        System.out.println("---------------------------------------");
    }

    public void issueBook(int quantity) {
        if(quantity > 0) 
            {
                this.quantity -= quantity;
                System.out.println("Book issued successfully, Quantity: "+quantity);
            }
        else 
            System.out.println("Not available");
    }

    public void returnBook(int quantity) {
        this.quantity += quantity;
        System.out.println("Book returned successfully, Quantity: "+quantity);
    }


    public static void main(String[] args) {
        Library book1 = new Library("Java","Subin",20);
        Library book2 = new Library("C++","Jhonkar Mahabub",20);

        book1.display();
        book1.issueBook(4);
        book1.display();
        book2.issueBook(4);
       book2.display();
       book2.returnBook(2);

    }
}
