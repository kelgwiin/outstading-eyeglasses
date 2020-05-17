package test.decorator.model;

import lombok.ToString;

@ToString(doNotUseGetters = true)
public class CorrectiveEyeglass implements EyeglassFoundation {
    @Override
    public String getName() {
        return "CG-01";
    }

    @Override
    public String showFunction() {
        return "Corrective Lens";
    }
}
