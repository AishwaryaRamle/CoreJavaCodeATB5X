package src.OOPS_21_JAN_2024.LIST_C;

import java.util.Comparator;

class SortIdAsc implements Comparator<Students>{
    @Override
    public int compare(Students o1, Students o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}
class SortIdDesc implements Comparator<Students>{

    @Override
    public int compare(Students o1, Students o2) {
        return Integer.compare(o2.getId(),o1.getId());
    }
}

class SortByName implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortByNameDesc implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        return o2.getName().compareTo(o1.getName());
    }
}

public class Students implements Comparable<Students> {
    public Students(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    Integer id;
    String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Students o) {
//        return Integer.compare(this.id,o.id);
//    }

    @Override
    public int compareTo(Students o) {
        return CharSequence.compare(this.name,o.name);
       // return this.name.compareTo(o.name); //For String Comparison we use compareTo

    }
}


