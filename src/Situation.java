
public class Situation {
    Situation[] direction;
    String text;
    int dh;
    int dk;

    public Situation(String text, int dk, int dh, int var){
        this.text = text;
        this.dk = dk;
        this.dh = dh;
        direction = new Situation[var];
    }

}