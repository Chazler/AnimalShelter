package Animals;

import java.util.Date;

public class Animal {
    public String Name;
    public Gender Gender;
    public Reservor ReservedBy;

    public String getName() {
        return Name;
    }

    private void setName(String name){
        this.Name = name;
    }

    public Gender getGender() {
        return Gender;
    }

    private void setGender(Gender gender){
        this.Gender = gender;
    }

    public Reservor getReservedBy() {
        return ReservedBy;
    }

    private void setReservedBy(Reservor reservedBy){
        this.ReservedBy = reservedBy;
    }

    //Factory create animal(dog/cat)
    public Animal(String name, Gender gender){
        this.Name = name;
        this.Gender = gender;
    }

    public boolean Reserve(String reservedBy){
        if (this.getReservedBy() == null){
            Date date = new Date();
            this.ReservedBy= new Reservor(reservedBy, date);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String reserved = "not reserved";
        if (getReservedBy() != null){
            reserved = "reserved by " + this.getReservedBy().getName();
        }
        return this.Name + ", " + this.Gender + ", " + reserved;
    }
}
