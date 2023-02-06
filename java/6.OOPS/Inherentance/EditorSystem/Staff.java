package Inherentance.EditorSystem;

public class Staff extends User{
    public int id=2;
    public void printId(){
        System.out.println("id:"+id);
        System.out.println("Super id:"+super.id);
    }


    public void printUsertype(){
        System.out.println("Staff");
    }
    
    public Review postAReview(String ReviewText){
        System.out.println("Staff: PostAReview");
        Review review=super.postAReview(ReviewText);
        review.setApproved(true);
        return review;
    }
}
