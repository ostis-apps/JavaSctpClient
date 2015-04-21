package by.ostis.common.sctpclientIT.entry;

import by.ostis.common.sctpclientIT.test.TestPackage;
import by.ostis.common.sctpclientIT.test.testpackages.DeafaultTestPackage;

/**
 * @author Andrew Nepogoda Feb 15, 2015
 */
public class TestEntryPoint {

    public static void main(final String[] args) {

        final TestPackage package1 = new DeafaultTestPackage(
                "default test package");
        package1.runTestPackage();
    }

}