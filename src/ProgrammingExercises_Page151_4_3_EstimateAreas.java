
public class ProgrammingExercises_Page151_4_3_EstimateAreas {
    public static void main(String[] args) {

        // 1. Convert degrees to radians

        // Atlanta, Georgia
        double x1 = Math.toRadians(33.7489954);
        double y1 = Math.toRadians(-84.3879824);

        // Orlando, Florida
        double x2 = Math.toRadians(28.5383355);
        double y2 = Math.toRadians(-81.37923649999999);

        // Savannah, Georgia
        double x3 = Math.toRadians(32.0808989);
        double y3 = Math.toRadians(-81.09120300000001);

        // Charlotte, North Carolina
        double x4 = Math.toRadians(35.2270869);
        double y4 = Math.toRadians(-80.84312669999997);

        // The average earth radius is 6,371.01 km
        double radius = 6371.01;

        // 2. Make 2 triangles by calculating the 4 distances between points & 1 diagonal distance (all in km)

        // Making the polygon into a triangle 1
        // Atlanta to Orlando
        double d1 = radius * Math.acos((Math.sin(x1)) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        // Orlando to Savannah
        double d2 = radius * Math.acos((Math.sin(x2)) * Math.sin(x3) + Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3));
        // Savannah to Atlanta
        double d3 = radius * Math.acos((Math.sin(x1)) * Math.sin(x3) + Math.cos(x1) * Math.cos(x3) * Math.cos(y1 - y3));

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        // Making the polygon into a triangle 2
        // Atlanta to Charlotte
        double d4 = radius * Math.acos((Math.sin(x1)) * Math.sin(x4) + Math.cos(x1) * Math.cos(x4) * Math.cos(y1 - y4));
        // Charlotte to Savannah
        double d5 = radius * Math.acos((Math.sin(x4)) * Math.sin(x3) + Math.cos(x4) * Math.cos(x3) * Math.cos(y4 - y3));
        // Savannah to Atlanta
        // Se d3

        System.out.println(d4);
        System.out.println(d5);

        // 3. Calculate the areas of the 2 triangles and add them  up

        // Area of triangle 1
        double s1 = (d1 + d2 + d3) / 2;
        double area1 = Math.sqrt(s1 * (s1 - d1) * (s1 - d2) * (s1 - d3));


        // Area of triangle 2
        double s2 = (d3 + d4 + d5) / 2;
        double area2 = Math.sqrt(s2 * (s2 - d3) * (s2 - d4) * (s2 - d5));


        System.out.println("The estimated area enclosed by the four cities is " + (area1 + area2) + " km2");

        // Resultat: 118,173.01 km2

        // https://www.daftlogic.com/projects-google-maps-area-calculator-tool.htm#
        // Denne hjemmesides resultat: 116,408.60 km²

    }

}
