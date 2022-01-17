package tutorials;

import javax.swing.plaf.synth.SynthOptionPaneUI;

interface Drawable{
    void draw();

}

class DrawableImpl implements Drawable{

    @Override
    public void draw() {
        System.out.println("drawing");

    }
}
public class LambdaExample {
    public static void main(String[] args) {

       /*
       //creation anonymous class and initialiser
       Drawable drawable=new Drawable() {
            @Override
            public void draw() {
                System.out.println("drawing..........");

            }
        };*/

        //using lambdas to create anounymous class and overrid metohd
        Drawable drawable=()-> System.out.println("drawing ********************");
        drawable.draw();

    }
}
