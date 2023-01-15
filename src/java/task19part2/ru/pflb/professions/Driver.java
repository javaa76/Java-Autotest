package task19part2.ru.pflb.professions;

import task19part2.ru.pflb.Person;

public class Driver extends Person {
    protected int drivingExperience;
    protected long licenseId;
    public Driver(String name, int age, int drivingExperience, long licenseId) {
        super(name, age);
        this.drivingExperience = drivingExperience;
        this.licenseId = licenseId;
    }
    @Override
    public String toString() {
        String output = super.toString() +
                "\n - стаж: " + this.drivingExperience +
                "\n - № удостоверения: " + this.licenseId;
        return output;
    }
}
