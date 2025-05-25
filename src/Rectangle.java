import java.util.Scanner;

public class Rectangle {


    private int Height, Width;


    public Rectangle(int h, int w) {
        this.Height = h;
        this.Width = w;


    }


    public void drawFilled() {
        drawFilled('*');

    }

    public void drawFilled(char m) {
        for (int i = 0; i < Height; i++) {
            for (int z = 0; z < Width; z++) {
                System.out.print(m);
            }
            System.out.println(" ");
        }
    }
    public void drawEmpty () {
        drawEmpty('*');
    }

    public void drawEmpty(char a) {
        for (int i = 1; i <= Height; i++) {
            if (i == 1 || i == 7) {

                for (int j = 1; j <= Width; j++) {
                    System.out.print(a);
                }
                System.out.println();
            } else {
                for (int j = 1; j <= Width; j++) {
                    if (j == 1 || j == 4) {
                        System.out.print(a);


                    } else {
                        System.out.print(" ");
                    }

                }
            }
            System.out.println();

        }


    }


    public  void readRectFromConsole(){
        Scanner ask = new Scanner(System.in);

        System.out.println("please Enter the new Height");

        this.Height = ask.nextInt();

        System.out.println("Please Enter the new Width");

        this.Width = ask.nextInt();


    }




}















