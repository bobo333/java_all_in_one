public class AbstractFactoryApp {
    public static void main(String[] args) {
        String choice = "Baseball";
        Ball b1 = BallFactory.getBall(choice);

        choice = "Softball";
        Ball b2 = BallFactory.getBall(choice);

        /*
            Note: if these weren't cast from Ball to Baseball, it would complain that it
            can't find the field type_of_object.
        */

        System.out.println("b1 type: " + ((Baseball)b1).type_of_object);
        System.out.println("b1 original type: " + b1.original_type_of_object);

        System.out.println("b2 type: " + ((Softball)b2).type_of_object);
        System.out.println("b2 original type: " + b2.original_type_of_object);
    }
}

class BallFactory {
    public static Ball getBall(String s) {
        if (s.equalsIgnoreCase("Baseball"))
            return new Baseball();
        if (s.equalsIgnoreCase("Softball"))
            return new Softball();
        else
            return null;
    }
}

class Ball {
    public String original_type_of_object = "Ball";
}

class Baseball extends Ball {
    public String type_of_object = "Baseball";
}

class Softball extends Ball {
    public String type_of_object = "Softball";
}