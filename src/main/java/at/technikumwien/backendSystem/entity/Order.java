package at.technikumwien.backendSystem.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "order_table")
@JacksonXmlRootElement(localName = "Order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @JacksonXmlProperty(localName = "order_no_x005D_")
    private long orderNo;

    @JacksonXmlProperty
    private String order_date;

    @JacksonXmlProperty
    private String ship_to_name;

    @JacksonXmlProperty
    private String ship_to_address_1;

    @JacksonXmlProperty
    private String ship_to_city;

    @JacksonXmlProperty
    private String ship_to_state;

    @JacksonXmlProperty
    private String ship_to_ZIP;

    @JacksonXmlProperty
    private String ship_to_country;

    @JacksonXmlProperty
    private String ship_to_email;

    @JacksonXmlProperty
    private String ship_to_phone;

    @JacksonXmlProperty
    private String ship_to_company_name;

    @JacksonXmlProperty
    private String sku;

    @JacksonXmlProperty
    private String retailer_sku;

    @JacksonXmlProperty
    private int upc;

    @JacksonXmlProperty
    private int retailer_line_no;

    @JacksonXmlProperty
    private int quantity;

    @JacksonXmlProperty
    private String uom;

    @JacksonXmlProperty
    private String net_price;

    @JacksonXmlProperty
    private String currency;

    @JacksonXmlProperty
    private String delivery_date;

    @JacksonXmlProperty(localName = "vendor_no")
    private long vendorNo;

    @JacksonXmlProperty
    private Date createdAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(long orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getShip_to_name() {
        return ship_to_name;
    }

    public void setShip_to_name(String ship_to_name) {
        this.ship_to_name = ship_to_name;
    }

    public String getShip_to_address_1() {
        return ship_to_address_1;
    }

    public void setShip_to_address_1(String ship_to_address_1) {
        this.ship_to_address_1 = ship_to_address_1;
    }

    public String getShip_to_city() {
        return ship_to_city;
    }

    public void setShip_to_city(String ship_to_city) {
        this.ship_to_city = ship_to_city;
    }

    public String getShip_to_state() {
        return ship_to_state;
    }

    public void setShip_to_state(String ship_to_state) {
        this.ship_to_state = ship_to_state;
    }

    public String getShip_to_ZIP() {
        return ship_to_ZIP;
    }

    public void setShip_to_ZIP(String ship_to_ZIP) {
        this.ship_to_ZIP = ship_to_ZIP;
    }

    public String getShip_to_country() {
        return ship_to_country;
    }

    public void setShip_to_country(String ship_to_country) {
        this.ship_to_country = ship_to_country;
    }

    public String getShip_to_email() {
        return ship_to_email;
    }

    public void setShip_to_email(String ship_to_email) {
        this.ship_to_email = ship_to_email;
    }

    public String getShip_to_phone() {
        return ship_to_phone;
    }

    public void setShip_to_phone(String ship_to_phone) {
        this.ship_to_phone = ship_to_phone;
    }

    public String getShip_to_company_name() {
        return ship_to_company_name;
    }

    public void setShip_to_company_name(String ship_to_company_name) {
        this.ship_to_company_name = ship_to_company_name;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getRetailer_sku() {
        return retailer_sku;
    }

    public void setRetailer_sku(String retailer_sku) {
        this.retailer_sku = retailer_sku;
    }

    public int getUpc() {
        return upc;
    }

    public void setUpc(int upc) {
        this.upc = upc;
    }

    public int getRetailer_line_no() {
        return retailer_line_no;
    }

    public void setRetailer_line_no(int retailer_line_no) {
        this.retailer_line_no = retailer_line_no;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getNet_price() {
        return net_price;
    }

    public void setNet_price(String net_price) {
        this.net_price = net_price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDelivery_date() {
        return delivery_date;
    }

    public void setDelivery_date(String delivery_date) {
        this.delivery_date = delivery_date;
    }

    public long getVendorNo() {
        return vendorNo;
    }

    public void setVendorNo(long vendorNo) {
        this.vendorNo = vendorNo;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
