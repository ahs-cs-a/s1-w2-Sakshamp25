public class BodyOfWaterMain {

    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Indian Ocean", 500, 14.8, true);
        BodyOfWater b1 = new BodyOfWater("Pacific Ocean", 300, 18.3, false );

        b.setName("Indian Ocean");
        b.setlargestDiameter(500);
        b.setavgDepth(14.8);
        b.setisSaltWater(true);

        System.out.println(b.getName());
        System.out.println(b.getLargestDiameter());
        System.out.println(b.getAvgDepth());
        System.out.println(b.getIsSaltWater());

        System.out.println(b1.getName());
        System.out.println(b1.getLargestDiameter());
        System.out.println(b1.getAvgDepth());
        System.out.println(b1.getIsSaltWater());
    }
}
