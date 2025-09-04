public class UserReview{
    int reviewId;
    int productId;
    String userName;
    String comment;
    int rating;

    UserReview(int reviewId, int productId, String userName, String comment, int rating){
        this.reviewId = reviewId;
        this.productId = productId;
        this.userName = userName;
        this.comment = comment;
        this.rating = rating;
    }

    void displayReview(){
        System.out.println("--User Review Details---");
        System.out.println("Review ID: " + reviewId);
        System.out.println("Product ID: " + productId);
        System.out.println("User Name: " + userName);
        System.out.println("Comment: " + comment);
        System.out.println("Rating: " + rating + "/5");
        System.out.println("------------------------");
    }
}