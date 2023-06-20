package movie_reservation.online_movie_reserv_project;

public class Money {
    private final BigDecimal amount;

    public static final Money ZERO = Money.wons();
    
    public static Money wons(long amount){
        return new Money();
    };

    public static Money wons(double amount){
        return new Money();
    };

    public Money(BigDecimal amount){
        this.amount = amount;
    }
    // BigDecimal type ADD()
    public Money plus(Money amount){
        return new Money(this.amount.add(amount.amount));
    }
    // BigDecimal type SUBTRACT()
    public Money minus(Money amount){
        return new Money(this.amount.subtract(amount.amount));
    }
    
    public Money times(double percent){
        return new Money(this.amount.multiply(BigDecimal.valueOf(percent)));
    }
    public boolean isLessThan(Money other){
        return this.amount.compareTo(other.amount) < 0;
    }
    public boolean isGreaterThanOrEqual(Money other){
        return this.amount.compareTo(other.amount) >= 0;
    }
}
