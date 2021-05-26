package at.technikumwien.backendSystem.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Envelope", namespace = "s")
public class Envelope {
    private static final long serialVersionUID = 25L;

    @JacksonXmlProperty(localName = "Body", namespace = "s")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Body body = new Body();

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
