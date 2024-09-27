package simpleFactory;

public class AndroidUIComponentFactory implements UIComponentFactory{

    @Override
    public Button createButton() {
        // TODO Auto-generated method stub
        return new AndroidButton();
    }

    @Override
    public DropDown createDropdown() {
        // TODO Auto-generated method stub
        return new AndroidDropDown();
    }
    
}
