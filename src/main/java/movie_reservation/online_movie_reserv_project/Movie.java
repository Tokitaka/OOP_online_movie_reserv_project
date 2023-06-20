package movie_reservation.online_movie_reserv_project;

import java.time.Duration;

public class Movie {
    private String title;
    private Duration runningTime;
    private Long fee;
    
    public Movie(String title, Duration runningTime, Long fee){
    	this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
    }
    // 1인당 예매요금
    public Money caculateMovieFee(){}
}
