package test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

@PrepareForTest(Class2.class)
@RunWith(PowerMockRunner.class)
public class Class1Test {

    @Test
    public void testMethod1WithPowermock() {
        mockStatic(Class2.class);
        when(Class2.getString()).thenThrow(new RuntimeException());
        new Class1().method1();
    }

}