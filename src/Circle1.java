public class Circle1 {
        private int id;
        private double radius;
        public static  double PI =3.14;
        private static int IDIncrement;
        public Circle1 (int id, double radius){
            this.id = IDIncrement ;
            this.radius = radius;
            IDIncrement++;
        }
        public int getID(){
            return id;
        }

        public double getRadius(){
            return radius;
        }

        public void setID (int id){
            this.id= id;
        }
        public void setRadius(double radius){
            this.radius= radius;

        }
        class Main {
            public static void main(String[] args) {
                Circle1 circle1 = new Circle1(5,5);
                System.out.println();
                Circle1 circle2 = new Circle1(6,7);
                Circle1 circle3 = new Circle1(8,9);


            }
        }
        }

