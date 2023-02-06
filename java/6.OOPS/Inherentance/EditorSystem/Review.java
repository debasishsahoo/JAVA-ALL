package Inherentance.EditorSystem;

public class Review {
    private String reviewText;
    private boolean approved;


    public Review(String ReviewText){
        this.reviewText=ReviewText;
    }

    public boolean isApproved(){
        return approved;
    }

    public void setApproved(boolean approved){
        this.approved=approved;

    }
    
}
