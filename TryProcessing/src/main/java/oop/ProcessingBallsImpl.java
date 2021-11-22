package oop;

import processing.core.PApplet;

import java.util.ArrayList;

public class ProcessingBallsImpl implements ProcessingBalls{
    int x = 0;

    private PApplet pApplet;
    private int a;
    private int b;
    private int c;
    private int d;
    private int speed;


    public ProcessingBallsImpl(PApplet pApplet, int a, int b, int c, int d){
        this.pApplet = pApplet;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public ArrayList<CircleDomain> drawBall() {
        ArrayList<CircleDomain> circleDomainList = new ArrayList<>();

        for(int i = 1; i<=4;i++){
            if(i==1) {
                speed = a;
                CircleDomain circleDomain = new CircleDomain();
                System.out.println("inside first ball");
                circleDomain.setDivisor(SketchConstants.FIRST_BALL_DIST);
                circleDomain.setBallPosition(SketchConstants.FIRST_BALL);
                circleDomainList.add(circleDomain);
                pApplet.ellipse(speed, SketchConstants.HEIGHT / circleDomain.getDivisor(), 10, 10);
            }else if(i==2){
                speed = b;
                CircleDomain circleDomain = new CircleDomain();
                System.out.println("inside second ball");
                circleDomain.setDivisor(SketchConstants.SECOND_BALL_DIST);
                circleDomain.setBallPosition(SketchConstants.SECOND_BALL);
                circleDomainList.add(circleDomain);
                pApplet.ellipse(speed, SketchConstants.HEIGHT / circleDomain.getDivisor(), 10, 10);
               }else if(i == 3){
                speed = c;
                CircleDomain circleDomain = new CircleDomain();
                System.out.println("inside third ball");
                circleDomain.setDivisor(SketchConstants.THIRD_BALL_DIST);
                circleDomain.setBallPosition(SketchConstants.THIRD_BALL);
                circleDomainList.add(circleDomain);
                pApplet.ellipse(speed, SketchConstants.HEIGHT / circleDomain.getDivisor(), 10, 10);
                 }else{
                speed = d;
                CircleDomain circleDomain = new CircleDomain();
                System.out.println("inside fourth ball");
                circleDomain.setDivisor(SketchConstants.FOURTH_BALL_DIST);
                circleDomain.setBallPosition(SketchConstants.FOURTH_BALL);
                circleDomainList.add(circleDomain);
                pApplet.ellipse(speed, SketchConstants.HEIGHT / circleDomain.getDivisor(), 10, 10);
                }
        }
        return circleDomainList;

    }
}
