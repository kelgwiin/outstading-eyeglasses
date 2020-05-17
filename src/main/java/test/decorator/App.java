package test.decorator;

import lombok.extern.java.Log;
import test.decorator.model.*;

@Log
public class App {
    public static void main(String[] args) {
        EyeglassFoundation correctiveEyeglass = new CorrectiveEyeglass();
        log.info(correctiveEyeglass.getName());
        log.info(correctiveEyeglass.showFunction());

        // Corrective + AntiGlare
        EyeglassDecorator antiGlareDecorator = new AntiGlareDecorator(correctiveEyeglass);
        log.info(antiGlareDecorator.getName());
        log.info(antiGlareDecorator.showFunction());

        // Corrective + AntiGlare + Photochromic
        PhotochromicDecorator photochromicDecorator = new PhotochromicDecorator(antiGlareDecorator);
        log.info(photochromicDecorator.getName());
        log.info(photochromicDecorator.showFunction());

    }
}
