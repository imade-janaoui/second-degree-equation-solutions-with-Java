public class Main {

        static void Equation(float a,float b, float c){
            float detat = (b*b) - (4 * a * c);
            float solu1,solu2,squar= (float) Math.sqrt(detat);

            if (detat>0){
                System.out.println("This equation accepts two solutions");
                solu1=(-b+squar)/2*a;
                solu2=(-b-squar)/2*a;
                System.out.println("solution one is:"+solu1);
                System.out.println("solution two is:"+solu2);
            }else if (detat==0){
                System.out.println("This equation accepts one solution");
                solu1=(-b)/2*a;
                System.out.println("solution one is:"+solu1);
            }else {
                System.out.println("This equation does not accept any solution in a group R");
            }

        }
        public static void main(String arg[]) {
            Equation(2,4,1);

        }
}
