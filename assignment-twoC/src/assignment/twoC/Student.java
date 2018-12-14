package assignment.twoC;


    public class Student extends Person {
        private String program;
        private int year;
        private double fee;

        public Student(String name, String adress, String program, int year, double fee) {
            super(name, adress);
            this.program=program;
            this.year=year;
            this.fee=fee;
        }

        public String getProgram()
        {
            return this.program;
        }
        public void setProgram(String program)
        {
            this.program=program;
        }

        public int getYear()
        {
            return year;
        }

        public void setYear()
        {
            this.year=year;
        }
        public double getFee()
        {
            return fee;
        }
        public void setFee()
        {
            this.fee=fee;
        }

        public String toString()
        {
            return "student[person[name" + getName() + ",adress" + getProgram() + ", program " + getProgram() + ", year " + getYear()+ ", fee " + getFee() +"]";

        }



    }
