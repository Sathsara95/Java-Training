public class Customer {
    private final String medicalReport;
    private final String carTraining;
    private final String bikeTraining;
    private final String threewheelerTraining;

    public Customer(Builder builder) {
        this.medicalReport= builder.medicalReport;
        this.carTraining= builder.carTraining;
        this.bikeTraining= builder.bikeTraining;
        this.threewheelerTraining=builder.threewhelerTraining;
    }


    static class Builder{
        private String medicalReport;
        private String carTraining;
        private String bikeTraining;
        private String threewhelerTraining;


        public Customer build(){
            return new Customer(this);
        }

        public Builder(String medicalReport){
            this.medicalReport=medicalReport;
        }


        public Builder carTraining(String carTraining){
            this.carTraining=carTraining;
            return this;
        }

        public  Builder bikeTraining(String bikeTraining){
            this.bikeTraining=bikeTraining;
            return this;
        }
        public  Builder threewheelerTraining(String threewhelerTraining){
            this.threewhelerTraining=threewhelerTraining;
            return this;
        }

    }

    @Override
    public String toString() {
        return "Customer{" +
                "medicalReport='" + medicalReport + '\'' +
                ", carTraining='" + carTraining + '\'' +
                ", bikeTraining='" + bikeTraining + '\'' +
                ", threewheelerTraining='" + threewheelerTraining + '\'' +
                '}';
    }
}
