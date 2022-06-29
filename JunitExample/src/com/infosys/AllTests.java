package com.infosys;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({LoanTest.class,SumTest.class,VoterValidatorTest.class})
//@ExcludeTags("dev")
//@IncludePackages("com.infy") 
public class AllTests {

}
