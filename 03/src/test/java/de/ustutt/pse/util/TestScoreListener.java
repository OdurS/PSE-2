package de.ustutt.pse.util;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class TestScoreListener implements TestWatcher {

    private void makeResult(ExtensionContext context, boolean success) {
        // Check if the test method has the TestScore annotation
        if (context.getTestMethod().isPresent()) {
            var testMethod = context.getTestMethod().get();
            int max = 1;
            if (testMethod.isAnnotationPresent(TestScore.class)) {
                TestScore scoreAnnotation = testMethod.getAnnotation(TestScore.class);
                max = scoreAnnotation.value();
            }
            int achieved = success ? max : 0;
            System.out.println("##" + testMethod.getName() + ": " + achieved + "/" + max);
        }
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        makeResult(context, true);
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        makeResult(context, false);
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        makeResult(context, false);
    }

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        // No score printed if the test was disabled
    }
}
