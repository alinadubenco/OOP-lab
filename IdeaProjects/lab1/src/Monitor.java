public class Monitor {
   String color;
   int dimension1;
   int dimension2;
   int resolution1;
   int resolution2;

   public void compareDimensions(Monitor o1, Monitor o2) {
      if (o1.dimension1 > o2.dimension1)
         System.out.println("First object has bigger dimensions");
      else
         System.out.println("Second object has bigger dimensions");

   }
   public void compareSolution(Monitor o1, Monitor o2) {
      if (o1.resolution1 > o2.resolution1)
         System.out.println("First object has bigger resolution");
      else
         System.out.println("Second object has bigger resolution");

   }
}
