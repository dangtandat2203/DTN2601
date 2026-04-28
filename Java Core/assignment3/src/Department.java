import java.util.Arrays;

public class Department implements Comparable<Department> {
    private int id;
    private String name;
    private String address;

    public Department() {}

    public Department(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    @Override
    public String toString() {
        return "Department{id=" + id + ", name='" + name + "', address='" + address + "'}";
    }

    // Two departments are equal when their names are equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department other = (Department) o;
        return name != null && name.equals(other.name);
    }

    // Default sort: case-insensitive alphabetical (used in Q6)
    @Override
    public int compareTo(Department other) {
        return this.name.compareToIgnoreCase(other.name);
    }
}
