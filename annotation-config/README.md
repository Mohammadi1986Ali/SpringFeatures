# Annotation Config

Note that both the @PostConstruct and @PreDestroy annotations are part of Java EE.
Since Java EE was deprecated in Java 9, and removed in Java 11, we have to add an additional dependency to use these annotations:

    <dependency>
        <groupId>javax.annotation</groupId>
        <artifactId>javax.annotation-api</artifactId>
        <version>1.3.2</version>
    </dependency>

