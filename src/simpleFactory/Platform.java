package simpleFactory;

public abstract class Platform {
    
    abstract UIComponentFactory createUIComponent();

    public static Platform createPlatform(String platform){

        return PlatformFactory.createPlatformByName(platform);
    }
}
