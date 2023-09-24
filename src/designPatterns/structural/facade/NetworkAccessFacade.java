package src.designPatterns.structural.facade;

public class NetworkAccessFacade {
    private Comm comm =new Comm();
    private Cache cache = new Cache();
    private Interceptor interceptor = new Interceptor();
    private Convertor conv = new Convertor();

    public void communicate() {
        cache.cache();
        comm.send("some data");
        comm.receive();
        interceptor.intercept();
        conv.convert();
    }
}
