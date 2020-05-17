package test.decorator.model;

public class Eyeglass implements EyeglassFoundation {
    @Override
    public String getName() {
        return "RE";
    }

    @Override
    public String showFunction() {
        return "Only Glasses";
    }
}
