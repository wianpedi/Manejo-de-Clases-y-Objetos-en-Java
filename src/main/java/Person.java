import java.util.Date;

public class Person {
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBrith;
    public float height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public Date getDateBrith() {
        return dateBrith;
    }

    public void setDateBrith(Date dateBrith) {
        this.dateBrith = dateBrith;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
