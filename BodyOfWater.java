public class BodyOfWater {
    private String name;
    private double largestDiameter;
    private double avgDepth;
    private boolean isSaltWater;

    public BodyOfWater(String n, double ldm, double avd, boolean isw){
        name = n;
        largestDiameter = ldm;
        avgDepth = avd;
        isSaltWater = isw;
    }
    
    public BodyOfWater(String n, double avd){
        name = n;
        avgDepth = avd;
    }
    
    public void setName(String n){
        name = n;
    }

    public void setlargestDiameter(double ldm){
        largestDiameter = ldm;
    }

    public void setavgDepth(double avd){
        avgDepth = avd;
    }

    public void setisSaltWater(boolean isw){
        isSaltWater = isw;
    }

    public String getName(){
        return name;
    }
    
    public double getLargestDiameter(){
        return largestDiameter;
    }

    public double getAvgDepth(){
        return avgDepth;
    }

    public boolean getIsSaltWater(){
        return isSaltWater;
    }
}


