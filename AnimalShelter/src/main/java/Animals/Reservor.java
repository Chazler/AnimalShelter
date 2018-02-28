package Animals;

import java.util.Date;

public class Reservor {
    public String Name;
    public Date ReservedAt;

    public String getName() {
        return Name;
    }
    private void setName(String name){
        this.Name = name;
    }

    public Date getReservedAt() {
        return ReservedAt;
    }
    private void setReservedAt(Date date){
        this.ReservedAt = date;
    }

    public Reservor(String name, Date reservedAt){
        this.Name = name;
        this.ReservedAt = reservedAt;
    }
}
