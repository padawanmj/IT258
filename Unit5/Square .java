public class Square {

 

        int length = 20;

        int width = 20;

        int height = 20;

                public int getVolume() 
                {

                        return (length * width * height);

                }

                public static void main(String[]      args) 
                {

                                Square squareObj();      // Creates a Square Reference

                                squareObj = new Square();      // Creates an Object of Square

                                System.out.println("Volume of Square is : " + squareObj.getVolume());

                }

}