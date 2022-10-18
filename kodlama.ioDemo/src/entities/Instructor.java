package entities;

public class Instructor {
    public Instructor(int id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }

    private int id;
    private String name;
    private String branch;

    public Instructor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
