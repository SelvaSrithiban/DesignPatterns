package simpleFactory;

public class IOS extends Platform{

    @Override
    UIComponentFactory createUIComponent() {
        // TODO Auto-generated method stub
        return new IOSUIComponentFactory();
    }
    
}
