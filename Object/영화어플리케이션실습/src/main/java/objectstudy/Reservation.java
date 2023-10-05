package objectstudy;

/**
 * 예매의 역할 : ?
 *      책임 : ?
 */
public class Reservation {

    private Customer customer;
    private Screening screening;
    private Money fee;
    private int audienceCount;

    public Reservation(Customer customer, Screening screening, Money fee, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Money getFee() {
        return fee;
    }


}
