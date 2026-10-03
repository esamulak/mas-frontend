package pl.es8it.mas.frontend.pages;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MainPage extends VerticalLayout {

    public MainPage() {
        add(new H1("MAS"));
    }
}
