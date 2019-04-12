package objectorientedprogramming;

public class NameRollDisplayer {

    public class NameRoll {

        int roll;
        String name;

        public NameRoll(String n, int r) {
            name = n;
            roll = r;
            //End of the Constructor
        }

        void nameDisplay() {
            System.out.println("Name = " + name + ", " + "Roll No: " + roll);

            //End of the method
        }
    }

    public void NameAndRoll() {

        NameRoll ob = new NameRoll("Shuvongkor", 38);

        ob.nameDisplay();

    }

}
