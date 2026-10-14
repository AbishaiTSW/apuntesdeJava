public class temperatura {
        public static void main(String[] args) {
        System.out.println ("F°,  °C");
        for (double f = 50.0 ; f<= 400.0 ; f+=50.0) {
            double c = ( f - 32 ) * 5 / 9.0;
            System.out.println (f + "  " + c );
        }  
    }
}
