package test.decorator.model;

public class PhotochromicDecorator extends EyeglassDecorator {
    public PhotochromicDecorator(EyeglassFoundation eyeglassFoundation) {
        this.eyeglass = eyeglassFoundation;
    }

    @Override
    public String getName() {
        return eyeglass.getName() + " - PL-Rx";
    }

    @Override
    public String showFunction() {
        return eyeglass.showFunction() + " - Photochromic";
    }
}
