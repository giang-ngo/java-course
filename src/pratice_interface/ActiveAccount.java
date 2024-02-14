package pratice_interface;

public class ActiveAccount extends Account {
    private boolean active;//trạng thái hoạt động

    public ActiveAccount() {
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
