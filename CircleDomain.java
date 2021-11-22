package oop;

public class CircleDomain {
    private float divisor;
    private int incremental;
    private int ballStartingPosition;
    private String ballPosition;

    public float getDivisor(){
        return divisor;
    }
    public void setDivisor(float divisor){
        this.divisor =  divisor;
    }

    public int getIncrement(){
        return incremental;
    }

    public int setIncrement(int incremental){
        return this.incremental = incremental;
    }
    public int getBallStartingPosition(){
        return ballStartingPosition;
    }
    public int setBallStartingPosition(int ballStartingPosition){
        return this.ballStartingPosition = ballStartingPosition;
    }

    public void setBallPosition(String ballPosition){
        this.ballPosition = ballPosition;
    }
    public String getBallPosition(){
        return this.ballPosition;
    }


}
