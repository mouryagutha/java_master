public class Pattern {
    public static void main(String[] args) {

        pattern1(5);

        System.out.println( );
//        pattern2(5);
        pattern3(5);
    }
        static void pattern1(int n )
        {
            for(int i =0; i<=n;i++)
            {
                for(int j=1; j<=i;j++)
                {
                    System.out.print("*");
                    
                }
                System.out.println( );
            }
        }



//    static void pattern2(int n )
//    {
//        for(int i =0; i<=n;i--)
//        {
//            for(int j=n; j<=i-1;j++)
//            {
//                System.out.print("*");
//
//            }
//            System.out.println( );
//        }
//    }

    static void pattern3(int n )
    {
        for(int i =n; i>=1; --i)
        {
            for(int j=1; j<=i;++j)
            {
                System.out.print("*");

            }
            System.out.println( );
        }
    }


}