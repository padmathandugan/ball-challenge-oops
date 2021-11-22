import oop.CircleDomain;
import oop.ProcessingBalls;
import oop.ProcessingBallsImpl;
import oop.SketchConstants;
import processing.core.PApplet;

import java.util.ArrayList;


public class TryProcessingOOP extends PApplet {
    int a =0;
    int b =0;
    int c =0;
    int d =0;
    public static void main(String[] args) {
        String[] processingArgs = {"TryProcessingOOP"};
        PApplet.main("TryProcessingOOP", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(SketchConstants.WIDTH, SketchConstants.HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw(){
        ProcessingBalls processingBalls = new ProcessingBallsImpl(this, a, b, c, d);
        ArrayList<CircleDomain> circleDomainList = processingBalls.drawBall();
        for( CircleDomain circleDomian : circleDomainList){
            drawCircle(circleDomian);
        }

    }

    private void drawCircle(CircleDomain circleDomian) {
           if(circleDomian.getBallPosition() == SketchConstants.FIRST_BALL){
                a++;
            }else if(circleDomian.getBallPosition() == SketchConstants.SECOND_BALL){
                b+=2;
            }else if(circleDomian.getBallPosition() == SketchConstants.THIRD_BALL){
                c+=3;
            }else if(circleDomian.getBallPosition() == SketchConstants.FOURTH_BALL){
                d+=4;
            }
        }

}