package exam;

import java.util.ArrayList;

public class ReviewCollector {
    private ArrayList<ProductReview> reviewList;
    private ArrayList<String> productList;

    public ReviewCollector() {
        reviewList = new ArrayList<ProductReview>();
        productList = new ArrayList<String>();
    }


    public void addReview(ProductReview prodReview) {
        reviewList.add(prodReview);
        if(productList.indexOf(prodReview.getName()) == -1) {
            productList.add(prodReview.getName());
        }

    }

    public int getNumGoodReviews(String prodName) {
        int goods = 0;
        for(int i = 0; i < reviewList.size() - 1;i++) {
            if(prodName.equals(reviewList.get(i).getName())) {
                if(reviewList.get(i).getReview().contains("best")) {
                    goods++;
                }
            }
        }
        return goods;
    }
}
//If can somewhat change the logic of getNumGoodReviews:

// private ArrayList<ProductReview> getBestReviewsByProduct(String prodName) {}
// In the getNumGoodReviews method, I would create an Arraylist for integers and I would keep record of the index number
// of the "good review"(I would place it where the goods increment is now). I would also get rid of the goods local variable
// if possible and would change getNumGoodReviews' method header/change the method to return an arrayList.
// at the end of the method, I would return the Integer arrayList that stores all of the indexes of each good review.

// In the getBestReviewByProduct, I would use the method getNumGoodReview(String prodName), which would provide me
// all the indexes where the best reviews are. I would also create a local ArrayList variable
// and then create a while loop which would keep on going until the index ArrayList ran out of numbers. I would add
// only the good reviews to my new ArrayList using the .add and .get built in functions for arrayList. I would use
// something like: returnList.add(reviewList.get(i)) where i is a goodreview index number. after adding each number,
// i would remove that number from the arraylist and would return the goodReview list upon exiting the while loop.

// As mentioned previously, I would implement an ArrayList to store indexes of good reviews and I would also create
// another ArrayList to return, which would contain all the goodReviews(all copied from the reviewList ArrayList)

//Revised:

// private ArrayList<ProductReview> getBestReviewsByProduct(String prodName) {}
// I would change getNumGoodReviews by checking if it contained a String and incrementing to checking and actually return
// an ArrayList and adding the review to the final printed arraylist(this would be added where goods would be incremented)
// (The ArrayList would be returned in the exact same location where the local int variable goods is currently being returuned)
// (Also, the forloop would be kept and when the if statement is true, the ith index would be added)

// The goods local variable is no longer necessary as there is no need to count how many good reviews there are. After
// the creation of the goodReviews list, one can simply find the length of this list through the .size property of
// ArrayList and find how many goodReviews there are.

// As mentioned previously, I would implement an ArrayList to store indexes of good reviews and I would also create
// another ArrayList to return, which would contain all the goodReviews(all copied from the reviewList ArrayList)