public class Person {
    private String firstName;
    private String lastName;
    private String ID;
    private String title;
    private int YOB;

    public Person(String firstName, String lastName, String ID, String title, int YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toCSV() {
        return firstName + "," + lastName + "," + ID + "," + title + "," + YOB;
    }

    public String toXML() {
        return "<Person><FirstName>" + firstName + "</FirstName><LastName>" + lastName + "</LastName><ID>" + ID + "</ID><Title>" + title + "</Title><YOB>" + YOB + "</YOB></Person>";
    }

    public String toJSON() {
        return "{ \"firstName\": \"" + firstName + "\", \"lastName\": \"" + lastName + "\", \"ID\": \"" + ID + "\", \"title\": \"" + title + "\", \"YOB\": " + YOB + " }";
    }
}
