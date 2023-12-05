public class Hotel_Factory {
    public Hotel_Interface getObject(){
        return new Hotel_Impl();
    }
}
