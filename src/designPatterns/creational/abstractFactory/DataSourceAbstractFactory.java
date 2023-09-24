package src.designPatterns.creational.abstractFactory;

public interface DataSourceAbstractFactory {
    Service createService();
    Response createResponse();
}
