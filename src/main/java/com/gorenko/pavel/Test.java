package com.gorenko.pavel;

import org.apache.log4j.Logger;

public class Test {

    final static Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        Hobby hobby1 = new Hobby();
        System.out.println(hobby1);
        Hobby hobby2 = new Hobby(10, 3.14f);
        System.out.println(hobby2);
        Hobby hobby3 = new Hobby((byte)127, (short)1000, '\u0061', 10, 85967L, 123456.89f, 12345678910.23d, true);
        System.out.println(hobby3);
        Test test = new Test();
        test.logMethod("parameter");
    }

    public void logMethod(String parameter) {
        if(logger.isDebugEnabled())
            logger.debug("Debug mode " + parameter);

        if(logger.isInfoEnabled())
            logger.info("Info mode " + parameter);

        logger.error("Error mode: " + parameter);

    }
}
