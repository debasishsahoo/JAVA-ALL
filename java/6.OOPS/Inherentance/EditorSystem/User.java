package Inherentance.EditorSystem;

public class User {
    public int id=1;
    public void printUsertype(){
        System.out.println("User");
    }
    
    public void savewebLink(){
        System.out.println("User: SaveWebLink");
    }

    // public void postAReview(){
    //     System.out.println("User: PostAReview");
    // }



    public Review postAReview(String ReviewText){
        System.out.println("User: PostAReview");
        Review review=new Review(ReviewText);
        return review;
    }

    
    
}
