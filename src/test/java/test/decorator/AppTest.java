package test.decorator;

import org.junit.Before;
import org.junit.Test;
import test.decorator.model.*;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @author Kelwin Gamez - kelgwiin
 */
public class AppTest {
    EyeglassFoundation correctiveEyeglass;

    @Before
    public void init() {
        correctiveEyeglass = new CorrectiveEyeglass();
    }

    @Test
    public void itShouldCreateCorrectiveLens() {
        assertThat(correctiveEyeglass.getName(), equalTo("CG-01"));
        assertThat(correctiveEyeglass.showFunction(), equalTo("Corrective Lens"));
    }

    @Test
    public void itShouldCreateCorrectiveLensPlusAntiGlare() {
        EyeglassDecorator antiGlareDecorator = new AntiGlareDecorator(correctiveEyeglass);
        assertThat(antiGlareDecorator.getName(), equalTo("CG-01 - AG"));
        assertThat(antiGlareDecorator.showFunction(), equalTo("Corrective Lens - AntiGlare Coating Lens"));
    }

    @Test
    public void itShouldCreateCorrectiveLensPlusAntiGlarePlusPhotochromic() {
        EyeglassDecorator antiGlareDecorator = new AntiGlareDecorator(correctiveEyeglass);
        PhotochromicDecorator photochromicDecorator = new PhotochromicDecorator(antiGlareDecorator);
        assertThat(photochromicDecorator.getName(), equalTo("CG-01 - AG - PL-Rx"));
        assertThat(photochromicDecorator.showFunction(), equalTo("Corrective Lens - AntiGlare Coating Lens - Photochromic"));
    }

    @Test
    public void itShouldCreateCorrectiveLensPlusPhotochromic() {
        PhotochromicDecorator photochromicDecorator = new PhotochromicDecorator(correctiveEyeglass);
        assertThat(photochromicDecorator.getName(), equalTo("CG-01 - PL-Rx"));
        assertThat(photochromicDecorator.showFunction(), equalTo("Corrective Lens - Photochromic"));
    }

    @Test
    public void itShouldCreateRegularGlassesPlusPhotochromic() {
        EyeglassFoundation eyeglass = new Eyeglass();

        PhotochromicDecorator photochromicDecorator = new PhotochromicDecorator(eyeglass);
        assertThat(photochromicDecorator.getName(), equalTo("RE - PL-Rx"));
        assertThat(photochromicDecorator.showFunction(), equalTo("Only Glasses - Photochromic"));
    }

}
