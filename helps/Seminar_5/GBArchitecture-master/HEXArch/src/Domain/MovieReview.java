package src.Domain;
// класс для (формы) отзывов  p.s. я бы запихнул эту форму в скуль(maria, postgresql)
public class MovieReview {
    String movieName;
    double movieScore;
    String remark;
    //конструктор
    public MovieReview(String s, double v, String excellent) {
        this.movieName = s;
        this.movieScore = v;
        this.remark = excellent;
    }
    // переопределили toString() для получения оценки и ремарки(excellent)
    @Override
    public String toString() {
        return  " " +movieScore +" "+ remark;
    }
}
