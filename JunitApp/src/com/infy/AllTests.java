package com.infy;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({VoterValidatorTest.class,VoterValidatorTest2.class,VoterValidatorTest4.class})
@ExcludeTags("abc")
public class AllTests {

}
