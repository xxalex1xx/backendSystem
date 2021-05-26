package at.technikumwien.backendSystem.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Body", namespace = "s")
public class Body {
    private static final long serialVersionUID = 25L;

    @JacksonXmlProperty(localName = "Orders")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Orders orders = new Orders();

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }
}
