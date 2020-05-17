package test.decorator.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class EyeglassDecorator implements EyeglassFoundation {
    protected EyeglassFoundation eyeglass;
}
