module dev.vinca.springboot.jigsaw.persistence {
    requires java.annotation;
    requires spring.beans;
    requires spring.context;
    requires spring.data.commons;
    requires spring.data.mongodb;

    exports dev.vinca.springbootjigsaw.learn.animals.bird;
}