package abstractFactory_Android_IOS;

public class Android extends Platform {

    @Override
    UIComponentFactory createUIComponent() {
        // TODO Auto-generated method stub
        return new AndroidUIComponentFactory();
    }
    
}
