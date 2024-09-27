package abstractFactory_Android_IOS;

public class IOS extends Platform{

    @Override
    UIComponentFactory createUIComponent() {
        // TODO Auto-generated method stub
        return new IOSUIComponentFactory();
    }
    
}
