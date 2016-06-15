package fit;

import org.junit.runner.RunWith;

import com.googlecode.refit.junit.DefaultFitConfiguration;
import com.googlecode.refit.junit.FitConfiguration;
import com.googlecode.refit.junit.FitSuite;

@RunWith(FitSuite.class)
@FitConfiguration(FitWithRefitTest.Configuration.class)
public class FitWithRefitTest {

    public static class Configuration extends DefaultFitConfiguration {

        @Override
        public String getInputDir() {
            return "src/test/java/fit";
        }

        @Override
        public String getOutputDir() {
            return "src/test/java/fit-results";
        }

        @Override
        public String[] getIncludes() {
            return new String[]{"**/*.html"};
        }

    }
}
