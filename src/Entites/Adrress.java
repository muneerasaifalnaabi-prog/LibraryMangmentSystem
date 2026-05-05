package Entites;

public class Adrress {
        private String street;
        private String city;
        private String postalCode;

        public Adrress(String street, String city, String postalCode) {
                this.street = street;
                this.city = city;
                this.postalCode = postalCode;
        }

        public String getStreet() {
                return street;
        }

        public void setStreet(String street) {
                if (street==null){
                        System.out.println("Street cannot be empty.");
                }
                this.street = street;
        }

        public String getCity() {

                return city;
        }

        public void setCity(String city) {
                if (city==null){
                        System.out.println("city cannot be empty.");
                }
                this.city = city;
        }

        public String getPostalCode() {
                return postalCode;
        }

        public void setPostalCode(String postalCode) {
                this.postalCode = postalCode;
        }
}
