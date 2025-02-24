package Lists.entities;



    public class Employee {
        private final Integer id;
        private String name;
        private Double salary;

        public Employee(int id) {
            this.id = id;
        }

        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public void increaseSalary(double percentage) {
            if (percentage > 0) {
                salary += salary*(percentage/100);
            } else {
                System.out.println("Percentage must be positive!");
            }


        }

        @Override
        public String toString() {
            return id + ", " + name + ", " + String.format("%.2f" , salary);
        }
    }


