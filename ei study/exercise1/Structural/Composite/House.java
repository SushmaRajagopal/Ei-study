
import java.util.ArrayList;
import java.util.List;

public class House implements HouseComponent {
    private List<HouseComponent> components = new ArrayList<>();

    public void addComponent(HouseComponent component) {
        components.add(component);
    }

    @Override
    public void showDetails() {
        for (HouseComponent component : components) {
            component.showDetails();
        }
    }
}
