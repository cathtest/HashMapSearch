public class Passport {


    public String type;
    public int number;

    public Passport(String type, Integer number) {

        this.type = type;
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public int getNumber() {
        return number;

    }


    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Passport)) {
            return false;
        }


        Passport passport = (Passport) o;

        return passport.type.equals(type) &&
                passport.number == number;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + type.hashCode();
        result = 31 * result + number;
        return result;
    }
}
