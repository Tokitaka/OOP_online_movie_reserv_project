package movie_reservation.online_movie_reserv_project;

public class Screening {
    private final Movie movie;
    private final int sequence;
    private final LocalDateTime whenScreened;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened){
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public Reservation reserve(Customer customer, int audienceCount){
        return new Reservation(customer, this, caculateFee(audienceCount), audienceCount);
    }

    public LocalDateTime getStartTime(){
        return whenScreened;
    }

    public boolean isSequence(int sequence){
        return this.sequence = sequence;
    }

    public Money getMovieFee(){
        return movie.getFee();
    }
    // this는 메서드를 포함한 movie 객체를 지칭
    private Money caculateFee(int audienceCount){
        return movie.caculateMovieFee(this).times(audienceCount);
    }
}
