package hospital;

public class Patient {
    private String name;
    private String sex;

    public Patient(String name, String sex)
    {
        this.name = name;
        this.sex = sex;

    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }
}
