# Wildcard Capture #

Since the type is anonymous when using a wildcard. In order to capture this type we can perform the following 

public void foo(List<?> i) {
    fooHelper(i);
}        
private <T> void fooHelper(List<T> l) {
    // and now we can use T the type to declare, cast, etc.
}

[1] - http://www.angelikalanger.com/GenericsFAQ/FAQSections/TechnicalDetails.html#Topic8