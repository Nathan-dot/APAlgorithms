package frq.cs2006;

public class Customer {
    private String name;
    private int idNum;
    public Customer(String name, int idNum) {
        this.name = name;
        this.idNum = idNum;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return idNum;
    }
    public int compareCustomer(Customer other) {
        int compare = this.name.compareTo(other.name);
        if(compare == 0) {
            compare = this.idNum - other.idNum;
        }
        return compare;
    }
    public static void prefixMerge(Customer[] list1, Customer[] list2, Customer[] result) {
        int i = 0;
        int j = 0;
        for(int k = 0; k < result.length; k++) {
            if(list1[i].compareCustomer(list2[j]) < 0) {
                result[k] = list1[i];
                i++;
            }
            else if(list1[i].compareCustomer(list2[j]) > 0) {
                result[k] = list2[j];
                j++;
            }
            else{
                result[k] = list1[i];
                i++;
                j++;
            }
        }
    }
}
