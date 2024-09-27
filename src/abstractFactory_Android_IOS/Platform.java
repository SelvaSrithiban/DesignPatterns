package abstractFactory_Android_IOS;

public abstract class Platform {
    
    abstract UIComponentFactory createUIComponent();

    public static Platform createPlatform(String platform){

        if(platform.equals("Android")){
            return new Android();
        }else if(platform.equals("IOS")){
            return new IOS();
        }
        return null;
    }
}
