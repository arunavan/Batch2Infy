package com.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({VoterValidatorTest.class,RepeatingTest.class,LoanTest.class})
public class AllTests {

}
