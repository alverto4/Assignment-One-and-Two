package assignment.twoC;

    public class Person {
        private String name;
        private String adress;

        public Person(String name, String adress)
        {
            this.name=name;
            this.adress=adress;

        }
        public String getName() {
            return name;
        }

        public String getAdress()
        {
            return adress;
        }

        public void setAdress(String adress)
        {
            this.adress = adress;
        }

        public String toString()
        {
            return "[person name:" + name +",adress " + adress + "]";

        }

    }

