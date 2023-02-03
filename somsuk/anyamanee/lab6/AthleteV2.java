package somsuk.anyamanee.lab6;

import somsuk.anyamanee.lab5.Athlete;

public class AthleteV2 extends Athlete {
    public AthleteV2(String name, Double weight, Double height, Gender gender, String nationality, String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
    }

    public void practice() {
        System.out.println(name + " runs for 10 km");
    }
}

class BadmintonPlayerV2 extends AthleteV2 {

    public BadmintonPlayerV2(String name, double weight, Double height, Gender gender, String nationality,
            String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);

    }

    @Override
    public void practice() {
        super.practice();
        System.out.println(name + " runs for 10 km and plays half court singles");
    }

}

class BoxerV2 extends AthleteV2 {

    public BoxerV2(String name, Double weight, Double height, Gender gender, String nationality, String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
    }

    @Override
    public void practice() {
        System.out.println(name + " runs for 10 km and swings arms");
    }
}

class FootballerV2 extends AthleteV2 {

    public FootballerV2(String name, Double weight, Double height, Gender gender, String nationality,
            String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
    }

    @Override
    public void practice() {
        System.out.println(name + " runs for 10 km and catches  football");
    }

}
