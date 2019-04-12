package objectorientedprogramming;

public class NameMarksDisplayer {

    public String[] name() {
        String[] p = {"Shuman", "Shuro", "Elfen"};
        return p;
    }

    public Double[] marks() {
        Double[] ms = {40.0, 50.0, 65.5};
        return ms;
    }

    public void DIU() {

        NameMarksDisplayer obj = new NameMarksDisplayer();
        String n[] = obj.name();
        Double m[] = obj.marks();

        int ae = n.length;

        for (int i = 0; i < ae; i++) {

            System.out.println(n[i] + " " + m[i]);
        }

    }
    
}
