package simpleFactory;

public class IOSUIComponentFactory implements UIComponentFactory{

    @Override
    public Button createButton() {
        // TODO Auto-generated method stub
        return new IOSButton();
    }

    @Override
    public DropDown createDropdown() {
        // TODO Auto-generated method stub
        return new IOSDropDown();
    }
    
}
