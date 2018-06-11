public class Person {

    public String name;
    public String surname;
    public String email;


    public void addPerson() {


        String g = getName().concat(getSurname()).concat(getEmail());
        System.out.println (g);
    }


    public Person (String name, String surname, String email){

        this.name = name;
        this.surname = surname;
        this.email = email;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;

    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname=surname;

    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email=email;

    }

    @Override
    public int hashCode() {

        Passport p = new Passport("RT", 321654);
        int result = 17;
        result = 31 * result + p.type.hashCode();
        result = 31 * result + p.number;
        return result;
    }



}