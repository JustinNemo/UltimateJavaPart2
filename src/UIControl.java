public class UIControl {
    private boolean isEnabled = true;

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UIControl");
    }

    public void enabled(){
        isEnabled = true;
    }
    public void disabled(){
        isEnabled = false;
    }
    public boolean isEnabled(){
        return isEnabled;
    }
}
