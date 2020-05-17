package test.decorator.model;

public class AntiGlareDecorator extends EyeglassDecorator {

    public AntiGlareDecorator(EyeglassFoundation eyeglass) {
        this.eyeglass = eyeglass;
    }

    @Override
    public String getName() {
        return eyeglass.getName() + " - AG";
    }

    @Override
    public String showFunction() {
        return eyeglass.showFunction() + " - AntiGlare Coating Lens";
    }
}
