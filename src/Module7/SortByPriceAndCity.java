package Module7;


import java.util.Comparator;

public class SortByPriceAndCity implements Comparator<Order> {


    @Override
    public int compare(Order o1, Order o2) {
        int compare = Integer.compare(o1.getPrice(), o2.getPrice());
        if (compare != 0) {
            return compare;
        }
        return o1.getUser().getCity().compareTo(o2.getUser().getCity());
    }
}
