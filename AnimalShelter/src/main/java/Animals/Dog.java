package Animals;


import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Dog extends Animal {
    public Date LastWalk;
    Date dateNow = new Date();

    public Date getLastWalk(){
        return LastWalk;
    }

    private void setLastWalk(Date date){
        this.LastWalk = date;
    }

    public boolean NeedsWalk(){
        long differenceMillSec = Math.abs(dateNow.getTime() - this.LastWalk.getTime());
        long differenceDays = TimeUnit.DAYS.convert(differenceMillSec, TimeUnit.MILLISECONDS);

        return (differenceDays > 0);
    }

    public Dog(String name, Gender gender){
        super(name, gender);
        Date date = new Date();
        this.LastWalk = date;
    }

    // return base.ToString() + $", last walk: {this.LastWalk.ToShortDateString()}";
    @Override
    public String toString() {
        return super.toString() + ", last walk: " + getLastWalk().toString();
    }
}
